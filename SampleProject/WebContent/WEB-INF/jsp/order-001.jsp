<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>31レジシステム</title>
<link rel="stylesheet" href="/SampleProject/css/order-001.css">
<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/31logo.png class="image-vw">
</head>

<body>
	<form action="/SampleProject/OrderStartServlet" method="post">
		<div class="title">
		<p>アイスの個数を選択してください</p>
		</div>

		<div class="number">
        	<input id="1" type="radio" name="number" value="1">
			<label for="1">
 			<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/シングル.png width=20% height=20%>
 			</label>

        	<input id="2" type="radio" name="number" value="2">
        	<label for="2">
			<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/ダブル.png width=20% height=20%>
    	    </label>

        	<input id="3" type="radio" name="number" value="3">
        	<label for="3">
        	<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/トリプル.png width=20% height=20%>
       		</label>
		</div>

		<p>
			<input type="submit" name="kosuuButton" value="戻る" class="back">
			<input type="submit" name="kosuuButton" value="次へ" class="next">
		</p>
	</form>
</body>
</html>