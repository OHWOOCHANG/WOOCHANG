<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="board.model.BoardVO"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	long pg = 1;
	try {
		pg = Long.parseLong(request.getParameter("pg"));
	} catch(Exception e) {}


	Connection cn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	String sql_totalcount = "select count(*) as cnt from tb_board";
	
	
	StringBuffer sql = new StringBuffer();
	sql.append(" select B.*");
	sql.append(" from (select rownum AS rnum, A.*");
	sql.append(" 	from (select no, title, name, regdate, viewcount");
	sql.append(" 		from   tb_board");
	sql.append(" 		order  by no desc) A) B");
	sql.append(" where rnum between ? and ?");
	
	int pageSize = 10;
	long startnum = (pg - 1) * pageSize + 1;
	long endnum = pg * pageSize;
	int pageCount = 0;
	int totalCount=0;
	
	
	List<BoardVO> list = new ArrayList<BoardVO>();
	try {
		Class.forName("oracle.jdbc.OracleDriver");
		cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "bigdata", "bigdata");
		
		ps = cn.prepareStatement(sql_totalcount);
		rs = ps.executeQuery();
		
		totalCount = 0;
		if (rs.next()) {
			totalCount = rs.getLong("cnt");
		}
		pageCount = totalCount / pageSize;
		if (totalCount % pageSize != 0) {
			pageCount++;
		}
		
		
		ps = cn.prepareStatement(sql.toString());
		ps.setLong(1, startnum);
		ps.setLong(2, endnum);
		rs = ps.executeQuery();
		while(rs.next()) {
			BoardVO boardVO = new BoardVO();
			boardVO.setNo(rs.getLong("no"));
			boardVO.setName(rs.getString("name"));
			boardVO.setTitle(rs.getString("title"));
			boardVO.setRegdate(rs.getDate("regdate"));
			boardVO.setViewcount(rs.getInt("viewcount"));
			list.add(boardVO);
		}
	} catch(Exception e) {
		e.printStackTrace();
	} finally {
		if (rs != null) try{rs.close();} catch(Exception e){}
		if (ps != null) try{ps.close();} catch(Exception e){}
		if (cn != null) try{cn.close();} catch(Exception e){}
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="shortcut icon" href="/favicon.ico" />
</head>
<body>
<table>
	<caption>게시물 리스트</caption>
<tr>
	<th>번호</th>
	<th>작성자</th>
	<th>제목</th>
	<th>작성일</th>
	<th>조회수</th>
</tr>
<% for(BoardVO boardVO : list) { %>
<tr>
	<td><%=boardVO.getNo() %></td>
	<td><%=boardVO.getName() %></td>
	<td><a href="content.jsp?no=<%=boardVO.getNo() %>"><%=boardVO.getTitle() %></a></td>
	<td><%=boardVO.getRegdate() %></td>
	<td><%=boardVO.getViewcount() %></td>
</tr>
<% } %>
<tr>
	<td colspan="5">
		<% for(long p=1; p <=pageCount; p++) { %>
			<a href="list.jsp?pg=<%=p %>"><%=p %></a>
		<% } %>
		
	</td>
</tr>
</table><br/>
<a href="insert.jsp">글쓰기</a><br/>
</body>
</html>