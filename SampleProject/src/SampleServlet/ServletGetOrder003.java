package SampleServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/order-003.jsp");
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

		String action = request.getParameter("order-003");

		if (action.equals("戻る")) {

			//home-001画面をフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/order-002.jsp");
			dispatcher.forward(request, response);

		} else if (action.equals("次へ")) {

			//order-002画面をフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/order-004.jsp");
			dispatcher.forward(request, response);

		}
	}

}