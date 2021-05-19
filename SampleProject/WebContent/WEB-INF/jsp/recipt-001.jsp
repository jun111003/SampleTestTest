<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.sql.Connection, java.sql.DriverManager,javasrc.*,java.util.*
                 ,java.sql.PreparedStatement, java.sql.ResultSet, java.sql.SQLException"
 %>
<%--servletでセッションスコープの作成が必要 --%>
<%
	Sales sale = new Sales();
	sale.setSales_id(1);
	sale.setOrder_id(1);
	Date d = new Date();
	sale.setSales_date(d);
	sale.setEmployee_id("E001");
	sale.setIce_cream_container_id("C001");
	sale.setIce_cream_inf_id("Inf006");
	sale.setFleavor_id_1("ポッピングシャワー");
	sale.setFleavor_id_2("キャラメルリボン");
	sale.setFleavor_id_3("ロッキーロード");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>31レジシステム</title>
</head>
<body>
   <img src ="file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/31ロゴ.png"
    alt = "ロゴマーク"
    width = "206"
    height = "70">

   <h3>以下の内容でレシートを発行しました。</h3>

   <p style = "text-align:center">
    <img src ="file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/31ロゴ.png"
    alt = "ロゴマーク"
    width = "180"
    height = "70">
   </p>
   <p style = "text-align:center">≪領収書≫</p>

   <p><span style="margin-right:18em;"></span>購入日時:
       <%=sale.getSales_date() %>
   </p>

   <p><span style="margin-right:18em;"></span>担当者 名前
       <%-- try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/workspace?"
          + "serverTimezone=JST&useUnicode=true&characterEncoding=UTF-8", "root", "root")){
    	  String code =sales.getEmployee_id();

		  String sql = "SELECT employee_name FROM employee WHERE employee_id =" + code ;
		  PreparedStatement pStmt = conn.prepareStatement(sql);

		  ResultSet rs = pStmt.executeQuery();

		  while (rs.next()) {
			  String name = rs.getString("NAME");
			  System.out.println(name);
		  }

          } catch (SQLException e) {
                System.out.println("MySQLに接続できませんでした");
          } catch (Exception e) {
                e.printStackTrace();
          }
        --%>
   </p>

   <p><span style="margin-right:18em;"></span>サイズ:
		                                      個数:
		                                      容器:
   </p>

   <p><span style="margin-right:20em;"></span>―フレーバー名

   </p>

   <p><span style="margin-right:20em;"></span>―フレーバー名

   </p>

   <p><span style="margin-right:20em;"></span>―フレーバー名

   </p>

   <span style="margin-right:35em;"></span>&yen;小計

   <p><span style="margin-right:18em;"></span>小計</p>

   <p><span style="margin-right:18em;"></span>ーーーーーーーーーーーーーーーーーーーー</p>

   <p><span style="margin-right:18em;"></span>合計<span style="margin-right:12em;"></span>&yen;</p>

   <p><span style="margin-right:18em;"></span>お預かり<span style="margin-right:12em;"></span>&yen;</p>

   <p><span style="margin-right:18em;"></span>おつり<span style="margin-right:12em;"></span>&yen;</p>

   <p><span style="margin-right:18em;"></span>ーーーーーーーーーーーーーーーーーーーー</p>

   <p style = "text-align:center">またのご利用をお待ちしております。</p>

   <p><input type="reset" value="ホームへ戻る"></p>

</body>
</html>