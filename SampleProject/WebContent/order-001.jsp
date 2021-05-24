<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>31レジシステム</title>
<link rel="stylesheet" href="css/order-001.css">
</head>

<body>
<img src="img/31logo.png" class="image-vw">
	<form action="/SampleProjectMaster/OrderStartServlet" method="post">
		<div class="title">
		<p>アイスの個数を選択してください</p>
		</div>

		<div class="number">
        	<input id="1" type="radio" name="number" value="No001">
			<label for="1">
 			<img src=img/シングル.png width=15% height=15%>
 			</label>

        	<input id="2" type="radio" name="number" value="No002">
        	<label for="2">
			<img src=img/ダブル.png width=15% height=15%>
    	    </label>

        	<input id="3" type="radio" name="number" value="No003">
        	<label for="3">
        	<img src=img/トリプル.png width=15% height=15%>
       		</label>
		</div>

		<p>
			<input type="submit" name="kosuuButton" value="戻る" class="back">
			<input type="submit" name="kosuuButton" value="次へ" class="next">
		</p>
	</form>
</body>
</html>