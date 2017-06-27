<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	int global_cnt = 0;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String ip = request.getRemoteAddr();
	if (ip.equals("70.12.50.62")) {
		++ global_cnt;
	}
	
	if ((global_cnt%2) ==0) {
		out.println("당신의 아이피는 " + ip + " 입니다");
		out.println(global_cnt);
	} else {
		out.println("당신은 불량유저이므로 접속을 차단합니다.");
		out.println(global_cnt);
	}

%>


</body>
</html>