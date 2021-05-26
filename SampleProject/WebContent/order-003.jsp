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
<link rel="stylesheet" href="css/order-003.css">
</head>

<body>
<img src="img/31logo.png" class="image-vw">
	<form action="/SampleProjectMaster/ServletGetOrder003" method="post">
		<p class="title">容器の種類を選んでください</p>

		<div class="size">


			<% //シングルまたはダブルを選択したとき  %>
			<% if(ice_cream_count_id.equals("No001") || ice_cream_count_id.equals("No002")) { %>

				<% //コーンを選択できる %>
				<input id="1" type="radio" name="container" value="C002" checked>
				<label for="1">
				<img src=img/コーン.png width=10% height=10% class="selectImg">
				</label>

				<% //カップを選択できる %>
				<input id="2" type="radio" name="container" value="C001">
				<label for="2">
				<img src=img/カップ.png width=10% height=10% class="selectImg">
				</label>

				<% //ワッフルコーンを選択できる %>
				<input id="3" type="radio" name="container" value="C003">
				<label for="3">
				<img src=img/ワッフルコーン.png width=10% height=10% class="selectImg">
				</label>

			<% //トリプルを選択したとき  %>
			<% } else { %>

				<% //コーンを選択できない %>
				<input id="1" type="radio" name="container" value="C002" disabled>
				<label for="1">
				<img src=img/コーン.png width=10% height=10% class="noSelectImg">
				</label>

				<% //カップを選択できる %>
				<input id="2" type="radio" name="container" value="C001" checked>
				<label for="2">
				<img src=img/カップ.png width=10% height=10% class="selectImg">
				</label>

				<% //ワッフルコーンを選択できない %>
				<input id="3" type="radio" name="container" value="C003" disabled>
				<label for="3">
				<img src=img/ワッフルコーン.png width=10% height=10% class="noSelectImg">
				</label>

			<% } %>

		</div>

		<p>
			<input type="submit" name="order-003" value="戻る" class="back">
			<input type="submit" name="order-003" value="次へ" class="next">
		</p>
	</form>
</body>
</html>