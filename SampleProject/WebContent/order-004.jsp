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
<link rel="stylesheet" href="css/order-004.css">
</head>
<body>
	<img src=img/31logo.png class="image-vw">

	<form action="/SampleProjectMaster/ServletGetOrder004" method="post">

		<div class="title">
			<p>ご注文内容を確定させてよろしいですか？</p>
		</div>

		<table border="1">
			<tr class="top">
				<td>注文内容</td>
				<td>サイズ</td>
				<td>フレーバー1</td>
				<td>フレーバー2</td>
				<td>フレーバー3</td>
				<td>容器</td>
				<td>小計</td>
				<td>修正</td>
			</tr>

			<%if(sales1.getIce_cream_count_name() == null) {%>

			<% }else{ %>
			<tr class="white">
				<td rowspan="1"><%=sales1.getIce_cream_count_name()%></td>
				<td><%=sales1.getIce_cream_size_name()%></td>
				<td><%=sales1.getFlavor_name_1()%></td>
				<%if(sales1.getIce_cream_count_id().equals("No002") || sales1.getIce_cream_count_id().equals("No003")) { %>
				<td><%=sales1.getFlavor_name_2()%></td>
				<%} %>
				<%if(sales1.getIce_cream_count_id().equals("No003")) { %>
				<td><%=sales1.getFlavor_name_3()%></td>
				<%} %>
				<td><%=sales1.getIce_cream_container_name()%></td>
				<td><%=sales1.getMoney()%></td>
				<td><input type="submit" name="order-004" value="注文1を修正" class="delete"></td>
			</tr>
			<% } %>


            <%if(sales2.getIce_cream_count_name() == null) {%>

			<% }else{ %>
            <tr class="pink">
				<td rowspan="1"><%=sales2.getIce_cream_count_name()%></td>
				<td><%=sales2.getIce_cream_size_name()%></td>
				<td><%=sales2.getFlavor_name_1()%></td>
				<%if(sales2.getIce_cream_count_id().equals("No002") || sales2.getIce_cream_count_id().equals("No003")) { %>
				<td><%=sales2.getFlavor_name_2()%></td>
				<%} %>
				<%if(sales2.getIce_cream_count_id().equals("No003")) { %>
				<td><%=sales2.getFlavor_name_3()%></td>
				<%} %>
				<td><%=sales2.getIce_cream_container_name()%></td>
				<td><%=sales2.getMoney()%></td>
				<td><input type="submit" name="order-004" value=注文2を修正 class="delete"></td>
			</tr>
			<% } %>


            <%if(sales3.getIce_cream_count_name() == null) {%>

			<% }else{ %>
			<tr class="white">
				<td rowspan="1"><%=sales3.getIce_cream_count_name()%></td>
				<td><%=sales3.getIce_cream_size_name()%></td>
				<td><%=sales3.getFlavor_name_1()%></td>
				<%if(sales3.getIce_cream_count_id().equals("No002") || sales3.getIce_cream_count_id().equals("No003")) { %>
				<td><%=sales3.getFlavor_name_2()%></td>
				<%} %>
				<%if(sales3.getIce_cream_count_id().equals("No003")) { %>
				<td><%=sales3.getFlavor_name_3()%></td>
				<%} %>
				<td><%=sales3.getIce_cream_container_name()%></td>
				<td><%=sales3.getMoney()%></td>
				<td><input type="submit" name="order-004" value="注文3を修正" class="delete"></td>
			</tr>
			<% } %>


			<%if(sales4.getIce_cream_count_name() == null) {%>

			<% }else{ %>
			<tr class="pink">
				<td rowspan="1"><%=sales4.getIce_cream_count_name()%></td>
				<td><%=sales4.getIce_cream_size_name()%></td>
				<td><%=sales4.getFlavor_name_1()%></td>
				<%if(sales4.getIce_cream_count_id().equals("No002") || sales4.getIce_cream_count_id().equals("No003")) { %>
				<td><%=sales4.getFlavor_name_2()%></td>
				<%} %>
				<%if(sales4.getIce_cream_count_id().equals("No003")) { %>
				<td><%=sales4.getFlavor_name_3()%></td>
				<%} %>
				<td><%=sales4.getIce_cream_container_name()%></td>
				<td><%=sales4.getMoney()%></td>
				<td><input type="submit" name="order-004" value="注文4を修正" class="delete"></td>
			</tr>
			<% } %>


			<%if(sales5.getIce_cream_count_name() == null) {%>

			<% }else{ %>
			<tr class="white">
				<td rowspan="1"><%=sales5.getIce_cream_count_name()%></td>
				<td><%=sales5.getIce_cream_size_name()%></td>
				<td><%=sales5.getFlavor_name_1()%></td>
				<%if(sales5.getIce_cream_count_id().equals("No002") || sales5.getIce_cream_count_id().equals("No003")) { %>
				<td><%=sales5.getFlavor_name_2()%></td>
				<%} %>
				<%if(sales5.getIce_cream_count_id().equals("No003")) { %>
				<td><%=sales5.getFlavor_name_3()%></td>
				<%} %>
				<td><%=sales5.getIce_cream_container_name()%></td>
				<td><%=sales5.getMoney()%></td>
				<td><input type="submit" name="order-004" value="注文5を修正" class="delete"></td>
			</tr>
			<% } %>


			<%if(sales6.getIce_cream_count_name() == null) {%>

			<% }else{ %>
			<tr class="pink">
				<td rowspan="1"><%=sales6.getIce_cream_count_name()%></td>
				<td><%=sales6.getIce_cream_size_name()%></td>
				<td><%=sales6.getFlavor_name_1()%></td>
				<%if(sales6.getIce_cream_count_id().equals("No002") || sales6.getIce_cream_count_id().equals("No003")) { %>
				<td><%=sales6.getFlavor_name_2()%></td>
				<%} %>
				<%if(sales6.getIce_cream_count_id().equals("No003")) { %>
				<td><%=sales6.getFlavor_name_3()%></td>
				<%} %>
				<td><%=sales6.getIce_cream_container_name()%></td>
				<td><%=sales6.getMoney()%></td>
				<td><input type="submit" name="order-004" value="注文6を修正" class="delete"></td>
			</tr>
			<% } %>


			<%if(sales7.getIce_cream_count_name() == null) {%>

			<% }else{ %>
			<tr class="white">
				<td rowspan="1"><%=sales7.getIce_cream_count_name()%></td>
				<td><%=sales7.getIce_cream_size_name()%></td>
				<td><%=sales7.getFlavor_name_1()%></td>
				<%if(sales7.getIce_cream_count_id().equals("No002") || sales7.getIce_cream_count_id().equals("No003")) { %>
				<td><%=sales7.getFlavor_name_2()%></td>
				<%} %>
				<%if(sales7.getIce_cream_count_id().equals("No003")) { %>
				<td><%=sales7.getFlavor_name_3()%></td>
				<%} %>
				<td><%=sales7.getIce_cream_container_name()%></td>
				<td><%=sales7.getMoney()%></td>
				<td><input type="submit" name="order-004" value="注文7を修正" class="delete"></td>
			</tr>
			<% } %>


			<%if(sales8.getIce_cream_count_name() == null) {%>

			<% }else{ %>
			<tr class="pink">
				<td rowspan="1"><%=sales8.getIce_cream_count_name()%></td>
				<td><%=sales8.getIce_cream_size_name()%></td>
				<td><%=sales8.getFlavor_name_1()%></td>
				<%if(sales8.getIce_cream_count_id().equals("No002") || sales8.getIce_cream_count_id().equals("No003")) { %>
				<td><%=sales8.getFlavor_name_2()%></td>
				<%} %>
				<%if(sales8.getIce_cream_count_id().equals("No003")) { %>
				<td><%=sales8.getFlavor_name_3()%></td>
				<%} %>
				<td><%=sales8.getIce_cream_container_name()%></td>
				<td><%=sales8.getMoney()%></td>
				<td><input type="submit" name="order-004" value="注文8を修正" class="delete"></td>
			</tr>
			<% } %>


			<%if(sales9.getIce_cream_count_name() == null) {%>

			<% }else{ %>
			<tr class="white">
				<td rowspan="1"><%=sales9.getIce_cream_count_name()%></td>
				<td><%=sales9.getIce_cream_size_name()%></td>
				<td><%=sales9.getFlavor_name_1()%></td>
				<%if(sales9.getIce_cream_count_id().equals("No002") || sales9.getIce_cream_count_id().equals("No003")) { %>
				<td><%=sales9.getFlavor_name_2()%></td>
				<%} %>
				<%if(sales9.getIce_cream_count_id().equals("No003")) { %>
				<td><%=sales9.getFlavor_name_3()%></td>
				<%} %>
				<td><%=sales9.getIce_cream_container_name()%></td>
				<td><%=sales9.getMoney()%></td>
				<td><input type="submit" name="order-004" value="注文9を修正" class="delete"></td>
			</tr>
			<% } %>


			<%if(sales10.getIce_cream_count_name() == null) {%>

			<% }else{ %>
			<tr class="pink">
				<td rowspan="1"><%=sales10.getIce_cream_count_name()%></td>
				<td><%=sales10.getIce_cream_size_name()%></td>
				<td><%=sales10.getFlavor_name_1()%></td>
				<%if(sales10.getIce_cream_count_id().equals("No002") || sales10.getIce_cream_count_id().equals("No003")) { %>
				<td><%=sales10.getFlavor_name_2()%></td>
				<%} %>
				<%if(sales10.getIce_cream_count_id().equals("No003")) { %>
				<td><%=sales10.getFlavor_name_3()%></td>
				<%} %>
				<td><%=sales10.getIce_cream_container_name()%></td>
				<td><%=sales10.getMoney()%></td>
				<td><input type="submit" name="order-004" value="注文10を修正" class="delete"></td>
			</tr>
			<% } %>
		</table>


		<p>
			<input type="submit" name="order-004" value="注文内容を修正する" class="back">
			<input type="submit" name="order-004" value="追加で注文する" class="back">
			<input type="submit" name="order-004" value="注文を確定させる" class="next">
		</p>
	</form>
</body>
</html>