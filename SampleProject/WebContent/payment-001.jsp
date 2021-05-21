<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>31レジシステム</title>
<link rel="stylesheet" href="css/payment-001.css">
</head>
<body>

	<script>
		//受取金額
		var payment = 0;

		//それぞれのボタンが押された時の処理

		function click1() {

			payment = payment * 10 + 1;

			document.getElementById("numValue").innerHTML = payment;

		}

		function click2() {

			payment = payment * 10 + 2;

			document.getElementById("numValue").innerHTML = payment;

		}

		function click3() {

			payment = payment * 10 + 3;

			document.getElementById("numValue").innerHTML = payment;

		}

		function click4() {

			payment = payment * 10 + 4;

			document.getElementById("numValue").innerHTML = payment;

		}

		function click5() {

			payment = payment * 10 + 5;

			document.getElementById("numValue").innerHTML = payment;

		}

		function click6() {

			payment = payment * 10 + 6;

			document.getElementById("numValue").innerHTML = payment;

		}

		function click7() {

			payment = payment * 10 + 7;

			document.getElementById("numValue").innerHTML = payment;

		}

		function click8() {

			payment = payment * 10 + 8;

			document.getElementById("numValue").innerHTML = payment;

		}

		function click9() {

			payment = payment * 10 + 9;

			document.getElementById("numValue").innerHTML = payment;

		}

		function click0() {

			payment = payment * 10 + 0;

			document.getElementById("numValue").innerHTML = payment;

		}

		function numErase() {

			payment = Math.floor(payment / 10);

			document.getElementById("numValue").innerHTML = payment;

		}
	</script>

	<div class="main">
		<form action="/SampleProject/ServletGetPayment001" method="post" class="receiving">
			<img src=img/31logo.png class="image-vw">

			<h2>合計金額</h2>
			<p class="total">\1500</p>

			<!-- idを指定した箇所の値が<script>タグの「document.getElement...」によって変更される -->
			<h2>受注金額</h2>
			<input type="number" name="txt" size="20" id="numValue" value="0">
			<br>

			<h2>差額</h2>
			<p class="difference">\50</p>

			<p>
				<input type="submit" name="payment-001" value="戻る" class="back">
				<input type="submit" name="payment-001" value="決済を行う" class="next">
			</p>

		</form>
	</div>

	<div class="calculator">
		<table border="1">
			<tr>
				<td>num</td>
				<td>/</td>
				<td>*</td>
				<td>-</td>
			</tr>
			<tr>
				<td><button type="button" onclick="click7()">7</button></td>
				<td><button type="button" onclick="click8()">8</button></td>
				<td><button type="button" onclick="click9()">9</button></td>
				<td rowspan="2">+</td>
			</tr>
			<tr>
				<td><button type="button" onclick="click4()">4</button></td>
				<td><button type="button" onclick="click5()">5</button></td>
				<td><button type="button" onclick="click6()">6</button></td>
			</tr>
			<tr>
				<td><button type="button" onclick="click1()">1</button></td>
				<td><button type="button" onclick="click2()">2</button></td>
				<td><button type="button" onclick="click3()">3</button></td>
				<td rowspan="2">enter</td>
			</tr>
			<tr>
				<td colspan="2"><button type="button" onclick="click0()">0</button></td>
				<td><button type="button" onclick="numErase()">消す</button></td>
			</tr>
		</table>
	</div>

</body>
</html>