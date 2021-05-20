<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="model.SampleClass" %>

<%
//セッションスコープからユーザー情報を取得
SampleClass sampleClass = (SampleClass)session.getAttribute("sampleClass");
%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>31レジシステム</title>
	<link rel="stylesheet" href="/SampleProject/css/home-001.css">
	<img src=file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/31logo.png alt="" class="logo" width=60% height=60%>
</head>

<body>


<%//セッションスコープが作成されている（正常にログインできた）場合
if(sampleClass != null) { %>

	<a href = "/SampleProject/ServletTest?action=moveOrder-001">注文する</a>


<%} else { %>

	<p>ログインに失敗しました</p><br><br>

	<a href="/SampleProject/ServletTest">ログイン画面へ</a>

<% } %>


</body>

</html>