<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>31レジシステム</title>
<link rel="stylesheet" href="css/order-002.css">
<img src=img/31logo.png class="image-vw">
</head>

<body>
	<form action="/SampleProject/ServletGetOrder0023" method="post">
		<p class="title">3つめのフレーバーのサイズを選んでください</p>

		<div class="size">
			<input id="1" type="radio" name="size" value="S001">
			<label for="1">
				<img src=img/キッズ.png width=15% height=15%>
			</label>

			<input id="2" type="radio" name="size" value="S002">
			<label for="2">
				<img src=img/スモール.png width=15% height=15%>
			</label>

			<input id="3" type="radio" name="size" value="S003">
			<label for="3">
				<img src=img/レギュラー.png width=15% height=15%>
			</label>

			<input id="4" type="radio" name="size" value="S004">
			<label for="4">
				<img src=img/キング.png width=15% height=15%>
			</label>
		</div>


		<p class="title2">3つめのフレーバーの種類を選んでください</p>

		<div class="flavor">
			<input id="a" type="radio" name="flavor" value="F001">
			<label for="a">
				<img src=img/ポッピングシャワー.png width=15% height=15%>
			</label>

			<input id="b" type="radio" name="flavor" value="F002">
			<label for="b">
				<img src=img/ストロベリーチーズケーキ.png width=15% height=15%>
			</label>

			<input id="c" type="radio" name="flavor" value="F003">
			<label for="c">
				<img src=img/キャラメルリボン.png width=15% height=15%>
			</label>

			<input id="d" type="radio" name="flavor" value="F004">
			<label for="d">
				<img src=img/クッキーアンドクリーム.png width=15% height=15%>
			</label>

			<input id="e" type="radio" name="flavor" value="F005">
			<label for="e">
				<img src=img/抹茶.png width=15% height=15%>
			</label>
		</div>

		<div class="flavor">
			<input id="f" type="radio" name="flavor" value="F006">
			<label for="f">
				<img src=img/チョップドチョコレート.png width=15% height=15%>
			</label>

			<input id="g" type="radio" name="flavor" value="F007">
			<label for="g">
				<img src=img/ベリーベリーストロベリー.png width=15% height=15%>
			</label>

			<input id="h" type="radio" name="flavor" value="F008">
			<label for="h">
				<img src=img/ロッキーロード.png width=15% height=15%>
			</label>

			<input id="i" type="radio" name="flavor" value="F009">
			<label for="i">
				<img src=img/チョコレートミント.png width=15% height=15%>
			</label>
			<input id="j" type="radio" name="flavor" value="F010">
			<label for="j">
				<img src=img/レモンシャーベット.png width=15% height=15%>
			</label>
		</div>

		<p>
			<input type="submit" name= "order-0023" value="戻る" class="back">
			<input type="submit" name= "order-0023" value="次へ" class="next">
		</p>
	</form>
</body>
</html>