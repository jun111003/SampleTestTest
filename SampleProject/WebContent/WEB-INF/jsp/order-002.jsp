<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>31レジシステム</title>
<link rel="stylesheet" href="/SampleProject/css/order-002.css">
<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/31logo.png alt="31ロゴマーク" width=20% height=20%>
</head>

<body>
<p>1つめのフレーバーのサイズを選んでください</p>

	<div class="kids">
		<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/kids.png width=30% height=30%>
		<p>
		<input type="radio" name="number" value="1" onclick="kids()">キッズ
		</p>
	</div>

	<div class="small">
		<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/kids.png width=50% height=50%>
		<p>
		<input type="radio" name="number" value="2" onclick="small()">スモール
		</p>
	</div>

	<div class="regular">
		<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/kids.png width=50% height=50%>
		<p>
		<input type="radio" name="number" value="3" onclick="regular()">レギュラー
		</p>
	</div>

	<div class="king">
		<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/kids.png width=50% height=50%>
		<p>
		<input type="radio" name="number" value="4" onclick="king()">キング
		</p>
	</div>


<p>1つめのフレーバーの種類を選んでください</p>
</body>
</html>