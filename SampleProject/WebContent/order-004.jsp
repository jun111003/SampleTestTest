<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>31レジシステム</title>
<link rel="stylesheet" href="css/order-004.css">
</head>
<body>
	<img src=img/31logo.png class="image-vw">

	<form action="/SampleProject/ServletGetOrder004" method="post">

		<div class="title">
			<p>ご注文内容を確定させてよろしいですか？</p>
		</div>

		<table border="1">
			<tr>
				<td>注文内容</td>
				<td>サイズ</td>
				<td>フレーバー1</td>
				<td>容器</td>
				<td>小計</td>
			</tr>
			<tr>
				<td rowspan="2">ダブル</td>
				<td>スモール</td>
				<td>抹茶</td>
				<td>カップ</td>
				<td>720</td>
			</tr>
		</table>


		<p>
			<input type="submit" name="order-004" value="注文内容を修正する" class="back">
			<input type="submit" name="order-004" value="追加で注文する" class="back">
			<input type="submit" name="order-004" value="注文を確定させる" class="next">
		</p>
	</form>
</body>
</html>