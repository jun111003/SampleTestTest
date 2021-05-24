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
</head>

<body>
    <form action="/SampleProjectMaster/OrderStartServlet" method="get"><%--注文画面に遷移するようにパスを変更--%>
    <img src="img/31logo.png" class="image-vw">
       <p> <%= msg.getMsg() %></p>

        <p>
			<input type="submit" value="OK" class="next">
		</p>
    </form>
</body>
</html>