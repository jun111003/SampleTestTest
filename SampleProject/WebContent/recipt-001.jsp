<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="javasrc.*,java.util.*,java.text.SimpleDateFormat,java.io.PrintWriter"%>
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
<link rel="stylesheet" href="css/reciept-001.css">
</head>
<body>
	<img src=img/31logo.png alt="31ロゴマーク" width=20% height=20%>

	<h3>以下の内容でレシートを発行しました。</h3>

	<div class="receipt">
		<p class="center">
			<img src=img/31logo.png alt="31ロゴマーク" width=180px height=70px>
		</p>
		<p class="center">≪領収書≫</p>

		<p class="left">
			購入時刻
			<%
			SimpleDateFormat f = new SimpleDateFormat("YYYY年MM月dd日 HH時mm分ss秒");
			Date now = new Date();
			String d = f.format(now);
			order.setSales_date(d);
		%>
			<%=order.getSales_date()%>
			<%
				now = null;
			%>
		</p>

		<p class="left">
			担当者 名前
			<%=order.getEmployee_name()%></p>

		<%--ループ処理：購入個数分のインスタンスを利用して出力--%>
		<p class="left">
			サイズ
			<%=sales1.getIce_cream_size_name()%>
			個数
			<%=sales1.getIce_cream_count_name()%>
			容器
			<%=sales1.getIce_cream_container_name()%></p>

		<p class="middle-left">
			―フレーバー名
			<%=sales1.getFlavor_name_1()%></p>

		<%
			if (sales1.getIce_cream_count_id().equals("No003") || sales1.getIce_cream_count_id().equals("No002")) {
		%>
		<p class="middle-left">
			―フレーバー名
			<%=sales1.getFlavor_name_2()%></p>
		<%
			}
		%>
		<%
			if (sales1.getIce_cream_count_id().equals("No003")) {
		%>
		<p class="middle-left">
			―フレーバー名
			<%=sales1.getFlavor_name_3()%></p>
		<%
			}
		%>


		<%
			int sum = order.getMoney();
		%>
		<p class="right">
			&yen;<%=sum%></p>

		<p class="center">------------------------------------------------------------------</p>

		<p class="left">
			合計
			<%=sum%>&yen;
		</p>

		<p class="left">
			お預かり
			<%=sales1.getMoney()%>&yen;
		</p>

		<p class="left">
			おつり
			<%=sales1.getMoney() - sum%>&yen;
		</p>

		<p class="center">------------------------------------------------------------------</p>

		<p class="center">またのご利用をお待ちしております。</p>
	</div>
	<form action="/SampleProjectMaster/ServletGetRecipt001" method="post">
		<p>
			<input type="submit" name="recipt-001" value="ホームへ戻る" class="back">
		</p>
	</form>
</body>
</html>