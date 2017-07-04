<%@page import="board.model.BoardDAO"%>
<%@page import="java.util.List"%>
<%@page import="board.model.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	long pg = 1;
	try {	
		pg = Long.parseLong(request.getParameter("pg"));
	} catch(NumberFormatException e) {}

	int pageSize = 10;
	long startnum = (pg - 1) * pageSize + 1;
	long endnum = pg * pageSize;
	long pageCount = 0;
	long totalCount=0;
	long blockSize = 10;
	long startPage = (pg - 1)/blockSize * blockSize + 1;
	long endPage = (pg - 1)/blockSize * blockSize + blockSize;	

	BoardDAO boardDAO = BoardDAO.getInstance();
	totalCount = boardDAO.getTotalCount();
	List<BoardVO> list = boardDAO.getBoardList(startnum, endnum);
	

	
	pageCount = totalCount / pageSize;
	if (totalCount % pageSize != 0) {
		pageCount++;
	}
	if (pageCount < endPage) endPage = pageCount;
	
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
		<% if(startPage == 1) { %>
			[이전블럭]
		<% } else { %>
			<a href="list.jsp?pg=<%=startPage - 1 %>">[이전블럭]</a>
		<% } %>
		
		<% for(long p=startPage; p <=endPage; p++) { %>
			<% if (p == pg) { %>
				<%=p %>
			<% } else { %>
				<a href="list.jsp?pg=<%=p %>"><%=p %></a>
		<%		}
           }%>
			<% if(endPage == pageCount) {%>
				[다음블럭]
			<% } else { %>
				<a href="list.jsp?pg=<%=endPage + 1%>">[다음블럭]</a>
			<% } %>
	</td>
</tr>
</table><br/>
<a href="insert.jsp">글쓰기</a><br/>
</body>
</html>