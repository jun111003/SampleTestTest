<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import = "javasrc.*" %>

<%
//現在の注文情報が入っているsalesインスタンスを取得
Order order = (Order) session.getAttribute("Order");
int i = order.getOrder_id();
String sessionInstanceName = "Sales" + Integer.toString(i);
Sales sales = (Sales) session.getAttribute(sessionInstanceName);

//アイスクリームの個数IDを表す変数を定義(No001:シングル　No002:ダブル　No003:トリプル)
String ice_cream_count_id = sales.getIce_cream_count_id();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>31レジシステム</title>
<link rel="stylesheet" href="css/order-002.css">
</head>

<body>
<img src="img/31logo.png" class="image-vw">
	<form action="/SampleProjectMaster/ServletGetOrder002" method="post">
		<p class="title">1つめのフレーバーのサイズを選んでください</p>

		<div class="size">

			<% //デバッグ用  %>
			<!-- <% System.out.println("sales.getIce_cream_count_id():" + sales.getIce_cream_count_id()); %> -->

			<% //シングルを選択したとき  %>
			<% if(ice_cream_count_id.equals("No001")) { %>

				<% //キッズを選択できる %>
				<input id="1" type="radio" name="size" value="S001" checked>
				<label for="1">
					<img src=img/キッズ.png width=15% height=15% class="selectImg">
				</label>

				<% //スモールを選択できない %>
				<input id="2" type="radio" name="size" value="S002" disabled>
				<label for="2">
				<img src=img/スモール.png width=15% height=15% class="noSelectImg">
				</label>

				<% //レギュラーを選択できる %>
				<input id="3" type="radio" name="size" value="S003">
				<label for="3">
				<img src=img/レギュラー.png width=15% height=15% class="selectImg">
				</label>

				<% //キングを選択できる %>
				<input id="4" type="radio" name="size" value="S004">
				<label for="4">
				<img src=img/キング.png width=15% height=15% class="selectImg">
				</label>


			<% //ダブルを選択したとき  %>
			<% } else if(ice_cream_count_id.equals("No002")) { %>

				<% //キッズを選択できない %>
				<input id="1" type="radio" name="size" value="S001" disabled>
				<label for="1">
					<img src=img/キッズ.png width=15% height=15% class="noSelectImg">
				</label>

				<% //スモールを選択できる %>
				<input id="2" type="radio" name="size" value="S002" checked>
				<label for="2">
				<img src=img/スモール.png width=15% height=15% class="selectImg">
				</label>

				<% //レギュラーを選択できる %>
				<input id="3" type="radio" name="size" value="S003">
				<label for="3">
				<img src=img/レギュラー.png width=15% height=15% class="selectImg">
				</label>

				<% //キングを選択できない %>
				<input id="4" type="radio" name="size" value="S004" disabled>
				<label for="4">
				<img src=img/キング.png width=15% height=15% class="noSelectImg">
				</label>


			<% //トリプルを選択したとき  %>
			<% } else { %>

				<% //キッズを選択できない %>
				<input id="1" type="radio" name="size" value="S001" disabled>
				<label for="1">
					<img src=img/キッズ.png width=15% height=15% class="noSelectImg">
				</label>

				<% //スモールを選択できる %>
				<input id="2" type="radio" name="size" value="S002" checked>
				<label for="2">
				<img src=img/スモール.png width=15% height=15% class="selectImg">
				</label>

				<% //レギュラーを選択できない %>
				<input id="3" type="radio" name="size" value="S003" disabled>
				<label for="3">
				<img src=img/レギュラー.png width=15% height=15% class="noSelectImg">
				</label>

				<% //キングを選択できない %>
				<input id="4" type="radio" name="size" value="S004" disabled>
				<label for="4">
				<img src=img/キング.png width=15% height=15% class="noSelectImg">
				</label>

			<% } %>

		</div>


		<p class="title2">1つめのフレーバーの種類を選んでください</p>

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
			<input type="submit" name= "order-002" value="戻る" class="back">
			<input type="submit" name= "order-002" value="次へ" class="next">
		</p>
	</form>
</body>
</html>