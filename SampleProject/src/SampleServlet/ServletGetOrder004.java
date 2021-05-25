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
		if (action.equals("注文内容を全て削除してホームへ")) {
			//従業員IDを保持したまま全ての受注情報を消去
			for (int j = 0; j < 10; j++) {
				sessionInstanceName = "Sales" + Integer.toString(j + 1);
				session.removeAttribute(sessionInstanceName);
			}
			order.setSales_id(0);
			order.setOrder_id(0);

			//入力情報を保持せずhome-001画面をフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("home-001.jsp");
			dispatcher.forward(request, response);
		} else if (action.equals("注文を確定させる")) {
			//合計金額の算出
			Sales salesSet = new Sales();
			int sum = 0;
			for (int j = 0; j < 10; j++) {
				String sessionInstanceNameSum = "Sales" + Integer.toString(j + 1);
				salesSet = (Sales) session.getAttribute(sessionInstanceNameSum);
				//小計
				salesSet.setMoney(salesSet.getIce_cream_container_price() + salesSet.getIce_cream_price());
				session.setAttribute(sessionInstanceNameSum, salesSet);
				sum += salesSet.getMoney();
			}
			//合計
			order.setSumMoney(sum);
			//order-002画面をフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("payment-001.jsp");
			dispatcher.forward(request, response);
		} else if (action.equals("追加で注文する")) {
			//注文番号を加算する
			int counter = 0;
			for (int j = 0; j < 10; j++) {
				sessionInstanceName = "Sales" + Integer.toString(j + 1);
				sales = (Sales) session.getAttribute(sessionInstanceName);
				if (sales.getIce_cream_size_id() != null) {
					order.setOrder_id(j + 2);
					counter++;
				} else {
					//Nothing to do
				}
			}
			//注文を確定した時の処理を注文件数が10件を超えた場合に行う
			//強制的に支払い画面に遷移
			if (counter == 10) {
				//合計金額の算出
				Sales salesSet = new Sales();
				int sum = 0;
				for (int j = 0; j < 10; j++) {
					String sessionInstanceNameSum = "Sales" + Integer.toString(j + 1);
					salesSet = (Sales) session.getAttribute(sessionInstanceNameSum);
					//小計
					salesSet.setMoney(salesSet.getIce_cream_container_price() + salesSet.getIce_cream_price());
					sum += salesSet.getMoney();
				}
				//合計をセット
				order.setSumMoney(sum);
				//注文が11件目になると強制的にpayment-001画面をフォワード
				RequestDispatcher dispatcher = request.getRequestDispatcher("payment-001.jsp");
				dispatcher.forward(request, response);
			} else {
				RequestDispatcher dispatcher = request.getRequestDispatcher("order-001.jsp");
				dispatcher.forward(request, response);
			}
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
		} else if (action.equals("注文1を削除")) {//ここから注文削除処理
			//修正する注文番号を得る為のフラグ
			int Flag = 0;
			for (int j = 0; j < 9; j++) {
				if (Flag == 1) {
					String removeSessionInstanceName = "Sales" + Integer.toString(j + 1);
					String replaseSessionInstanceName = "Sales" + Integer.toString(j + 2);
					session.removeAttribute(removeSessionInstanceName);
					sales = (Sales) session.getAttribute(replaseSessionInstanceName);
					session.setAttribute(removeSessionInstanceName, sales);
				} else {
					//Nothing to do
				}
				if (j == 0) {
					String removeSessionInstanceName = "Sales" + Integer.toString(j + 1);
					String replaseSessionInstanceName = "Sales" + Integer.toString(j + 2);
					session.removeAttribute(removeSessionInstanceName);
					sales = (Sales) session.getAttribute(replaseSessionInstanceName);
					session.setAttribute(removeSessionInstanceName, sales);
					Flag = 1;
				} else {
					//Nothing to do
				}
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher("order-004.jsp");
			dispatcher.forward(request, response);
		} else if (action.equals("注文2を削除")) {
			//修正する注文番号を得る為のフラグ
			int Flag = 0;
			for (int j = 0; j < 9; j++) {
				if (Flag == 1) {
					String removeSessionInstanceName = "Sales" + Integer.toString(j + 1);
					String replaseSessionInstanceName = "Sales" + Integer.toString(j + 2);
					session.removeAttribute(removeSessionInstanceName);
					sales = (Sales) session.getAttribute(replaseSessionInstanceName);
					session.setAttribute(removeSessionInstanceName, sales);
				} else {
					//Nothing to do
				}
				if (j == 1) {
					String removeSessionInstanceName = "Sales" + Integer.toString(j + 1);
					String replaseSessionInstanceName = "Sales" + Integer.toString(j + 2);
					session.removeAttribute(removeSessionInstanceName);
					sales = (Sales) session.getAttribute(replaseSessionInstanceName);
					session.setAttribute(removeSessionInstanceName, sales);
					Flag = 1;
				} else {
					//Nothing to do
				}
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher("order-004.jsp");
			dispatcher.forward(request, response);
		} else if (action.equals("注文3を削除")) {
			//修正する注文番号を得る為のフラグ
			int Flag = 0;
			for (int j = 0; j < 9; j++) {
				if (Flag == 1) {
					String removeSessionInstanceName = "Sales" + Integer.toString(j + 1);
					String replaseSessionInstanceName = "Sales" + Integer.toString(j + 2);
					session.removeAttribute(removeSessionInstanceName);
					sales = (Sales) session.getAttribute(replaseSessionInstanceName);
					session.setAttribute(removeSessionInstanceName, sales);
				} else {
					//Nothing to do
				}
				if (j == 2) {
					String removeSessionInstanceName = "Sales" + Integer.toString(j + 1);
					String replaseSessionInstanceName = "Sales" + Integer.toString(j + 2);
					session.removeAttribute(removeSessionInstanceName);
					sales = (Sales) session.getAttribute(replaseSessionInstanceName);
					session.setAttribute(removeSessionInstanceName, sales);
					Flag = 1;
				} else {
					//Nothing to do
				}
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher("order-004.jsp");
			dispatcher.forward(request, response);
		} else if (action.equals("注文4を削除")) {
			//修正する注文番号を得る為のフラグ
			int Flag = 0;
			for (int j = 0; j < 9; j++) {
				if (Flag == 1) {
					String removeSessionInstanceName = "Sales" + Integer.toString(j + 1);
					String replaseSessionInstanceName = "Sales" + Integer.toString(j + 2);
					session.removeAttribute(removeSessionInstanceName);
					sales = (Sales) session.getAttribute(replaseSessionInstanceName);
					session.setAttribute(removeSessionInstanceName, sales);
				} else {
					//Nothing to do
				}
				if (j == 3) {
					String removeSessionInstanceName = "Sales" + Integer.toString(j + 1);
					String replaseSessionInstanceName = "Sales" + Integer.toString(j + 2);
					session.removeAttribute(removeSessionInstanceName);
					sales = (Sales) session.getAttribute(replaseSessionInstanceName);
					session.setAttribute(removeSessionInstanceName, sales);
					Flag = 1;
				} else {
					//Nothing to do
				}
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher("order-004.jsp");
			dispatcher.forward(request, response);
		} else if (action.equals("注文5を削除")) {
			//修正する注文番号を得る為のフラグ
			int Flag = 0;
			for (int j = 0; j < 9; j++) {
				if (Flag == 1) {
					String removeSessionInstanceName = "Sales" + Integer.toString(j + 1);
					String replaseSessionInstanceName = "Sales" + Integer.toString(j + 2);
					session.removeAttribute(removeSessionInstanceName);
					sales = (Sales) session.getAttribute(replaseSessionInstanceName);
					session.setAttribute(removeSessionInstanceName, sales);
				} else {
					//Nothing to do
				}
				if (j == 4) {
					String removeSessionInstanceName = "Sales" + Integer.toString(j + 1);
					String replaseSessionInstanceName = "Sales" + Integer.toString(j + 2);
					session.removeAttribute(removeSessionInstanceName);
					sales = (Sales) session.getAttribute(replaseSessionInstanceName);
					session.setAttribute(removeSessionInstanceName, sales);
					Flag = 1;
				} else {
					//Nothing to do
				}
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher("order-004.jsp");
			dispatcher.forward(request, response);
		} else if (action.equals("注文6を削除")) {
			//修正する注文番号を得る為のフラグ
			int Flag = 0;
			for (int j = 0; j < 9; j++) {
				if (Flag == 1) {
					String removeSessionInstanceName = "Sales" + Integer.toString(j + 1);
					String replaseSessionInstanceName = "Sales" + Integer.toString(j + 2);
					session.removeAttribute(removeSessionInstanceName);
					sales = (Sales) session.getAttribute(replaseSessionInstanceName);
					session.setAttribute(removeSessionInstanceName, sales);
				} else {
					//Nothing to do
				}
				if (j == 5) {
					String removeSessionInstanceName = "Sales" + Integer.toString(j + 1);
					String replaseSessionInstanceName = "Sales" + Integer.toString(j + 2);
					session.removeAttribute(removeSessionInstanceName);
					sales = (Sales) session.getAttribute(replaseSessionInstanceName);
					session.setAttribute(removeSessionInstanceName, sales);
					Flag = 1;
				} else {
					//Nothing to do
				}
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher("order-004.jsp");
			dispatcher.forward(request, response);
		} else if (action.equals("注文7を削除")) {
			//修正する注文番号を得る為のフラグ
			int Flag = 0;
			for (int j = 0; j < 9; j++) {
				if (Flag == 1) {
					String removeSessionInstanceName = "Sales" + Integer.toString(j + 1);
					String replaseSessionInstanceName = "Sales" + Integer.toString(j + 2);
					session.removeAttribute(removeSessionInstanceName);
					sales = (Sales) session.getAttribute(replaseSessionInstanceName);
					session.setAttribute(removeSessionInstanceName, sales);
				} else {
					//Nothing to do
				}
				if (j == 6) {
					String removeSessionInstanceName = "Sales" + Integer.toString(j + 1);
					String replaseSessionInstanceName = "Sales" + Integer.toString(j + 2);
					session.removeAttribute(removeSessionInstanceName);
					sales = (Sales) session.getAttribute(replaseSessionInstanceName);
					session.setAttribute(removeSessionInstanceName, sales);
					Flag = 1;
				} else {
					//Nothing to do
				}
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher("order-004.jsp");
			dispatcher.forward(request, response);
		} else if (action.equals("注文8を削除")) {
			//修正する注文番号を得る為のフラグ
			int Flag = 0;
			for (int j = 0; j < 9; j++) {
				if (Flag == 1) {
					String removeSessionInstanceName = "Sales" + Integer.toString(j + 1);
					String replaseSessionInstanceName = "Sales" + Integer.toString(j + 2);
					session.removeAttribute(removeSessionInstanceName);
					sales = (Sales) session.getAttribute(replaseSessionInstanceName);
					session.setAttribute(removeSessionInstanceName, sales);
				} else {
					//Nothing to do
				}
				if (j == 7) {
					String removeSessionInstanceName = "Sales" + Integer.toString(j + 1);
					String replaseSessionInstanceName = "Sales" + Integer.toString(j + 2);
					session.removeAttribute(removeSessionInstanceName);
					sales = (Sales) session.getAttribute(replaseSessionInstanceName);
					session.setAttribute(removeSessionInstanceName, sales);
					Flag = 1;
				} else {
					//Nothing to do
				}
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher("order-004.jsp");
			dispatcher.forward(request, response);
		} else if (action.equals("注文9を削除")) {
			//修正する注文番号を得る為のフラグ
			int Flag = 0;
			for (int j = 0; j < 9; j++) {
				if (Flag == 1) {
					String removeSessionInstanceName = "Sales" + Integer.toString(j + 1);
					String replaseSessionInstanceName = "Sales" + Integer.toString(j + 2);
					session.removeAttribute(removeSessionInstanceName);
					sales = (Sales) session.getAttribute(replaseSessionInstanceName);
					session.setAttribute(removeSessionInstanceName, sales);
				} else {
					//Nothing to do
				}
				if (j == 8) {
					String removeSessionInstanceName = "Sales" + Integer.toString(j + 1);
					String replaseSessionInstanceName = "Sales" + Integer.toString(j + 2);
					session.removeAttribute(removeSessionInstanceName);
					sales = (Sales) session.getAttribute(replaseSessionInstanceName);
					session.setAttribute(removeSessionInstanceName, sales);
					Flag = 1;
				} else {
					//Nothing to do
				}
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher("order-004.jsp");
			dispatcher.forward(request, response);
		} else if (action.equals("注文10を削除")) {
			//修正する注文番号を得る為のフラグ
			int Flag = 0;
			for (int j = 0; j < 9; j++) {
				if (Flag == 1) {
					String removeSessionInstanceName = "Sales" + Integer.toString(j + 1);
					String replaseSessionInstanceName = "Sales" + Integer.toString(j + 2);
					session.removeAttribute(removeSessionInstanceName);
					sales = (Sales) session.getAttribute(replaseSessionInstanceName);
					session.setAttribute(removeSessionInstanceName, sales);
				} else {
					//Nothing to do
				}
				if (j == 9) {
					String removeSessionInstanceName = "Sales" + Integer.toString(j + 1);
					String replaseSessionInstanceName = "Sales" + Integer.toString(j + 2);
					session.removeAttribute(removeSessionInstanceName);
					sales = (Sales) session.getAttribute(replaseSessionInstanceName);
					session.setAttribute(removeSessionInstanceName, sales);
					Flag = 1;
				} else {
					//Nothing to do
				}
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher("order-004.jsp");
			dispatcher.forward(request, response);
		}
	}

}
