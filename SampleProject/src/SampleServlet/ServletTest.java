package SampleServlet;

import java.io.IOException;

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

	int count = 1;

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

		if (count == 1) {

			//login-001画面をフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/login-001.jsp");
			dispatcher.forward(request, response);

			count++;

		}

		if (count == 2) {

			//order-001画面をフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/order-001.jsp");
			dispatcher.forward(request, response);

			count++;

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);

		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

		//リクエストパラメータを取得
		String id = request.getParameter("id");

		String action = request.getParameter("home-001");
		System.out.println(action);


		//home-001画面をフォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/home-001.jsp");
		dispatcher.forward(request, response);

	}

}
