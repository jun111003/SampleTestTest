<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>31レジシステム</title>
<link rel="stylesheet" href="/SampleProject/css/order-003.css">
<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/31logo.png alt="31ロゴマーク" width=20% height=20%>
</head>

<body>
<p>容器の種類を選んでください</p>

	<div class="cap">
		<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/cap.png width=50% height=50%>
		<p>
		<input type="radio" name="number" value="1" onclick="cap()">カップ
		</p>
	</div>

	<div class="corn">
		<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/corn.png width=50% height=50%>
		<p>
		<input type="radio" name="number" value="2" onclick="corn()">コーン
		</p>
	</div>

	<div class="wafflecorn">
		<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/wafflecorn.png width=50% height=50%>
		<p>
		<input type="radio" name="number" value="3" onclick="wafflecorn()">ワッフルコーン
		</p>
	</div>

<p><input type="submit" value="戻る"><input type="submit" value="次へ"></p>
</body>
</html>