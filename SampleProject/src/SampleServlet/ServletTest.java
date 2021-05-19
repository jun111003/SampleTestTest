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


		String url = "";

		if(url.contentEquals("")) {
			url = "WEB-INF/jsp/login-001.jsp";
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
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

		// 行動取得

		String actionID = request.getParameter("ID");
		System.out.println(actionID);
		String url = null;

		if (actionID.contentEquals("asd")) {
			// 遷移先
			url = "WEB-INF/jsp/home-001.jsp";
		} else if (actionID.contentEquals("qwe")) {
			// 遷移先
			url = "WEB-INF/jsp/login-001.jsp";
		}


		String action = request.getParameter("orderStart");
		if (action.contentEquals("注文する")) {
			// 遷移先
			url = "WEB-INF/jsp/order-001.jsp";
		}
		// 遷移先
		//String url = "WEB-INF/jsp/home-001.jsp";
		//System.out.println(url);

		//		if(action == null) {
		//			url = "WEB-INF/jsp/login-001.jsp";
		//		}else if(action == "home-001") {
		//			url = "WEB-INF/jsp/home-001.jsp";
		//		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
