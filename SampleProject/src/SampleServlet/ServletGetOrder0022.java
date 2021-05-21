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
 * Servlet implementation class ServletGetOrder0022
 */
@WebServlet("/ServletGetOrder0022")
public class ServletGetOrder0022 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletGetOrder0022() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

		RequestDispatcher dispatcher = request.getRequestDispatcher("order-0022.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

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
		//リクエストパラメータを取得しインスタンスに代入
		String size = request.getParameter("size");
		sample.setIce_cream_size_id(size);
		String flavor = request.getParameter("flavor");
		sample.setFlavor_id_1(flavor);
		session.setAttribute("Sales", sample);

		String action = request.getParameter("order-002");


		if (action.equals("戻る")) {

			//home-001画面をフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("order-001.jsp");
			dispatcher.forward(request, response);

		} else if (action.equals("次へ")) {

			if(SA.getIce_cream_count_id().equals(3)) {
				RequestDispatcher dispatcher = request.getRequestDispatcher("order-0023.jsp");
				dispatcher.forward(request, response);
			}
			//order-002画面をフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("order-003.jsp");
			dispatcher.forward(request, response);

		}
	}

}
