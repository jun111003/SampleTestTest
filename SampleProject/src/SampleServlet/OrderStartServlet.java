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
 * Servlet implementation class OrderStartServlet
 */
@WebServlet("/OrderStartServlet")
public class OrderStartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OrderStartServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("order-001.jsp");
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

		//どのボタンを押したのか判断するための変数を用意
		String action = request.getParameter("kosuuButton");
		//ボタンによって処理を変えている
		if (action.equals("戻る")) {
			//ここで戻るを押したときに従業員IDを保持したまま全ての受注情報を消去
			Sales sales1 = new Sales();
			HttpSession session = request.getSession();
			Sales sales = (Sales) session.getAttribute("Sales1");
			sales1.setEmployee_id(sales.getEmployee_id());
			session.removeAttribute("Sales2");
			session.setAttribute("Sales1", sales1);

			//入力情報を保持せずhome-001画面をフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("home-001.jsp");
			dispatcher.forward(request, response);
		} else if (action.equals("次へ")) {
			//Salesのインスタンス作成し、セッションスコープの値を取得
			HttpSession session = request.getSession();
			Order order = (Order) session.getAttribute("Order");
			//Sales_idがまだセットされていない→初受注のときの処理
			if (order.getSales_id() == 0) {
				try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/workspace?"
						+ "serverTimezone=JST&useUnicode=true&characterEncoding=UTF-8", "root", "root")) {
					//sql文の設定
					String sql = "SELECT MAX(sales_id) FROM sales";
					PreparedStatement pStmt = conn.prepareStatement(sql);
					//select 実行
					ResultSet rs = pStmt.executeQuery();
					while (rs.next()) {
						//受注番号＋１をSales_idに代入
						int setSales_id_number = rs.getInt("max(sales_id)") + 1;
						order.setSales_id(setSales_id_number);
						//受注が始まった瞬間なので注文番号を1にセット
						order.setOrder_id(1);
						//セッションスコープに保存
						session.setAttribute("Order", order);
						Sales sales1 = new Sales();
						Sales sales2 = new Sales();
						Sales sales3 = new Sales();
						Sales sales4 = new Sales();
						Sales sales5 = new Sales();
						Sales sales6 = new Sales();
						Sales sales7 = new Sales();
						Sales sales8 = new Sales();
						Sales sales9 = new Sales();
						Sales sales10 = new Sales();
						session.setAttribute("Sales1", sales1);
						session.setAttribute("Sales2", sales2);
						session.setAttribute("Sales3", sales3);
						session.setAttribute("Sales4", sales4);
						session.setAttribute("Sales5", sales5);
						session.setAttribute("Sales6", sales6);
						session.setAttribute("Sales7", sales7);
						session.setAttribute("Sales8", sales8);
						session.setAttribute("Sales9", sales9);
						session.setAttribute("Sales10", sales10);
					}
					//おまじない
					pStmt.close();
				} catch (SQLException e) {
					System.out.println("MySQLに接続できませんでした");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			int i = order.getOrder_id();
			String sessionInstanceName = "Sales" + Integer.toString(i);
			Sales sales = (Sales) session.getAttribute(sessionInstanceName);
			//リクエストパラメータを取得しインスタンスに代入
			String number = request.getParameter("number");
			sales.setIce_cream_count_id(number);
			session.setAttribute(sessionInstanceName, sales);
			//order-002画面をフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("order-002.jsp");
			dispatcher.forward(request, response);
		}
	}
}
