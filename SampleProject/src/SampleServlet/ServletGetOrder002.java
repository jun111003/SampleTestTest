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
		HttpSession session = request.getSession();
		Sales sales = (Sales) session.getAttribute("Sales");
		//リクエストパラメータを取得しインスタンスに代入
		String size = request.getParameter("size");
		sales.setIce_cream_size_id(size);
		String flavor = request.getParameter("flavor");
		sales.setFlavor_id_1(flavor);

		String action = request.getParameter("order-002");

		if (action.equals("戻る")) {
			//home-001画面をフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("order-001.jsp");
			dispatcher.forward(request, response);
		} else if (action.equals("次へ")) {
			session.setAttribute("Sales", sales);
			String Flag = sales.getIce_cream_count_id();
			if (Flag.equals("No002") || Flag.equals("No003")) {
				//order-0022画面をフォワード
				RequestDispatcher dispatcher = request.getRequestDispatcher("order-0022.jsp");
				dispatcher.forward(request, response);
			}else {
				//order-002画面をフォワード
				RequestDispatcher dispatcher = request.getRequestDispatcher("order-003.jsp");
				dispatcher.forward(request, response);
			}
		}
	}
}
