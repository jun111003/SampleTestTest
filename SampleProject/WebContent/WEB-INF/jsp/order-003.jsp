<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>31レジシステム</title>
<link rel="stylesheet" href="/SampleProject/css/order-003.css">
<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/31logo.png class="image-vw">
</head>

<body>
	<form action="/SampleProject/ServletGetOrder003" method="post">
		<p class="title">容器の種類を選んでください</p>

		<div class="size">
			<input id="1" type="radio" name="container" value="1">
			<label for="1">
				<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/コーン.png width=10% height=10%>
			</label>

			<input id="2" type="radio" name="container" value="2">
			<label for="2">
				<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/カップ.png width=10% height=10%>
			</label>

			<input id="3" type="radio" name="container" value="3">
			<label for="3">
				<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/ワッフルコーン.png width=10% height=10%>
			</label>
		</div>

		<p>
			<input type="submit" name="order-003" value="戻る" class="back">
			<input type="submit" name="order-003" value="次へ" class="next">
		</p>
	</form>
</body>
</html>