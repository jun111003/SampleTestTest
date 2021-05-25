package SampleServlet;

import java.io.IOException;

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
 * Servlet implementation class ServletGetRecipt
 */
@WebServlet("/ServletGetRecipt001")
public class ServletGetRecipt001 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletGetRecipt001() {
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

		RequestDispatcher dispatcher = request.getRequestDispatcher("recipt-001.jsp");
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

		for (int j = 0; j < i; j++) {
			sessionInstanceName = "Sales" + Integer.toString(j + 1);
			Sales sales = (Sales) session.getAttribute(sessionInstanceName);
//			try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/workspace?"
//					+ "serverTimezone=JST&useUnicode=true&characterEncoding=UTF-8", "root", "root")) {
//				//sql文の設定
//				//表結合して一気に情報を取得
//				String sql = "INSERT INTO sales (sales_id, order_id, sales_date, employee_id, ice_cream_container_id, ice_cream_inf_id, flavor_id_1, flavor_id_2, flavor_id_3) values (?,?,?,?,?,?,?,?,?);";
//				PreparedStatement pStmt = conn.prepareStatement(sql);
//				//?に値をセット
//				pStmt.setString(1, String.valueOf(order.getSales_id()));
//				pStmt.setString(2, String.valueOf(j));
//				pStmt.setString(3, order.getSales_date());
//				pStmt.setString(4, order.getEmployee_id());
//				pStmt.setString(5, sales.getIce_cream_container_id());
//				pStmt.setString(6, sales.getIce_cream_inf_id());
//				pStmt.setString(7, sales.getFlavor_id_1());
//				pStmt.setString(8, sales.getFlavor_id_2());
//				pStmt.setString(9, sales.getFlavor_id_3());
//				//select 実行
//				ResultSet rs = pStmt.executeQuery();
//				while (rs.next()) {
//					sales.setIce_cream_inf_id(rs.getString("ice_cream_inf_id"));
//					sales.setIce_cream_price(rs.getInt("ice_cream_price"));
//					sales.setIce_cream_count_name(rs.getString("ice_cream_count_name"));
//					sales.setIce_cream_size_name(rs.getString("ice_cream_size_name"));
//					session.setAttribute(sessionInstanceName, sales);
//					String Flag = sales.getIce_cream_count_id();
//					if (Flag.equals("No002") || Flag.equals("No003")) {
//						//order-0022画面をフォワード
//						RequestDispatcher dispatcher = request.getRequestDispatcher("order-0022.jsp");
//						dispatcher.forward(request, response);
//					} else {
//						//order-002画面をフォワード
//						RequestDispatcher dispatcher = request.getRequestDispatcher("order-003.jsp");
//						dispatcher.forward(request, response);
//					}
//				}
//				//おまじない
//				pStmt.close();
//			} catch (SQLException e) {
//				System.out.println("MySQLに接続できませんでした");
//			} catch (Exception e) {
//				e.printStackTrace();
//			}

			session.removeAttribute(sessionInstanceName);
		}

		order.setSales_id(0);
		order.setOrder_id(0);

		//home-001画面をフォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("home-001.jsp");
		dispatcher.forward(request, response);

	}

}
