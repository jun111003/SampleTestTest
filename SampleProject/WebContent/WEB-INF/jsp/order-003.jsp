<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>31レジシステム</title>
<link rel="stylesheet" href="/SampleProject/css/order-003.css">
<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/31logo.png alt="31ロゴマーク" width=20%
	height=20%>
</head>

<body>
	<form action="/SampleProject/ServletGetOrder003" method="post">
		<p class="title">容器の種類を選んでください</p>

		<div class="size">
			<input id="1" type="radio" name="number" value="1">
			<label for="1">
				<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/corn.png width=15% height=15%>
			</label>

			<input id="2" type="radio" name="number" value="2">
			<label for="2">
				<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/cap.png width=15% height=15%>
			</label>

			<input id="3" type="radio" name="number" value="3">
			<label for="3">
				<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/wafflecorn.png width=15% height=15%>
			</label>
		</div>

		<p>
			<input type="submit" name= "order-003" value="戻る" class="back">
			<input type="submit" name= "order-003" value="次へ" class="next">
		</p>
	</form>
</body>
</html>