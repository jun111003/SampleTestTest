<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>31レジシステム</title>
<link rel="stylesheet" href="/SampleProject/css/login-001.css">
<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/31logo.png alt="31ロゴマーク" width=20% height=20%>
</head>

<body>
<p>IDを入力</p>

<form action="/SampleProject/ServletTest" method="post">
	<p>
	ID:<input type="text" name="txt" size="20">
	</p>
</form>
<p><input type="submit" value="ログイン"></p>
</body>
</html>