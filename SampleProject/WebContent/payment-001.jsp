<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="javasrc.*,java.util.*,java.text.SimpleDateFormat,java.io.PrintWriter"%>
<%--以下テスト用インスタンス --%>
<%
	Order order = (Order) session.getAttribute("Order");
	Sales sales1 = (Sales) session.getAttribute("Sales1");
	Sales sales2 = (Sales) session.getAttribute("Sales2");
	Sales sales3 = (Sales) session.getAttribute("Sales3");
	Sales sales4 = (Sales) session.getAttribute("Sales4");
	Sales sales5 = (Sales) session.getAttribute("Sales5");
	Sales sales6 = (Sales) session.getAttribute("Sales6");
	Sales sales7 = (Sales) session.getAttribute("Sales7");
	Sales sales8 = (Sales) session.getAttribute("Sales8");
	Sales sales9 = (Sales) session.getAttribute("Sales9");
	Sales sales10 = (Sales) session.getAttribute("Sales10");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>31レジシステム</title>
<link rel="stylesheet" href="css/payment-001.css">
</head>
<body>

	<script>
		//合計金額
		var sumMoney;
		//受取金額
		var payment = 0;
		//差額
		var differentMoney;

		//それぞれのボタンが押された時の処理

		function click1() {

			payment = payment * 10 + 1;

			//合計金額の値を取得
			sumMoney = document.getElementById("sumNum").value;

			//変更された受取金額を表示
			document.getElementById("numValue").value = payment;

			//変更された差額を表示
			differentMoney = payment - sumMoney;
			document.getElementById("differentNum").value = differentMoney;

			//受取金額がマイナスの時
			if (differentMoney < 0) {
				document.getElementById("differentNumCheck").innerHTML = "※金額が不足しています";
				document.getElementById("next").setAttribute("disabled", true);
			} else {
				document.getElementById("differentNumCheck").innerHTML = "";
				document.getElementById("next").removeAttribute("disabled");
			}

		}

		function click2() {

			payment = payment * 10 + 2;

			//合計金額の値を取得
			sumMoney = document.getElementById("sumNum").value;

			//変更された受取金額を表示
			document.getElementById("numValue").value = payment;

			//変更された差額を表示
			differentMoney = payment - sumMoney;
			document.getElementById("differentNum").value = differentMoney;

			//受取金額がマイナスの時
			if (differentMoney < 0) {
				document.getElementById("differentNumCheck").innerHTML = "※金額が不足しています";
				document.getElementById("next").setAttribute("disabled", true);
			} else {
				document.getElementById("differentNumCheck").innerHTML = "";
				document.getElementById("next").removeAttribute("disabled");
			}

		}

		function click3() {

			payment = payment * 10 + 3;

			//合計金額の値を取得
			sumMoney = document.getElementById("sumNum").value;

			//変更された受取金額を表示
			document.getElementById("numValue").value = payment;

			//変更された差額を表示
			differentMoney = payment - sumMoney;
			document.getElementById("differentNum").value = differentMoney;

			//受取金額がマイナスの時
			if (differentMoney < 0) {
				document.getElementById("differentNumCheck").innerHTML = "※金額が不足しています";
				document.getElementById("next").setAttribute("disabled", true);
			} else {
				document.getElementById("differentNumCheck").innerHTML = "";
				document.getElementById("next").removeAttribute("disabled");
			}

		}

		function click4() {

			payment = payment * 10 + 4;

			//合計金額の値を取得
			sumMoney = document.getElementById("sumNum").value;

			//変更された受取金額を表示
			document.getElementById("numValue").value = payment;

			//変更された差額を表示
			differentMoney = payment - sumMoney;
			document.getElementById("differentNum").value = differentMoney;

			//受取金額がマイナスの時
			if (differentMoney < 0) {
				document.getElementById("differentNumCheck").innerHTML = "※金額が不足しています";
				document.getElementById("next").setAttribute("disabled", true);
			} else {
				document.getElementById("differentNumCheck").innerHTML = "";
				document.getElementById("next").removeAttribute("disabled");
			}

		}

		function click5() {

			payment = payment * 10 + 5;

			//合計金額の値を取得
			sumMoney = document.getElementById("sumNum").value;

			//変更された受取金額を表示
			document.getElementById("numValue").value = payment;

			//変更された差額を表示
			differentMoney = payment - sumMoney;
			document.getElementById("differentNum").value = differentMoney;

			//受取金額がマイナスの時
			if (differentMoney < 0) {
				document.getElementById("differentNumCheck").innerHTML = "※金額が不足しています";
				document.getElementById("next").setAttribute("disabled", true);
			} else {
				document.getElementById("differentNumCheck").innerHTML = "";
				document.getElementById("next").removeAttribute("disabled");
			}

		}

		function click6() {

			payment = payment * 10 + 6;

			//合計金額の値を取得
			sumMoney = document.getElementById("sumNum").value;

			//変更された受取金額を表示
			document.getElementById("numValue").value = payment;

			//変更された差額を表示
			differentMoney = payment - sumMoney;
			document.getElementById("differentNum").value = differentMoney;

			//受取金額がマイナスの時
			if (differentMoney < 0) {
				document.getElementById("differentNumCheck").innerHTML = "※金額が不足しています";
				document.getElementById("next").setAttribute("disabled", true);
			} else {
				document.getElementById("differentNumCheck").innerHTML = "";
				document.getElementById("next").removeAttribute("disabled");
			}

		}

		function click7() {

			payment = payment * 10 + 7;

			//合計金額の値を取得
			sumMoney = document.getElementById("sumNum").value;

			//変更された受取金額を表示
			document.getElementById("numValue").value = payment;

			//変更された差額を表示
			differentMoney = payment - sumMoney;
			document.getElementById("differentNum").value = differentMoney;

			//受取金額がマイナスの時
			if (differentMoney < 0) {
				document.getElementById("differentNumCheck").innerHTML = "※金額が不足しています";
				document.getElementById("next").setAttribute("disabled", true);
			} else {
				document.getElementById("differentNumCheck").innerHTML = "";
				document.getElementById("next").removeAttribute("disabled");
			}

		}

		function click8() {

			payment = payment * 10 + 8;

			//合計金額の値を取得
			sumMoney = document.getElementById("sumNum").value;

			//変更された受取金額を表示
			document.getElementById("numValue").value = payment;

			//変更された差額を表示
			differentMoney = payment - sumMoney;
			document.getElementById("differentNum").value = differentMoney;

			//受取金額がマイナスの時
			if (differentMoney < 0) {
				document.getElementById("differentNumCheck").innerHTML = "※金額が不足しています";
				document.getElementById("next").setAttribute("disabled", true);
			} else {
				document.getElementById("differentNumCheck").innerHTML = "";
				document.getElementById("next").removeAttribute("disabled");
			}

		}

		function click9() {

			payment = payment * 10 + 9;

			//合計金額の値を取得
			sumMoney = document.getElementById("sumNum").value;

			//変更された受取金額を表示
			document.getElementById("numValue").value = payment;

			//変更された差額を表示
			differentMoney = payment - sumMoney;
			document.getElementById("differentNum").value = differentMoney;

			//受取金額がマイナスの時
			if (differentMoney < 0) {
				document.getElementById("differentNumCheck").innerHTML = "※金額が不足しています";
				document.getElementById("next").setAttribute("disabled", true);
			} else {
				document.getElementById("differentNumCheck").innerHTML = "";
				document.getElementById("next").removeAttribute("disabled");
			}

		}

		function click0() {

			payment = payment * 10 + 0;

			//合計金額の値を取得
			sumMoney = document.getElementById("sumNum").value;

			//変更された受取金額を表示
			document.getElementById("numValue").value = payment;

			//変更された差額を表示
			differentMoney = payment - sumMoney;
			document.getElementById("differentNum").value = differentMoney;

			//受取金額がマイナスの時
			if (differentMoney < 0) {
				document.getElementById("differentNumCheck").innerHTML = "※金額が不足しています";
				document.getElementById("next").setAttribute("disabled", true);
			} else {
				document.getElementById("differentNumCheck").innerHTML = "";
				document.getElementById("next").removeAttribute("disabled");
			}

		}

		function numErase() {

			payment = Math.floor(payment / 10);

			//合計金額の値を取得
			sumMoney = document.getElementById("sumNum").value;

			//変更された受取金額を表示
			document.getElementById("numValue").value = payment;

			//変更された差額を表示
			differentMoney = payment - sumMoney;
			document.getElementById("differentNum").value = differentMoney;

			//受取金額がマイナスの時
			if (differentMoney < 0) {
				document.getElementById("differentNumCheck").innerHTML = "※金額が不足しています";
				document.getElementById("next").setAttribute("disabled", true);
			} else {
				document.getElementById("differentNumCheck").innerHTML = "";
				document.getElementById("next").removeAttribute("disabled");
			}

		}
	</script>

	<!-- <style>

		.differentMoney {
			color: red;
		}

	</style>  -->


	<form action="/SampleProjectMaster/ServletGetPayment001" method="post" name="form1" onSubmit="return check()"
		class="receiving">
		<img src=img/31logo.png class="image-vw">

		<div class="main">
			<h2>合計金額</h2>
			<input type="number" name="txt" id="sumNum" value=<%=order.getSumMoney()%> class="put" disabled>


			<!-- idを指定した箇所の値が<script>タグの「document.getElement...」によって変更される -->
			<h2>受取金額</h2>
			<input type="number" name="payment" id="numValue" value="0" class="put">
			<br>


			<h2>差額</h2>
			<div class="differentMoney">
				<input type="number" name="differentMoney" id="differentNum" value="0" class="put">
			</div>

			<p>
				<input type="submit" id="back" name="payment-001" value="戻る" class="back" onClick="back()">
				<input type="submit" id="next" name="payment-001" value="決済を行う" class="next" disabled>
			</p>
			<br> <br>
			<div class="differentNumCheck">
				<span id="differentNumCheck"></span>
			</div>
		</div>
	</form>


	<div class="calculator">
		<table border="0">
			<tr>
				<td class="upside">num</td>
				<td class="upside">/</td>
				<td class="upside">*</td>
				<td class="upside">-</td>
			</tr>
			<tr>
				<td><button type="button" onclick="click7()" class="push">7</button></td>
				<td><button type="button" onclick="click8()" class="push">8</button></td>
				<td><button type="button" onclick="click9()" class="push">9</button></td>
				<td rowspan="2">+</td>
			</tr>
			<tr>
				<td><button type="button" onclick="click4()" class="push">4</button></td>
				<td><button type="button" onclick="click5()" class="push">5</button></td>
				<td><button type="button" onclick="click6()" class="push">6</button></td>
			</tr>
			<tr>
				<td><button type="button" onclick="click1()" class="push">1</button></td>
				<td><button type="button" onclick="click2()" class="push">2</button></td>
				<td><button type="button" onclick="click3()" class="push">3</button></td>
				<td rowspan="2">enter</td>

				<!-- <form action="/SampleProject/ServletGetPayment001" method="post" class="receiving">
					<!-- <td rowspan="2"><button type="button" name="enter" class="push">Enter</button></td>
					<td rowspan="2"><input type="submit" name="payment-001" value="確定" class="next"></td>
				</form>  -->

			</tr>
			<tr>
				<td colspan="2"><button type="button" onclick="click0()" class="push">0</button></td>
				<td><button type="button" onclick="numErase()" class="push">消す</button></td>
			</tr>
		</table>
	</div>

</body>
</html>