package SampleServlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javasrc.Stock;

/**
 * Servlet implementation class ServletStockControl
 */
@WebServlet("/ServletStockControl")
public class ServletStockControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletStockControl() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

		//フォワード先
		String forwardPath = null;

		//servletクラスの動作を決定する"action"の値を
		//リクエストパラメータから取得
		String action = request.getParameter("action");

		if (action == null) {
			//Salesインスタンスを宣言
			Stock stock1 = new Stock();
			Stock stock2 = new Stock();
			Stock stock3 = new Stock();
			Stock stock4 = new Stock();
			Stock stock5 = new Stock();
			Stock stock6 = new Stock();
			Stock stock7 = new Stock();
			Stock stock8 = new Stock();
			Stock stock9 = new Stock();
			Stock stock10 = new Stock();
			Stock stock11 = new Stock();
			Stock stock12 = new Stock();
			Stock stock13 = new Stock();
			//配列を生成
			Stock[] stock = { stock1, stock2, stock3, stock4, stock5, stock6, stock7, stock8, stock9, stock10, stock11,
					stock12, stock13 };
			request.setAttribute("stock[]", stock);

			for (int i = 0; i < 10; i++) {
				String[] id = { "F001", "F002", "F003", "F004", "F005", "F006", "F007", "F008", "F009", "F010" };
				//データベースにアクセス
				try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/workspace?"
						+ "serverTimezone=JST&useUnicode=true&characterEncoding=UTF-8", "root", "root")) {

					String sql = "SELECT * FROM ice_cream_flavor WHERE ice_cream_flavor_id = ?";
					PreparedStatement pStmt = conn.prepareStatement(sql);

					pStmt.setString(1, id[i]);

					//select 実行
					ResultSet rs = pStmt.executeQuery();

					while (rs.next()) {
						//employeeテーブルからid,nameを取得
						stock[i].setFlavor_name(rs.getString("ice_cream_flavor_name"));
						stock[i].setFlavor_volume(rs.getString("ice_cream_flavor_volume"));
					}
					pStmt.close();
				} catch (SQLException e) {
					System.out.println("MySQLに接続できませんでした");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			for (int i = 10; i < 13; i++) {
				String[] id = { "F001", "F002", "F003", "F004", "F005", "F006", "F007", "F008", "F009", "F010", "C001",
						"C002", "C003" };
				//データベースにアクセス
				try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/workspace?"
						+ "serverTimezone=JST&useUnicode=true&characterEncoding=UTF-8", "root", "root")) {

					String sql = "SELECT * FROM ice_cream_container WHERE ice_cream_container_id = ?";
					PreparedStatement pStmt = conn.prepareStatement(sql);

					pStmt.setString(1, id[i]);

					//select 実行
					ResultSet rs = pStmt.executeQuery();

					while (rs.next()) {
						//employeeテーブルからid,nameを取得
						stock[i].setIce_cream_container_name(rs.getString("ice_cream_container_name"));
						stock[i].setIce_cream_container_stock(rs.getString("ice_cream_container_stock"));
					}
					pStmt.close();
				} catch (SQLException e) {
					System.out.println("MySQLに接続できませんでした");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			forwardPath = "stock-001.jsp";
		} else if (action.equals("backToHome")) {
			forwardPath = "home-001.jsp";
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(forwardPath);
		dispatcher.forward(request, response);
	}
}
