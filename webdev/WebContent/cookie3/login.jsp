<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<link rel="shortcut icon" href="/favicon.ico"/>
</head>
<body>
<%
Cookie[] cookie = request.getCookies();
String user_id = "";
if(cookie != null) {
	for(int i = 0; i < cookie.length; i++) {
		if(cookie[i].getName().trim().equals("user_id")){
			//out.println(cookie[i].getValue());
			user_id = cookie[i].getValue();
		}
	}
}
%>


<form action="login_action.jsp" method="post"> 
<table>
	<caption>로그인</caption>
<tr>
	<th>아이디</th>
	<td><input type="text" name="user_id" value="<%=user_id %>" /></td>
</tr>
<tr>
	<th>비밀번호</th>
	<td><input type="password" name="user_pw" /></td>
</tr>
<tr>
	<td></td>
	<td>
		<input type="checkbox" name="save_id" value="로그인" 
		<% if(user_id.length() > 1) out.println("checked"); %>/> 아이디 저장
	
	</td>
</tr>
<tr>
	<td colspan="2" align="center">
		<input type="submit" value="완료" />
	</td>
</tr>
</table>
</form>
</body>
</html>