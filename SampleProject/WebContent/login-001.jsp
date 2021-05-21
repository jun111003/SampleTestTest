<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>31レジシステム</title>
<link rel="stylesheet" href="css/login-001.css">
<img src=img/31ロゴホーム.png>
</head>


<body>
	<p>IDを入力</p>

	<form action="/SampleProject/ServletLogin" method="post">
		<p>
			ID:
			<input type="text" name="ID" size="40">
		</p>
		<p>
			<input type="submit" name="home-001" value="ログイン" class="next">
		</p>
	</form>
</body>
</html>