<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>31レジシステム</title>
<link rel="stylesheet" href="/SampleProject/css/payment-001.css">
</head>
<body>

	<script>
		//受取金額
		var payment = 0;

		//それぞれのボタンが押された時の処理

		function click1() {

			payment = payment * 10 + 1;

			document.getElementById("numValue").value = payment;

		}

		function click2() {

			payment = payment * 10 + 2;

			document.getElementById("numValue").value = payment;

		}

		function click3() {

			payment = payment * 10 + 3;

			document.getElementById("numValue").value = payment;

		}

		function click4() {

			payment = payment * 10 + 4;

			document.getElementById("numValue").value= payment;

		}

		function click5() {

			payment = payment * 10 + 5;

			document.getElementById("numValue").value= payment;

		}

		function click6() {

			payment = payment * 10 + 6;

			document.getElementById("numValue").value = payment;

		}

		function click7() {

			payment = payment * 10 + 7;

			document.getElementById("numValue").value = payment;

		}

		function click8() {

			payment = payment * 10 + 8;

			document.getElementById("numValue").value= payment;

		}

		function click9() {

			payment = payment * 10 + 9;

			document.getElementById("numValue").value = payment;

		}

		function click0() {

			payment = payment * 10 + 0;

			document.getElementById("numValue").value= payment;

		}

		function numErase() {

			payment = Math.floor(payment / 10);

			document.getElementById("numValue").value = payment;

		}
	</script>


	<form action="/SampleProject/ServletGetPayment001" method="post" class="receiving">
			<img src=img/31logo.png class="image-vw">

        <div class="main">
			<h2>合計金額</h2>
			<p class="total">\1500</p>


			<!-- idを指定した箇所の値が<script>タグの「document.getElement...」によって変更される -->
            <h2>受取金額</h2>
            <input type="number" name="txt" id="numValue" value="0" class="put">
            <br>


			<h2>差額</h2>
			<p class="difference">\50</p>

			<p>
				<input type="submit" name="payment-001" value="戻る" class="back">
				<input type="submit" name="payment-001" value="決済を行う" class="next">
			</p>
         </div>
	</form>


	<div class="calculator">
		<table border="0">
			<tr>
				<td class ="upside">num</td>
				<td class ="upside">/</td>
				<td class ="upside">*</td>
				<td class ="upside">-</td>
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
			</tr>
			<tr>
				<td colspan="2"><button type="button" onclick="click0()" class="push">0</button></td>
				<td><button type="button" onclick="numErase()" class="push">消す</button></td>
			</tr>
		</table>
	</div>

</body>
</html>