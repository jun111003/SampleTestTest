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
	<img src="img/31logo.png" class="image-vw">

	<h3>以下の内容でレシートを発行しました。</h3>

	<div class="receipt">
		<p class="center">
			<img src="img/31ロゴ縮小.png" width=45% height=45%>
		</p>
		<p class="center">≪領収書≫</p>

		<p class="left">
			購入時刻:
			<%=order.getSales_date()%>
		</p>

		<p class="left">
			担当者:
			<%=order.getEmployee_name()%></p>

		<%--ループ処理：購入個数分のインスタンスを利用して出力--%>
		<p class="left">
			サイズ:
			<%=sales1.getIce_cream_size_name()%>
			個数:
			<%=sales1.getIce_cream_count_name()%>
			容器:
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

		<p class="right">
			&yen;<%=sales1.getMoney()%></p>

		<%
			if (sales2.getIce_cream_count_name() != null) {
		%>
		<p class="left">
			サイズ:
			<%=sales2.getIce_cream_size_name()%>
			個数:
			<%=sales2.getIce_cream_count_name()%>
			容器:
			<%=sales2.getIce_cream_container_name()%></p>

		<p class="middle-left">
			―フレーバー名
			<%=sales2.getFlavor_name_1()%></p>

		<%
			if (sales2.getIce_cream_count_id().equals("No003") || sales2.getIce_cream_count_id().equals("No002")) {
		%>
		<p class="middle-left">
			―フレーバー名
			<%=sales2.getFlavor_name_2()%></p>
		<%
			}
		%>
		<%
			if (sales2.getIce_cream_count_id().equals("No003")) {
		%>
		<p class="middle-left">
			―フレーバー名
			<%=sales2.getFlavor_name_3()%></p>
		<%
			}
		%>

		<p class="right">
			&yen;<%=sales2.getMoney()%></p>
		<%
			}
		%>

				<%
			if (sales3.getIce_cream_count_name() != null) {
		%>
		<p class="left">
			サイズ:
			<%=sales3.getIce_cream_size_name()%>
			個数:
			<%=sales3.getIce_cream_count_name()%>
			容器:
			<%=sales3.getIce_cream_container_name()%></p>

		<p class="middle-left">
			―フレーバー名
			<%=sales3.getFlavor_name_1()%></p>

		<%
			if (sales3.getIce_cream_count_id().equals("No003") || sales3.getIce_cream_count_id().equals("No002")) {
		%>
		<p class="middle-left">
			―フレーバー名
			<%=sales3.getFlavor_name_2()%></p>
		<%
			}
		%>
		<%
			if (sales3.getIce_cream_count_id().equals("No003")) {
		%>
		<p class="middle-left">
			―フレーバー名
			<%=sales3.getFlavor_name_3()%></p>
		<%
			}
		%>

		<p class="right">
			&yen;<%=sales3.getMoney()%></p>
		<%
			}
		%>

				<%
			if (sales4.getIce_cream_count_name() != null) {
		%>
		<p class="left">
			サイズ:
			<%=sales4.getIce_cream_size_name()%>
			個数:
			<%=sales4.getIce_cream_count_name()%>
			容器:
			<%=sales4.getIce_cream_container_name()%></p>

		<p class="middle-left">
			―フレーバー名
			<%=sales4.getFlavor_name_1()%></p>

		<%
			if (sales4.getIce_cream_count_id().equals("No003") || sales4.getIce_cream_count_id().equals("No002")) {
		%>
		<p class="middle-left">
			―フレーバー名
			<%=sales4.getFlavor_name_2()%></p>
		<%
			}
		%>
		<%
			if (sales4.getIce_cream_count_id().equals("No003")) {
		%>
		<p class="middle-left">
			―フレーバー名
			<%=sales4.getFlavor_name_3()%></p>
		<%
			}
		%>

		<p class="right">
			&yen;<%=sales4.getMoney()%></p>
		<%
			}
		%>

				<%
			if (sales5.getIce_cream_count_name() != null) {
		%>
		<p class="left">
			サイズ:
			<%=sales5.getIce_cream_size_name()%>
			個数:
			<%=sales5.getIce_cream_count_name()%>
			容器:
			<%=sales5.getIce_cream_container_name()%></p>

		<p class="middle-left">
			―フレーバー名
			<%=sales5.getFlavor_name_1()%></p>

		<%
			if (sales5.getIce_cream_count_id().equals("No003") || sales5.getIce_cream_count_id().equals("No002")) {
		%>
		<p class="middle-left">
			―フレーバー名
			<%=sales5.getFlavor_name_2()%></p>
		<%
			}
		%>
		<%
			if (sales5.getIce_cream_count_id().equals("No003")) {
		%>
		<p class="middle-left">
			―フレーバー名
			<%=sales5.getFlavor_name_3()%></p>
		<%
			}
		%>

		<p class="right">
			&yen;<%=sales5.getMoney()%></p>
		<%
			}
		%>

				<%
			if (sales6.getIce_cream_count_name() != null) {
		%>
		<p class="left">
			サイズ:
			<%=sales6.getIce_cream_size_name()%>
			個数:
			<%=sales6.getIce_cream_count_name()%>
			容器:
			<%=sales6.getIce_cream_container_name()%></p>

		<p class="middle-left">
			―フレーバー名
			<%=sales6.getFlavor_name_1()%></p>

		<%
			if (sales6.getIce_cream_count_id().equals("No003") || sales6.getIce_cream_count_id().equals("No002")) {
		%>
		<p class="middle-left">
			―フレーバー名
			<%=sales6.getFlavor_name_2()%></p>
		<%
			}
		%>
		<%
			if (sales6.getIce_cream_count_id().equals("No003")) {
		%>
		<p class="middle-left">
			―フレーバー名
			<%=sales6.getFlavor_name_3()%></p>
		<%
			}
		%>

		<p class="right">
			&yen;<%=sales6.getMoney()%></p>
		<%
			}
		%>

		<%
			if (sales7.getIce_cream_count_name() != null) {
		%>
		<p class="left">
			サイズ:
			<%=sales7.getIce_cream_size_name()%>
			個数:
			<%=sales7.getIce_cream_count_name()%>
			容器:
			<%=sales7.getIce_cream_container_name()%></p>

		<p class="middle-left">
			―フレーバー名
			<%=sales7.getFlavor_name_1()%></p>

		<%
			if (sales7.getIce_cream_count_id().equals("No003") || sales7.getIce_cream_count_id().equals("No002")) {
		%>
		<p class="middle-left">
			―フレーバー名
			<%=sales7.getFlavor_name_2()%></p>
		<%
			}
		%>
		<%
			if (sales7.getIce_cream_count_id().equals("No003")) {
		%>
		<p class="middle-left">
			―フレーバー名
			<%=sales7.getFlavor_name_3()%></p>
		<%
			}
		%>

		<p class="right">
			&yen;<%=sales7.getMoney()%></p>
		<%
			}
		%>


		<%
			if (sales8.getIce_cream_count_name() != null) {
		%>
		<p class="left">
			サイズ:
			<%=sales8.getIce_cream_size_name()%>
			個数:
			<%=sales8.getIce_cream_count_name()%>
			容器:
			<%=sales8.getIce_cream_container_name()%></p>

		<p class="middle-left">
			―フレーバー名
			<%=sales8.getFlavor_name_1()%></p>

		<%
			if (sales8.getIce_cream_count_id().equals("No003") || sales8.getIce_cream_count_id().equals("No002")) {
		%>
		<p class="middle-left">
			―フレーバー名
			<%=sales8.getFlavor_name_2()%></p>
		<%
			}
		%>
		<%
			if (sales8.getIce_cream_count_id().equals("No003")) {
		%>
		<p class="middle-left">
			―フレーバー名
			<%=sales8.getFlavor_name_3()%></p>
		<%
			}
		%>

		<p class="right">
			&yen;<%=sales8.getMoney()%></p>
		<%
			}
		%>

				<%
			if (sales9.getIce_cream_count_name() != null) {
		%>
		<p class="left">
			サイズ:
			<%=sales9.getIce_cream_size_name()%>
			個数:
			<%=sales9.getIce_cream_count_name()%>
			容器:
			<%=sales9.getIce_cream_container_name()%></p>

		<p class="middle-left">
			―フレーバー名
			<%=sales9.getFlavor_name_1()%></p>

		<%
			if (sales9.getIce_cream_count_id().equals("No003") || sales9.getIce_cream_count_id().equals("No002")) {
		%>
		<p class="middle-left">
			―フレーバー名
			<%=sales9.getFlavor_name_2()%></p>
		<%
			}
		%>
		<%
			if (sales9.getIce_cream_count_id().equals("No003")) {
		%>
		<p class="middle-left">
			―フレーバー名
			<%=sales9.getFlavor_name_3()%></p>
		<%
			}
		%>

		<p class="right">
			&yen;<%=sales9.getMoney()%></p>
		<%
			}
		%>

				<%
			if (sales10.getIce_cream_count_name() != null) {
		%>
		<p class="left">
			サイズ:
			<%=sales10.getIce_cream_size_name()%>
			個数:
			<%=sales10.getIce_cream_count_name()%>
			容器:
			<%=sales10.getIce_cream_container_name()%></p>

		<p class="middle-left">
			―フレーバー名
			<%=sales10.getFlavor_name_1()%></p>

		<%
			if (sales10.getIce_cream_count_id().equals("No003") || sales10.getIce_cream_count_id().equals("No002")) {
		%>
		<p class="middle-left">
			―フレーバー名
			<%=sales10.getFlavor_name_2()%></p>
		<%
			}
		%>
		<%
			if (sales10.getIce_cream_count_id().equals("No003")) {
		%>
		<p class="middle-left">
			―フレーバー名
			<%=sales10.getFlavor_name_3()%></p>
		<%
			}
		%>

		<p class="right">
			&yen;<%=sales10.getMoney()%></p>
		<%
			}
		%>

		<p class="center">ーーーーーーーーーーーーーーーーーーーーーーー</p>

		<p class="right">
			合計 &yen<%=order.getSumMoney()%>
		</p>

		<p class="right">
			お預かり &yen<%=order.getPayment()%>
		</p>

		<p class="right">
			おつり &yen<%=order.getChange()%>
		</p>

		<p class="center">ーーーーーーーーーーーーーーーーーーーーーーー</p>

		<p class="center">またのご利用をお待ちしております。</p>
	</div>
	<form action="/SampleProjectMaster/ServletGetRecipt001" method="post">
		<p>
			<input type="submit" name="recipt-001" value="ホームへ戻る" class="back">
		</p>
	</form>
</body>
</html>