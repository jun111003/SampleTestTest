<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="sampleClass.SampleClass"%>

<%
	//セッションスコープからユーザー情報を取得
	SampleClass sampleClass = (SampleClass) session.getAttribute("sampleClass");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>31レジシステム</title>
<link rel="stylesheet" href="css/home-001.css">
<img src=img/ホーム画像.png class="image-vw">
</head>

<body>
	<%
		//セッションスコープが作成されている（正常にログインできた）場合
		if (sampleClass != null) {
	%>

	<a href="/SampleProject/OrderStartServlet">注文する</a>


	<%
		} else {
	%>

	<p>ログインに失敗しました</p>
	<br>
	<br>

	<a href="/SampleProject/ServletLogin">ログイン画面へ</a>

	<%
		}
	%>
</body>

</html>