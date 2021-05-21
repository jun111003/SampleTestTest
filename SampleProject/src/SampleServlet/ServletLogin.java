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
import sampleClass.LoginLogic;
import sampleClass.SampleClass;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletLogin() {
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

		RequestDispatcher dispatcher = request.getRequestDispatcher("login-001.jsp");
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

		//SampleClassのインスタンス作成
		SampleClass sampleclass = new SampleClass();
		//リクエストパラメータを取得しインスタンスに代入
		String id = request.getParameter("ID");
		sampleclass.setEmployee_id(id);

		//Salesのインスタンス作成
		Sales sample = new Sales();
		//リクエストパラメータを取得しインスタンスに代入
		sample.setEmployee_id(id);

		//LoginLogicクラスのメソッドを実行
		LoginLogic loginLogic = new LoginLogic();
		boolean isLogin = loginLogic.execute(sampleclass);

		//正しいログインIDが入力された場合
		if(isLogin) {
			HttpSession session = request.getSession();
			session.setAttribute("sampleClass", sampleclass);
			session.setAttribute("Sales", sample);
		}

		//home-001画面をフォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("home-001.jsp");
		dispatcher.forward(request, response);
	}

}
