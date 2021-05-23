package SampleServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javasrc.Sales;

/**
 * Servlet implementation class ServletGetOrder004
 */
@WebServlet("/ServletGetOrder004")
public class ServletGetOrder004 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletGetOrder004() {
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
		RequestDispatcher dispatcher = request.getRequestDispatcher("order-004.jsp");
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
		HttpSession session = request.getSession();
		Sales sales = (Sales) session.getAttribute("Sales");

		session.setAttribute("Sales", sales);

		String action = request.getParameter("order-004");
		if (action.equals("注文内容を修正する")) {

			//home-001画面をフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("order-001.jsp");
			dispatcher.forward(request, response);

		} else if (action.equals("注文を確定させる")) {
			//合計金額の算出
			//小計
			sales.setMoney(sales.getIce_cream_container_price() + sales.getIce_cream_price());
			session.setAttribute("Sales", sales);

			//order-002画面をフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("payment-001.jsp");
			dispatcher.forward(request, response);

		} else if (action.equals("追加で注文する")) {

			//order-002画面をフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("order-001.jsp");
			dispatcher.forward(request, response);

		}
	}

}
