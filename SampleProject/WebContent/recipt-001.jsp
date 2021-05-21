<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page
	import="java.sql.Connection, java.sql.DriverManager,javasrc.*,java.util.*,java.text.SimpleDateFormat,java.io.PrintWriter
                 ,java.sql.PreparedStatement, java.sql.ResultSet, java.sql.SQLException"%>
<%--以下テスト用インスタンス --%>
<%
	Sales sale = new Sales();
	sale.setSales_id("00001");
	sale.setOrder_id("00001");
	sale.setEmployee_id("E001");
	sale.setEmployee_name("ああああ");
	sale.setIce_cream_container_id("C001");
	sale.setIce_cream_container_name("カップ");
	sale.setIce_cream_container_price(0);
	sale.setIce_cream_inf_id("Inf006");
	sale.setIce_cream_size_id("S003");
	sale.setIce_cream_size_name("レギュラー");
	sale.setIce_cream_count_id("No003");
	sale.setIce_cream_count_name("トリプルホップ");
	sale.setIce_cream_price(580);
	sale.setFlavor_name_1("ポッピングシャワー");
	sale.setFlavor_name_2("キャラメルリボン");
	sale.setFlavor_name_3("ロッキーロード");
	sale.setMoney(1000);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>31レジシステム</title>
<link rel="stylesheet" href="css/reciept-001.css">
</head>
<body>
	<img src=img/31logo.png alt="31ロゴマーク" width=20%
		height=20%>

	<h3>以下の内容でレシートを発行しました。</h3>

	<div class="receipt">
		<p class="center">
			<img src=img/31logo.png alt="31ロゴマーク" width=180px
				height=70px>
		</p>
		<p class="center">≪領収書≫</p>

		<p class="left">
			購入日時:
			<%
			SimpleDateFormat f = new SimpleDateFormat("YYYY年MM月dd日 HH時mm分ss秒");
			Date now = new Date();
			String d = f.format(now);
			sale.setSales_date(d);
		%>
			<%=sale.getSales_date()%>
			<%
				now = null;
			%>
		</p>

		<p class="left">
			担当者 名前
			<%=sale.getEmployee_name()%>
		</p>

		<p class="left">
			サイズ:
			<%=sale.getIce_cream_size_name()%>
			個数:
			<%=sale.getIce_cream_count_name()%>
			容器:
			<%=sale.getIce_cream_container_name()%>
		</p>

		<p class="middle-left">
			―フレーバー名:
			<%=sale.getFlavor_name_1()%>
		</p>
		<%
			if (sale.getIce_cream_count_id().equals("No003") || sale.getIce_cream_count_id().equals("No002")) {
		%>
		<p class="middle-left">
			―フレーバー名:
			<%=sale.getFlavor_name_2()%>
		</p>
		<%
			}
		%>
		<%
			if (sale.getIce_cream_count_id().equals("No003")) {
		%>
		<p class="middle-left">
			―フレーバー名:
			<%=sale.getFlavor_name_3()%>
		</p>
		<%
			}
		%>

		<%
			int sum = sale.getIce_cream_container_price() + sale.getIce_cream_price();
		%>
		<p class="right">
			&yen;<%=sum%></p>

		<p class="left">小計</p>

		<p class="center">ーーーーーーーーーーーーーーーーーーーー</p>

		<p class="left">
			合計 <span style="margin-right: 16.1em;"></span>
			<%--ループ処理：購入個数分のインスタンスから購入金額を合計--%>
			<%=sum%>
			&yen;
		</p>

		<p class="left">
			お預かり <span style="margin-right: 14em;"></span>
			<%--セッションで持ってくる予定 --%>
			<%=sale.getMoney()%>
			&yen;
		</p>

		<p class="left">
			おつり <span style="margin-right: 15.5em;"></span>
			<%=sale.getMoney() - sum%>
			&yen;
		</p>

		<p class="center">ーーーーーーーーーーーーーーーーーーーー</p>

		<p class="center">またのご利用をお待ちしております。</p>
	</div>

	<p>
		<input type="reset" value="ホームへ戻る" class="back">
	</p>

</body>
</html>