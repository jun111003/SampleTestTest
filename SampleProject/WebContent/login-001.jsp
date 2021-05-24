<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>31レジシステム</title>
<link rel="stylesheet" href="css/login-001.css">
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
<img src="img/31logo.png" class="image-vw">
<form action="/SampleProjectMaster/ServletLogin" method="post">
	<p>ID・パスワードを入力</p>
		<p>
			ID:
			<input type="text" name="id" size="40">
		</p>
		<p>
		    PS:
		    <input type="password" name="ps" size="40">
		</p>
		<p>
			<input type="submit" name="home-001" value="ログイン" class="next">
		</p>
	</form>
</body>
</html>

<!-- 変更点　パスの書き方変える、31logo.pngの位置変える -->