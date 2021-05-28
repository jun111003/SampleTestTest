<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="javasrc.*,java.util.*,java.text.SimpleDateFormat,java.io.PrintWriter"%>
<%@ page import="javasrc.*"%>
<%@ page import="java.io.IOException" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>

<%
/*try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/workspace?"
		+ "serverTimezone=JST&useUnicode=true&characterEncoding=UTF-8", "root", "root")) {

	//sql文の設定
	String sql = "SELECT * FROM sales";
	//String sql1 = "select ice_cream_flavor_name from ice_cream_flavor where ice_cream_flavor_id = ?";
	PreparedStatement pStmt = conn.prepareStatement(sql);
	//PreparedStatement pStmt1 = conn.prepareStatement(sql1);

	//?に値をセット
	//pStmt1.setString();

	//selectを実行し、結果表(ResultSet)を取得
	ResultSet rs = pStmt.executeQuery();

	int i = 1;

	//結果表に格納されたレコードを表示
	while (rs.next()) {

		int sales_id = rs.getInt("sales_id");
		System.out.println(i + "行目のsales_id：" + sales_id);




		//sales.setIce_cream_container_name(rs.getString("ice_cream_container_name"));
		//sales.setIce_cream_container_price(rs.getInt("ice_cream_container_price"));

		i++;

	}

	pStmt.close();

} catch (SQLException e) {
	System.out.println("MySQLに接続できませんでした");
} catch (Exception e) {
	e.printStackTrace();
}*/
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>31レジシステム</title>
<link rel="stylesheet" href="css/order-004.css">
</head>
<body>
<img src="img/31logo.png" class="image-vw">

	<h3>売上管理機能</h3>

	<table border="1">
		<!-- <tr>
			<td>発注番号</td>
			<td>注文番号</td>
			<td>売上時間</td>
			<td>従業員番号</td>
			<td>アイス容器ID</td>
	     	<td>アイス詳細ID</td>
			<td>フレーバーID1</td>
			<td>フレーバーID2</td>
			<td>フレーバーID3</td>
			<td>小計</td>
		</tr>
				 -->
		<tr>
			<td>発注番号</td>
			<td>注文番号</td>
			<td>売上時間</td>
			<td>従業員名</td>
			<td>アイス容器名</td>
			<td>フレーバーID1</td>
			<td>フレーバーID2</td>
			<td>フレーバーID3</td>
			<td>小計</td>
		</tr>

		<%
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/workspace?"
				+ "serverTimezone=JST&useUnicode=true&characterEncoding=UTF-8", "root", "root")) {

			//sql文の設定
			String sql = "SELECT sales.sales_id, sales.order_id, sales.sales_date, employee.employee_name, ice_cream_container.ice_cream_container_name, sales.flavor_id_1, sales.flavor_id_2, sales.flavor_id_3, ice_cream_inf.ice_cream_price FROM sales JOIN employee ON sales.employee_id = employee.employee_id JOIN ice_cream_container ON sales.ice_cream_container_id = ice_cream_container.ice_cream_container_id JOIN ice_cream_inf ON sales.ice_cream_inf_id = ice_cream_inf.ice_cream_inf_id;";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			//sql文の設定
			//String sql1 = "select employee_name from employee where employee_id = ?";
			//PreparedStatement pStmt1 = conn.prepareStatement(sql1);

			//?に値をセット
			//pStmt1.setString();

			//?に値をセット
			//pStmt.setString(1, sales.getIce_cream_container_id());

			//selectを実行し、結果表(ResultSet)を取得
			ResultSet rs = pStmt.executeQuery();

			int i = 1;

			//結果表に格納されたレコードを表示
			while (rs.next()) {

				int sales_id = rs.getInt("sales_id");
				int order_id = rs.getInt("order_id");
				Date sales_date = rs.getDate("sales_date");
				//String employee_id = rs.getString("employee_id");
				String employee_name = rs.getString("employee_name");
				String ice_cream_container_name = rs.getString("ice_cream_container_name");
				//String ice_cream_inf_id = rs.getString("ice_cream_inf_id");
				String flavor_id_1 = rs.getString("flavor_id_1");
				String flavor_id_2 = rs.getString("flavor_id_2");
				String flavor_id_3 = rs.getString("flavor_id_3");
				int ice_cream_price = rs.getInt("ice_cream_price");

				//デバッグ用
				System.out.println(i + "行目のsales_id：" + sales_id);
				System.out.println(i + "行目のorder_id：" + order_id);
				System.out.println(i + "行目のsales_date：" + sales_date);
				System.out.println(i + "行目のemployee_name：" + employee_name);
				System.out.println(i + "行目のice_cream_container_name：" + ice_cream_container_name);
				System.out.println(i + "行目のflavor_id_1：" + flavor_id_1);
				System.out.println(i + "行目のflavor_id_2：" + flavor_id_2);
				System.out.println(i + "行目のflavor_id_3：" + flavor_id_3);
				System.out.println(i + "行目のice_cream_price：" + ice_cream_price);

				//sales.setIce_cream_container_name(rs.getString("ice_cream_container_name"));
				//sales.setIce_cream_container_price(rs.getInt("ice_cream_container_price"));

				i++;
		%>
				<tr>
				<td rowspan="1"><%= sales_id %></td>
				<td><%= order_id %></td>
				<td><%= sales_date %></td>
				<td><%= employee_name %></td>
				<td><%= ice_cream_container_name %></td>
				<td><%= flavor_id_1 %></td>
				<td><%= flavor_id_2 %></td>
				<td><%= flavor_id_3 %></td>
				<td><%= ice_cream_price %></td>
		</tr>


		<%	}

			pStmt.close();

		} catch (SQLException e) {
			System.out.println("MySQLに接続できませんでした");
		} catch (Exception e) {
			e.printStackTrace();
		}
		%>

	</table>

	<form action="/SampleProjectMaster/ServletGetSales001" method="post">
		<p>
			<input type="submit" name="recipt-001" value="ホームへ戻る" class="back">
		</p>
	</form>

</body>
</html>