<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="board.model.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	long no = Long.parseLong(request.getParameter("no"));
	String name = request.getParameter("name");
	String content = request.getParameter("content");
	String pwd = request.getParameter("pwd");
	String title = request.getParameter("title");

	BoardVO boardVO = new BoardVO();
	boardVO.setNo(no);
	boardVO.setPwd(pwd);
	
	Connection cn = null;
	PreparedStatement ps = null;
	
	boolean result = false;
	StringBuffer sql = new StringBuffer();
	sql.append(" DELETE FROM tb_board");
	sql.append(" WHERE  no=? AND pwd=?");

	try {
		Class.forName("oracle.jdbc.OracleDriver");
		cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "bigdata", "bigdata");
		ps = cn.prepareStatement(sql.toString());
		ps.setLong(1, boardVO.getNo());
		ps.setString(2, boardVO.getPwd());
		
		if (ps.executeUpdate() > 0) {
			result = true;
		}
	} catch(Exception e) {
		e.printStackTrace();
	} finally {
		if (ps != null) try{ps.close();}catch(Exception e){}
		if (cn != null) try{cn.close();}catch(Exception e){}
	}
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="shortcut icon" href="/favicon.ico"/>
</head>
<body>
<script type="text/javascript">
<% if(result) { %>
	alert('글 삭제 성공');
	location.href='list.jsp';
<% } else { %>
	alert('글 삭제 실패');
	location.href='javascript:history.back()';
<% } %>
</script>
</body>
</html>