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

		String action = request.getParameter("order-004");

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

		System.out.println(SA.getEmployee_id());

		if (action.equals("注文内容を修正する")) {

			//home-001画面をフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("order-003.jsp");
			dispatcher.forward(request, response);

		} else if (action.equals("注文を確定させる")) {

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
