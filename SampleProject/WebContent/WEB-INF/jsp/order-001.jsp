<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>31レジシステム</title>
<img
	src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/31logo.png
	alt="31ロゴマーク" width=20% height=20%>
</head>

<body>
	<p>アイスの個数を選択してください</p>

	<div class="single">
		<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/single.png width=30% height=30%>
		<p>
		<input type="radio" name="number" value="1" onclick="cupFlagSingle()">シングル
		</p>
	</div>

	<div class="double">
		<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/double.png width=30% height=30%>
		<p>
		<input type="radio" name="number" value="2" onclick="cupFlagDouble()">ダブル
		</p>
	</div>

	<div class="triple">
		<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/triple.png width=30% height=30%>
		<p>
		<input type="radio" name="number" value="3" onclick="cupFlagTriple()">トリプル
		</p>
	</div>

	<p>
		<input type="submit" value="戻る">
		<input type="submit" value="次へ">
	</p>
</body>
</html>