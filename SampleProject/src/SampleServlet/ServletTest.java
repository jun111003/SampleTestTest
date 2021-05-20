package SampleServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sampleClass.LoginLogic;
import sampleClass.SampleClass;

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


		String action = request.getParameter("action");

		if(action == null) {

			//login-001画面をフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("/login-001.jsp");
			dispatcher.forward(request, response);

		}

		else if(action.equals("moveOrder-001")) {

			//order-001.jspファイルをフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/order-001.jsp");
			dispatcher.forward(request, response);

		}

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

		//registerForm.jspの確認ボタンからdoPost()メソッドが呼び出される

		//リクエストパラメータを取得
		String id = request.getParameter("id");

		//入力値をプロパティに設定
		SampleClass sampleClass = new SampleClass();            //インスタンス生成
		sampleClass.setEmployee_id(id);

		//LoginLogicクラスのメソッドを実行
		LoginLogic loginLogic = new LoginLogic();
		boolean isLogin = loginLogic.execute(sampleClass);

		//正しいログインIDが入力された場合
		if(isLogin) {

			//セッションスコープにインスタンスを保存
			HttpSession session = request.getSession();
			session.setAttribute("sampleClass", sampleClass);

		}

		//home-001.jspファイルをフォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/home-001.jsp");
		dispatcher.forward(request, response);

	}

}
