<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="javasrc.Stock" %>
    <%
    //リクエストスコープから値を取得
    Stock[] stock =(Stock[]) request.getAttribute("stock[]");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>31レジシステム</title>
<link rel="stylesheet" href="css/stock-001.css">
</head>
<body>
	<img src="img/31logo.png" class="image-vw">
	<p class="stock">在庫情報</p>
	<table border="1">
		<tr class="top">
			<td>フレーバー名</td>
			<td>在庫（g）</td>
		</tr>
		<%for(int i = 0; i < 10; i ++) {%>
		<%if(i %2 == 1) {%>
		<tr class="white">
		<% } else { %>
		<tr class="pink">
		<% } %>
			<td rowspan="1">
				<%=stock[i].getFlavor_name()%>
			</td>
			<td>
				<%=stock[i].getFlavor_volume()%>
			</td>
		</tr>
		<% } %>


    <table border="1">
		<tr class="top">
			<td>容器名</td>
			<td>在庫（個）</td>
		</tr>
        <%for(int i = 10; i < 13; i ++) {%>
		<%if(i %2 == 1) {%>
		<tr class="white">
		<% } else { %>
		<tr class="pink">
		<% } %>
			<td rowspan="1">
				<%=stock[i].getIce_cream_container_name()%>
			</td>
			<td>
				<%=stock[i].getIce_cream_container_stock()%>
			</td>
		</tr>
		<% } %>
	</table>
		<a href="/SampleProjectMaster/ServletStockControl?action=backToHome" class="back">戻る</a>
</body>
</html>