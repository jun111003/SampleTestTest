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
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletLogin() {
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

		RequestDispatcher dispatcher = request.getRequestDispatcher("login-001.jsp");
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
		Sales sales = new Sales();
		//リクエストパラメータを取得しインスタンスに代入
		String id = request.getParameter("id");
		String ps = request.getParameter("ps");

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/workspace?"
				+ "serverTimezone=JST&useUnicode=true&characterEncoding=UTF-8", "root", "root")) {
			//sql文の設定
			String sql = "SELECT * FROM employee where employee_id = ? AND employee_ps = ?";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			//?に値をセット
			pStmt.setString(1, id);
			pStmt.setString(2, ps);
			//select 実行
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				//入力と一致する行が発見されなければwhileの中は実行されない
				//つまりwhere分で主キーを条件にセットすれば間違えていた時に実行されない
				sales.setEmployee_id(id);
				sales.setEmployee_name(rs.getString("employee_name"));
				HttpSession session = request.getSession();
				//セッションスコープに保存
				session.setAttribute("Sales", sales);
				//きちんと入力されていたらhome-001に遷移
				RequestDispatcher dispatcher = request.getRequestDispatcher("home-001.jsp");
				dispatcher.forward(request, response);
			}
			//DBに入力されたIDとPASSがなければログイン画面を表示しなおす
			RequestDispatcher dispatcher = request.getRequestDispatcher("login-001.jsp");
			dispatcher.forward(request, response);
			//おまじない
			pStmt.close();
		} catch (SQLException e) {
			System.out.println("MySQLに接続できませんでした");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
