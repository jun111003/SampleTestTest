<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>31レジシステム</title>
<link rel="stylesheet" href="/SampleProject/css/order-002.css">
<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/31logo.png class="image-vw">
</head>

<body>
	<form action="/SampleProject/ServletGetOrder002" method="post">
		<p class="title">1つめのフレーバーのサイズを選んでください</p>

		<div class="size">
			<input id="1" type="radio" name="size" value="1">
			<label for="1">
				<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/キッズ.png width=15% height=15%>
			</label>

			<input id="2" type="radio" name="size" value="2">
			<label for="2">
				<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/スモール.png width=15% height=15%>
			</label>

			<input id="3" type="radio" name="size" value="3">
			<label for="3">
				<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/レギュラー.png width=15% height=15%>
			</label>

			<input id="4" type="radio" name="size" value="4">
			<label for="4">
				<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/キング.png width=15% height=15%>
			</label>
		</div>


		<p class="title2">1つめのフレーバーの種類を選んでください</p>

		<div class="flavor">
			<input id="a" type="radio" name="flavor" value="a">
			<label for="a">
				<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/ポッピングシャワー.png width=15% height=15%>
			</label>

			<input id="b" type="radio" name="flavor" value="b">
			<label for="b">
				<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/ストロベリーチーズケーキ.png width=15% height=15%>
			</label>

			<input id="c" type="radio" name="flavor" value="c">
			<label for="c">
				<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/キャラメルリボン.png width=15% height=15%>
			</label>

			<input id="d" type="radio" name="flavor" value="d">
			<label for="d">
				<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/クッキーアンドクリーム.png width=15% height=15%>
			</label>

			<input id="e" type="radio" name="flavor" value="e">
			<label for="e">
				<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/抹茶.png width=15% height=15%>
			</label>
		</div>

		<div class="flavor">
			<input id="f" type="radio" name="flavor" value="f">
			<label for="f">
				<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/チョップドチョコレート.png width=15% height=15%>
			</label>

			<input id="g" type="radio" name="flavor" value="g">
			<label for="g">
				<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/ベリーベリーストロベリー.png width=15% height=15%>
			</label>

			<input id="h" type="radio" name="flavor" value="h">
			<label for="h">
				<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/ロッキーロード.png width=15% height=15%>
			</label>

			<input id="i" type="radio" name="flavor" value="i">
			<label for="i">
				<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/チョコレートミント.png width=15% height=15%>
			</label>
			<input id="j" type="radio" name="flavor" value="j">
			<label for="j">
				<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/レモンシャーベット.png width=15% height=15%>
			</label>
		</div>

		<p>
			<input type="submit" name= "order-002" value="戻る" class="back">
			<input type="submit" name= "order-002" value="次へ" class="next">
		</p>
	</form>
</body>
</html>