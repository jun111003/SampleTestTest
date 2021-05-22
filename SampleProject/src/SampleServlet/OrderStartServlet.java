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
			Sales sales = (Sales) session.getAttribute("Sales");
			sales1.setEmployee_id(sales.getEmployee_id());
			session.removeAttribute("Sales");
			session.setAttribute("Sales", sales1);

			//入力情報を保持せずhome-001画面をフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("home-001.jsp");
			dispatcher.forward(request, response);
		} else if (action.equals("次へ")) {
			//Salesのインスタンス作成し、セッションスコープの値を取得
			HttpSession session = request.getSession();
			Sales sales = (Sales) session.getAttribute("Sales");
			//リクエストパラメータを取得しインスタンスに代入
			String number = request.getParameter("number");
			sales.setIce_cream_count_id(number);
			//Sales_idがまだセットされていない→初受注のときの処理
			if(sales.getSales_id() == 0) {
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
						sales.setSales_id(setSales_id_number);
						//受注が始まった瞬間なので注文番号を1にセット
						sales.setOrder_id(1);
						//セッションスコープに保存
						session.setAttribute("Sales", sales);
					}
					//おまじない
					pStmt.close();
				} catch (SQLException e) {
					System.out.println("MySQLに接続できませんでした");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			session.setAttribute("Sales", sales);
			//order-002画面をフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("order-002.jsp");
			dispatcher.forward(request, response);
		}
	}
}
