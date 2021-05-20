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
<link rel="stylesheet" href="/SampleProject/css/home-001.css">
<img src=file:///C:/Users/user2021/git/SampleTestTest/SampleProject/WebContent/WEB-INF/img/31logo.png alt=""
	class="logo" width=60% height=60%>
</head>

<body>
	<%
		//セッションスコープが作成されている（正常にログインできた）場合
		if (sampleClass != null) {
	%>
	<div>
		<a href="/SampleProject/OrderStartServlet">注文する</a>
	</div>
	<%
		} else {
	%>

	<p>ログインに失敗しました</p>
	<br>
	<br>
	<div>
		<a href="/SampleProject/ServletLogin">ログイン画面へ</a>
	</div>

	<%
		}
	%>


</body>

</html>