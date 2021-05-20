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
 * Servlet implementation class OrderStartServlet
 */
@WebServlet("/OrderStartServlet")
public class OrderStartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderStartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/order-001.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);

		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

		//Salesのインスタンス作成
		Sales sample = new Sales();
		//リクエストパラメータを取得しインスタンスに代入
		String number = request.getParameter("number");
		sample.setIce_cream_count_id(number);
		HttpSession session = request.getSession();
		session.setAttribute("SalesOrder-001", sample);

		String action = request.getParameter("kosuuButton");

		if(action.equals("戻る")) {

			//home-001画面をフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/home-001.jsp");
			dispatcher.forward(request, response);

		} else if(action.equals("次へ")) {

			//order-002画面をフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/order-002.jsp");
			dispatcher.forward(request, response);

		}

	}

}
