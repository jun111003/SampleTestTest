<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>31レジシステム</title>
<link rel="stylesheet" href="/SampleProject/css/login-001.css">
<img src=file:///C:/Users/user2021/git/SampleTestTest/SampleProject/WebContent/WEB-INF/img/31logo.png alt="31ロゴマーク"
	width=20% height=20%>
</head>

<body>
	<p>IDを入力</p>

	<form action="/SampleProject/ServletLogin" method="post">
		<p>
			ID:
			<input type="text" name="ID" size="20">
		</p>
		<p>
			<input type="submit" name="home-001" value="ログイン">
		</p>
	</form>
</body>
</html>