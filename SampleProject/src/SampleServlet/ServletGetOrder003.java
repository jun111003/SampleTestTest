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
import javax.servlet.http.HttpSession;

import javasrc.Order;
import javasrc.Sales;

/**
 * Servlet implementation class ServletGetOrder003
 */
@WebServlet("/ServletGetOrder003")
public class ServletGetOrder003 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletGetOrder003() {
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

		RequestDispatcher dispatcher = request.getRequestDispatcher("order-003.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

		//Salesのインスタンス作成
		HttpSession session = request.getSession();
		Order order = (Order) session.getAttribute("Order");
		int i = order.getOrder_id();
		String sessionInstanceName = "Sales" + Integer.toString(i);
		System.out.println(sessionInstanceName);
		Sales sales = (Sales) session.getAttribute(sessionInstanceName);
		//リクエストパラメータを取得しインスタンスに代入
		String container = request.getParameter("container");
		sales.setIce_cream_container_id(container);

		String action = request.getParameter("order-003");
		if (action.equals("戻る")) {
			//home-001画面をフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("order-002.jsp");
			dispatcher.forward(request, response);
		} else if (action.equals("次へ")) {
			try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/workspace?"
					+ "serverTimezone=JST&useUnicode=true&characterEncoding=UTF-8", "root", "root")) {
				//sql文の設定
				String sql = "SELECT * FROM ice_cream_container where ice_cream_container_id = ?";
				PreparedStatement pStmt = conn.prepareStatement(sql);
				//?に値をセット
				pStmt.setString(1, sales.getIce_cream_container_id());
				//select 実行
				ResultSet rs = pStmt.executeQuery();
				while (rs.next()) {
					sales.setIce_cream_container_name(rs.getString("ice_cream_container_name"));
					sales.setIce_cream_container_price(rs.getInt("ice_cream_container_price"));
				}
				sql = "SELECT * FROM ice_cream_flavor where ice_cream_flavor_id = ?";
				pStmt = conn.prepareStatement(sql);
				pStmt.setString(1, sales.getFlavor_id_1());
				rs = pStmt.executeQuery();
				while (rs.next()) {
					sales.setFlavor_name_1(rs.getString("ice_cream_flavor_name"));
				}

				String Flag = sales.getIce_cream_count_id();
				if (Flag.equals("No002") || Flag.equals("No003")) {
					sql = "SELECT * FROM ice_cream_flavor where ice_cream_flavor_id = ?";
					pStmt = conn.prepareStatement(sql);
					pStmt.setString(1, sales.getFlavor_id_2());
					rs = pStmt.executeQuery();
					while (rs.next()) {
						sales.setFlavor_name_2(rs.getString("ice_cream_flavor_name"));
					}
				}else {
					//Nothing to do
				}
				if (Flag.equals("No003")) {
					sql = "SELECT * FROM ice_cream_flavor where ice_cream_flavor_id = ?";
					pStmt = conn.prepareStatement(sql);
					pStmt.setString(1, sales.getFlavor_id_3());
					rs = pStmt.executeQuery();
					while (rs.next()) {
						sales.setFlavor_name_3(rs.getString("ice_cream_flavor_name"));
					}
				}else {
					//Nothing to do
				}
				pStmt.close();
			} catch (SQLException e) {
				System.out.println("MySQLに接続できませんでした");
			} catch (Exception e) {
				e.printStackTrace();
			}
			session.setAttribute(sessionInstanceName, sales);
			//order-002画面をフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("order-004.jsp");
			dispatcher.forward(request, response);
		}
	}

}
