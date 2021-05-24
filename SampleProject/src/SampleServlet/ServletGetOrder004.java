package SampleServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javasrc.Order;
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
		Order order = (Order) session.getAttribute("Order");
		int i = order.getOrder_id();
		String sessionInstanceName = "Sales" + Integer.toString(i);
		Sales sales = (Sales) session.getAttribute(sessionInstanceName);

		String action = request.getParameter("order-004");
		if (action.equals("注文内容を修正する")) {
			//home-001画面をフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("order-001.jsp");
			dispatcher.forward(request, response);
		} else if (action.equals("注文を確定させる")) {
			//合計金額の算出
			Sales salesSet = new Sales();
			int sum = 0;
			for(int j=0;j<10;j++) {
				String sessionInstanceNameSum = "Sales" + Integer.toString(j+1);
				salesSet = (Sales) session.getAttribute(sessionInstanceNameSum);
				//小計
				salesSet.setMoney(salesSet.getIce_cream_container_price() + salesSet.getIce_cream_price());
				session.setAttribute(sessionInstanceNameSum, salesSet);
				sum += salesSet.getMoney();
			}
			//合計
			order.setSumMoney(sum);
			session.setAttribute(sessionInstanceName, sales);
			//order-002画面をフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("payment-001.jsp");
			dispatcher.forward(request, response);
		} else if (action.equals("追加で注文する")) {
			//注文番号を加算する
			if (order.getOrder_id() < 10) {
				order.setOrder_id(order.getOrder_id() + 1);
			} else {
				RequestDispatcher dispatcher = request.getRequestDispatcher("payment-001.jsp");
				dispatcher.forward(request, response);
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher("order-001.jsp");
			dispatcher.forward(request, response);
		} else if (action.equals("注文1を修正")) {//ここから下は注文内容の修正
			order.setOrder_id(1);
			sessionInstanceName = "Sales" + Integer.toString(order.getOrder_id());
			session.removeAttribute(sessionInstanceName);
			sales = new Sales();
			session.setAttribute(sessionInstanceName, sales);
			RequestDispatcher dispatcher = request.getRequestDispatcher("order-001.jsp");
			dispatcher.forward(request, response);
		} else if (action.equals("注文2を修正")) {
			order.setOrder_id(2);
			sessionInstanceName = "Sales" + Integer.toString(order.getOrder_id());
			session.removeAttribute(sessionInstanceName);
			sales = new Sales();
			session.setAttribute(sessionInstanceName, sales);
			RequestDispatcher dispatcher = request.getRequestDispatcher("order-001.jsp");
			dispatcher.forward(request, response);
		} else if (action.equals("注文3を修正")) {
			order.setOrder_id(3);
			sessionInstanceName = "Sales" + Integer.toString(order.getOrder_id());
			session.removeAttribute(sessionInstanceName);
			sales = new Sales();
			session.setAttribute(sessionInstanceName, sales);
			RequestDispatcher dispatcher = request.getRequestDispatcher("order-001.jsp");
			dispatcher.forward(request, response);
		} else if (action.equals("注文4を修正")) {
			order.setOrder_id(4);
			sessionInstanceName = "Sales" + Integer.toString(order.getOrder_id());
			session.removeAttribute(sessionInstanceName);
			sales = new Sales();
			session.setAttribute(sessionInstanceName, sales);
			RequestDispatcher dispatcher = request.getRequestDispatcher("order-001.jsp");
			dispatcher.forward(request, response);
		} else if (action.equals("注文5を修正")) {
			order.setOrder_id(5);
			sessionInstanceName = "Sales" + Integer.toString(order.getOrder_id());
			session.removeAttribute(sessionInstanceName);
			sales = new Sales();
			session.setAttribute(sessionInstanceName, sales);
			RequestDispatcher dispatcher = request.getRequestDispatcher("order-001.jsp");
			dispatcher.forward(request, response);
		} else if (action.equals("注文6を修正")) {
			order.setOrder_id(6);
			sessionInstanceName = "Sales" + Integer.toString(order.getOrder_id());
			session.removeAttribute(sessionInstanceName);
			sales = new Sales();
			session.setAttribute(sessionInstanceName, sales);
			RequestDispatcher dispatcher = request.getRequestDispatcher("order-001.jsp");
			dispatcher.forward(request, response);
		} else if (action.equals("注文7を修正")) {
			order.setOrder_id(7);
			sessionInstanceName = "Sales" + Integer.toString(order.getOrder_id());
			session.removeAttribute(sessionInstanceName);
			sales = new Sales();
			session.setAttribute(sessionInstanceName, sales);
			RequestDispatcher dispatcher = request.getRequestDispatcher("order-001.jsp");
			dispatcher.forward(request, response);
		} else if (action.equals("注文8を修正")) {
			order.setOrder_id(8);
			sessionInstanceName = "Sales" + Integer.toString(order.getOrder_id());
			session.removeAttribute(sessionInstanceName);
			sales = new Sales();
			session.setAttribute(sessionInstanceName, sales);
			RequestDispatcher dispatcher = request.getRequestDispatcher("order-001.jsp");
			dispatcher.forward(request, response);
		} else if (action.equals("注文9を修正")) {
			order.setOrder_id(9);
			sessionInstanceName = "Sales" + Integer.toString(order.getOrder_id());
			session.removeAttribute(sessionInstanceName);
			sales = new Sales();
			session.setAttribute(sessionInstanceName, sales);
			RequestDispatcher dispatcher = request.getRequestDispatcher("order-001.jsp");
			dispatcher.forward(request, response);
		} else if (action.equals("注文10を修正")) {
			order.setOrder_id(10);
			sessionInstanceName = "Sales" + Integer.toString(order.getOrder_id());
			session.removeAttribute(sessionInstanceName);
			sales = new Sales();
			session.setAttribute(sessionInstanceName, sales);
			RequestDispatcher dispatcher = request.getRequestDispatcher("order-001.jsp");
			dispatcher.forward(request, response);
		}
	}

}
