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

/**
 * Servlet implementation class ServletTest
 */
@WebServlet("/ServletTest")
public class ServletTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>ExerciseServlet3</title>");
		out.println("</head>");
		out.println("<body>");

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/workspace?"
				+ "serverTimezone=JST&useUnicode=true&characterEncoding=UTF-8", "root", "root")) {

			String sql = "SELECT * FROM employee";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			//Statement pStmt = conn.createStatement(sql);

			//select 実行
			ResultSet rs = pStmt.executeQuery();

			while (rs.next()) {
				//デバッグ用にMPとEXPの数値を代入
				String name = rs.getString("employee_name");
				out.println(name);
			}

			out.println("</body>");
			out.println("</html>");

			pStmt.close();
		} catch (SQLException e) {
			System.out.println("MySQLに接続できませんでした");
		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/order-001.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
