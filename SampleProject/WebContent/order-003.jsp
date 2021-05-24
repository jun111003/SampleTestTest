<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>31レジシステム</title>
<link rel="stylesheet" href="css/order-003.css">
</head>

<body>
<img src="img/31logo.png" class="image-vw">
	<form action="/SampleProjectMaster/ServletGetOrder003" method="post">
		<p class="title">容器の種類を選んでください</p>

		<div class="size">
			<input id="1" type="radio" name="container" value="C002">
			<label for="1">
				<img src=img/コーン.png width=10% height=10%>
			</label>

			<input id="2" type="radio" name="container" value="C001">
			<label for="2">
				<img src=img/カップ.png width=10% height=10%>
			</label>

			<input id="3" type="radio" name="container" value="C003">
			<label for="3">
				<img src=img/ワッフルコーン.png width=10% height=10%>
			</label>
		</div>

		<p>
			<input type="submit" name="order-003" value="戻る" class="back">
			<input type="submit" name="order-003" value="次へ" class="next">
		</p>
	</form>
</body>
</html>