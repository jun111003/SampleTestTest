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
 * Servlet implementation class ServletGetOrder002
 */
@WebServlet("/ServletGetOrder002")
public class ServletGetOrder002 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletGetOrder002() {
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

		RequestDispatcher dispatcher = request.getRequestDispatcher("order-002.jsp");
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
		Sales sample = new Sales();
		HttpSession session = request.getSession();
		Sales SA = (Sales) session.getAttribute("Sales");
		sample.setEmployee_id(SA.getEmployee_id());
		sample.setIce_cream_count_id(SA.getIce_cream_count_id());
		sample.setFlavor_id_1(SA.getFlavor_id_1());
		sample.setFlavor_id_2(SA.getFlavor_id_2());
		sample.setFlavor_id_3(SA.getFlavor_id_3());
		sample.setIce_cream_container_id(SA.getIce_cream_container_id());
		sample.setIce_cream_count_id(SA.getIce_cream_count_id());
		sample.setIce_cream_inf_id(SA.getIce_cream_inf_id());
		sample.setIce_cream_size_id(SA.getIce_cream_size_id());
		sample.setOrder_id(SA.getOrder_id());
		sample.setSales_id(SA.getSales_id());
		//リクエストパラメータを取得しインスタンスに代入
		String size = request.getParameter("size");
		sample.setIce_cream_size_id(size);
		String flavor = request.getParameter("flavor");
		sample.setFlavor_id_1(flavor);

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/workspace?"
				+ "serverTimezone=JST&useUnicode=true&characterEncoding=UTF-8", "root", "root")) {

			//従業員の名前を取ってくる
			String sql = "SELECT * FROM ice_cream_inf where ice_cream_size_id = '?' AND ice_cream_count_id = '?'";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			//?に値をセット
			pStmt.setString(1, sample.getIce_cream_size_id());
			pStmt.setString(2, sample.getIce_cream_count_id());
			//select 実行
			ResultSet rs = pStmt.executeQuery();

			while (rs.next()) {
				String sql_name = rs.getString("ice_cream_inf_id");
				System.out.println(sql_name);
				sample.setIce_cream_inf_id(sql_name);//データベースからの値をsetterでセットできる。
			}

//			String sql_name = rs.getString("ice_cream_inf_id");
//			System.out.println(sql_name);
//			sample.setIce_cream_inf_id(sql_name);//データベースからの値をsetterでセットできる。

			pStmt.close();
		} catch (SQLException e) {
			System.out.println("アイス情報取得失敗");
		} catch (Exception e) {
			e.printStackTrace();
		}

		session.setAttribute("Sales", sample);

		String action = request.getParameter("order-002");

		if (action.equals("戻る")) {

			//home-001画面をフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("order-001.jsp");
			dispatcher.forward(request, response);

		} else if (action.equals("次へ")) {
			//			try {
			//				if(SA.getIce_cream_count_id().equals(2) || SA.getIce_cream_count_id().equals(3)) {
			//					RequestDispatcher dispatcher = request.getRequestDispatcher("order-0022.jsp");
			//					dispatcher.forward(request, response);
			//				}
			//			}catch(Exception e) {
			//				RequestDispatcher dispatcher = request.getRequestDispatcher("login-001.jsp");
			//				dispatcher.forward(request, response);
			//			}
			//order-002画面をフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("order-003.jsp");
			dispatcher.forward(request, response);

		}
	}

}
