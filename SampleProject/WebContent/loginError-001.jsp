<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="javasrc.LoginMsg" %>
<%
//リクエストスコープからインスタンスを取得
LoginMsg msg = (LoginMsg) request.getAttribute("req_msg");
%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>31レジシステム</title>
<link rel="stylesheet" href="css/login-001.css">
<link rel="stylesheet" href="css/login-001.css">
</head>

<body>
<img src="img/31logo.png" class="image-vw">
    <form action="/SampleProjectMaster/ServletLogin" method="get">
        <p><%= msg.getMsg() %></p>

        <p>
			<input type="submit" value="OK" class="next">
		</p>
    </form>
</body>
</html>