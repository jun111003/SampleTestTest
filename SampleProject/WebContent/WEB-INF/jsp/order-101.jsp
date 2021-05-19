<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注文画面</title>
</head>
<body>
	<script>
		function cupFlagSingle() {
			document.getElementById("cup1").removeAttribute("disabled");
			document.getElementById("cup1").style.color = "White";
			document.getElementById("cup2").removeAttribute("disabled");
			document.getElementById("cup2").style.color = "White";
			document.getElementById("cup3").removeAttribute("disabled");
			document.getElementById("cup3").style.color = "White";
		}

		function cupFlagDouble() {
			document.getElementById("cup1").removeAttribute("disabled");
			document.getElementById("cup1").style.color = "White";
			document.getElementById("cup2").removeAttribute("disabled");
			document.getElementById("cup2").style.color = "White";
			document.getElementById("cup3").removeAttribute("disabled");
			document.getElementById("cup3").style.color = "White";
		}

		function cupFlagTriple() {
			document.getElementById("cup1").setAttribute("disabled", true);
			document.getElementById("cup1").style.color = "Black";
			document.getElementById("cup2").removeAttribute("disabled");
			document.getElementById("cup2").style.color = "White";
			document.getElementById("cup3").setAttribute("disabled", true);
			document.getElementById("cup3").style.color = "Black";
		}
	</script>


	<form action=ServletTest method="post">

		<p>アイスの個数を選択してください</p>
		<label>
			<input type="radio" name="number" value="1" onclick="cupFlagSingle()">
			シングル
		</label>
		<label>
			<input type="radio" name="number" value="2" onclick="cupFlagDouble()">
			ダブル
		</label>
		<label>
			<input type="radio" name="number" value="3" onclick="cupFlagTriple()">
			トリプル
		</label>



		<p>容器を選択してください</p>
		<label>
			<input type="radio" id="cup1" name="cup" value="1" disabled>
			コーン
		</label>
		<label>
			<input type="radio" id="cup2" name="cup" value="2" disabled>
			カップ
		</label>
		<label>
			<input type="radio" id="cup3" name="cup" value="3" disabled>
			ワッフルコーン
		</label>

		<p>一つ目のフレーバーを選択してください</p>
		<label>
			<input type="radio" id="fleaver1" name="fleaver" value="1">
			キャラメルリボン
		</label>
		<label>
			<input type="radio" id="fleaver2" name="fleaver" value="2" disabled>
			キャラメルリボン
		</label>
		<label>
			<input type="radio" id="fleaver3" name="fleaver" value="3" disabled>
			抹茶
		</label>
		<label>
			<input type="radio" id="fleaver4" name="fleaver" value="4" disabled>
			ストロベリーチーズケーキ
		</label>
		<label>
			<input type="radio" id="fleaver5" name="fleaver" value="5" disabled>
			クッキーアンドクリーム
		</label>


		<p>
			<input type="submit" value="送信">
			<input type="reset" value="リセット">
		</p>
	</form>

</body>
</html>