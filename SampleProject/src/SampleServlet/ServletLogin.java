package SampleServlet;

import java.io.IOException;
import java.io.PrintWriter;
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
import sampleClass.LoginLogic;
import sampleClass.SampleClass;

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

		//SampleClassのインスタンス作成
		SampleClass sampleclass = new SampleClass();
		//リクエストパラメータを取得しインスタンスに代入
		String id = request.getParameter("id");
		sampleclass.setEmployee_id(id);
		String ps = request.getParameter("ps");

		//Salesのインスタンス作成
		Sales sale = new Sales();
		//リクエストパラメータを取得しインスタンスに代入
		sale.setEmployee_id(id);

		//LoginLogicクラスのメソッドを実行
		LoginLogic loginLogic = new LoginLogic();
		boolean isLogin = loginLogic.execute(sampleclass);

		//リクエストパラメータのチェック
		String errorMsg = "";
		if (id == null || id.length() == 0) {
			errorMsg += "IDが入力されていません<br>";
		}
		if (ps == null || ps.length() == 0) {
			errorMsg += "PSが入力されていません<br>";
		} else {
			PrintWriter out = response.getWriter();
			try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/workspace?"
					+ "serverTimezone=JST&useUnicode=true&characterEncoding=UTF-8", "root", "root")) {

				String sql = "SELECT * FROM employee";
				PreparedStatement pStmt = conn.prepareStatement(sql);
				//Statement pStmt = conn.createStatement(sql);

				//select 実行
				ResultSet rs = pStmt.executeQuery();

				while (rs.next()) {
					//employeeテーブルからid,nameを取得
					String id_db = rs.getString("employee_id");
					String name = rs.getString("employee_name");
					//取得したidとインスタンス化されたidを比較して条件分岐
					if (id_db.equals(sale.getEmployee_id())) {
						sale.setEmployee_name(name);//データベースからの値をsetterでセットできる。
					}
				}

				pStmt.close();
			} catch (SQLException e) {
				System.out.println("MySQLに接続できませんでした");
			} catch (Exception e) {
				e.printStackTrace();
			}
			//##############################################################################################################
		}
		//正しいログインIDが入力された場合
		if (isLogin) {
			HttpSession session = request.getSession();
			session.setAttribute("sampleClass", sampleclass);
			session.setAttribute("Sales", sale);
		}

		//home-001画面をフォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("home-001.jsp");
		dispatcher.forward(request, response);
	}

}
