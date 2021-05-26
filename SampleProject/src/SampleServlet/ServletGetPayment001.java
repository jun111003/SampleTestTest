package SampleServlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javasrc.Order;

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
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

		RequestDispatcher dispatcher = request.getRequestDispatcher("payment-001.jsp");
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

		String action = request.getParameter("payment-001");
		if (action.equals("戻る")) {
			//home-001画面をフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("order-004.jsp");
			dispatcher.forward(request, response);
		} else if (action.equals("決済を行う")) {
			//リクエストパラメータの取得
			int payment = Integer.parseInt(request.getParameter("payment"));
			int change = Integer.parseInt(request.getParameter("differentMoney"));

			//Salesのインスタンス作成
			HttpSession session = request.getSession();
			Order order = (Order) session.getAttribute("Order");

			//お釣りをorderインスタンスとsalesインスタンスにセット
			order.setPayment(payment);
			order.setChange(change);

			//時間をorderインスタンスにセット
			SimpleDateFormat f = new SimpleDateFormat("YYYY年MM月dd日 HH時mm分ss秒");
			Date now = new Date();
			String d = f.format(now);
			order.setSales_date(d);



			session.setAttribute("Order", order);

			//order-002画面をフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("recipt-001.jsp");
			dispatcher.forward(request, response);
		}
	}

}
