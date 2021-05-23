<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>31レジシステム</title>
<link rel="stylesheet" href="css/login-001.css">
<img src=img/31ロゴ.png>
</head>
<script>
	function check() {
		var flag = 0;
		if (document.form1.id.value == "") {
			flag = 1;
		} else if (document.form1.ps.value == "") {
			flag = 1;
		}

		if (flag==1) {
			window.alert('必須項目に未記入がありました');
			return false;
		} else {
			return true;
		}
	}
</script>

<body>
	<form action="/SampleProject/ServletLogin" method="post" name="form1" onSubmit="return check()">
		<p>
			ID:
			<input type="text" name="id" size="40">
		</p>
		<p>
			PS
			<input type="text" name="ps">
		</p>

		<p>
			<input type="submit" name="home-001" value="ログイン" class="next">
		</p>
	</form>
</body>
</html>