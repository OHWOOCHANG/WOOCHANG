<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="shortcut icon" href="/favicon.ico"/>
</head>
<body>
<%
RequestDispatcher dispatcher = 
	request.getRequestDispatcher("../jsp/calendar2.jsp");
dispatcher.forward(request, response);
%>

// MVC(Model, View, Controller)라는 모듈 분리를 할때 dispatcher가 굉장히 유용하게 사용


</body>
</html>