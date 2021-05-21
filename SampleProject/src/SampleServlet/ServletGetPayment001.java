package SampleServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletGetPayment001
 */
@WebServlet("/ServletGetPayment001")
public class ServletGetPayment001 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletGetPayment001() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

		RequestDispatcher dispatcher = request.getRequestDispatcher("payment-001.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

		PrintWriter out = response.getWriter();

		String action = request.getParameter("payment-001");

		if (action.equals("戻る")) {

			//home-001画面をフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("order-004.jsp");
			dispatcher.forward(request, response);

		} else if (action.equals("決済を行う")) {
			//データベースにアクセス
//	        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/workspace?"
//	                + "serverTimezone=JST&useUnicode=true&characterEncoding=UTF-8", "root", "root")){
//
//	        	String sql = "SELECT employee_name FROM employee WHERE employee_id =" + getEmployee_id();//テーブル名の設定
//	            PreparedStatement pStmt = conn.prepareStatement(sql);
//	            //Statement pStmt = conn.createStatement(sql);
//
//	            //select 実行
//	            ResultSet rs = pStmt.executeQuery();
//
//	            while (rs.next()) {
//	                //デバッグ用にMPとEXPの数値を代入
//	                String employee_name = rs.getString("EMPLOYEE_NAME");//列名の設定
//	                setEmployee_name(employee_name);
//	            }
//
//	            pStmt.close();
//	        } catch (SQLException e) {
//	            System.out.println("MySQLに接続できませんでした");
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	        }

			//order-002画面をフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("recipt-001.jsp");
			dispatcher.forward(request, response);

		}
	}

}
