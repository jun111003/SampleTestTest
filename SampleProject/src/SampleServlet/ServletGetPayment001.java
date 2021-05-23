package SampleServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javasrc.Sales;

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

		PrintWriter out = response.getWriter();

		String action = request.getParameter("payment-001");

		if (action.equals("戻る")) {

			//home-001画面をフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("order-004.jsp");
			dispatcher.forward(request, response);

		} else if (action.equals("決済を行う")) {
			//salesのインスタンス作成
			HttpSession session = request.getSession();
			Sales sales = (Sales) session.getAttribute("Sales");

			sales.check();

			//			//#############################################################################################################
			//			try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/workspace?"
			//					+ "serverTimezone=JST&useUnicode=true&characterEncoding=UTF-8", "root", "root")) {
			//
			//				String sql = "SELECT * FROM employee";
			//				PreparedStatement pStmt = conn.prepareStatement(sql);
			//				//Statement pStmt = conn.createStatement(sql);
			//
			//				//select 実行
			//				ResultSet rs = pStmt.executeQuery();
			//
			//				while (rs.next()) {
			//					//employeeテーブルからid,nameを取得
			//					String sql_id = rs.getString("employee_id");
			//					String sql_name = rs.getString("employee_name");
			//					//取得したidとインスタンス化されたidを比較して条件分岐
			//					if (sql_id.equals(sales.getEmployee_id())) {
			//						sales.setEmployee_name(sql_name);//データベースからの値をsetterでセットできる。
			//					}
			//				}
			//
			//				pStmt.close();
			//			} catch (SQLException e) {
			//				System.out.println("ユーザが分かりませんでした");
			//			} catch (Exception e) {
			//				e.printStackTrace();
			//			}
			//			//##############################################################################################################
			//			//データベースにアクセスice_cream_size_name（サイズ名）の取得
			//			try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/workspace?"
			//					+ "serverTimezone=JST&useUnicode=true&characterEncoding=UTF-8", "root", "root")) {
			//
			//				String sql = "SELECT * FROM ice_cream_size";
			//				PreparedStatement pStmt = conn.prepareStatement(sql);
			//				//Statement pStmt = conn.createStatement(sql);
			//
			//				//select 実行
			//				ResultSet rs = pStmt.executeQuery();
			//
			//				while (rs.next()) {
			//					//employeeテーブルからid,nameを取得
			//					String sql_id = rs.getString("ice_cream_size_id");
			//					String sql_name = rs.getString("ice_cream_size_name");
			//					//取得したidとインスタンス化されたidを比較して条件分岐
			//					if (sql_id.equals(sales.getIce_cream_size_id())) {
			//						sales.setIce_cream_size_name(sql_name);
			//					}
			//				}
			//
			//				pStmt.close();
			//			} catch (SQLException e) {
			//				System.out.println("サイズが分かりませんでした");
			//			} catch (Exception e) {
			//				e.printStackTrace();
			//			}
			//			//##############################################################################################################
			//			//データベースにアクセスice_cream_count_name（サイズ名）の取得
			//			try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/workspace?"
			//					+ "serverTimezone=JST&useUnicode=true&characterEncoding=UTF-8", "root", "root")) {
			//
			//				String sql = "SELECT * FROM ice_cream_count";
			//				PreparedStatement pStmt = conn.prepareStatement(sql);
			//				//Statement pStmt = conn.createStatement(sql);
			//
			//				//select 実行
			//				ResultSet rs = pStmt.executeQuery();
			//
			//				while (rs.next()) {
			//					//employeeテーブルからid,nameを取得
			//					String sql_id = rs.getString("ice_cream_count_id");
			//					String sql_name = rs.getString("ice_cream_count_name");
			//					//取得したidとインスタンス化されたidを比較して条件分岐
			//					if (sql_id.equals(sales.getIce_cream_count_id())) {
			//						sales.setIce_cream_count_name(sql_name);
			//					}
			//				}
			//
			//				pStmt.close();
			//			} catch (SQLException e) {
			//				System.out.println("個数");
			//			} catch (Exception e) {
			//				e.printStackTrace();
			//			}
			//			//##############################################################################################################
			//			//データベースにアクセスice_cream_size_name（サイズ名）の取得
			//			try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/workspace?"
			//					+ "serverTimezone=JST&useUnicode=true&characterEncoding=UTF-8", "root", "root")) {
			//
			//				String sql = "SELECT * FROM ice_cream_container";
			//				PreparedStatement pStmt = conn.prepareStatement(sql);
			//				//Statement pStmt = conn.createStatement(sql);
			//
			//				//select 実行
			//				ResultSet rs = pStmt.executeQuery();
			//
			//				while (rs.next()) {
			//					//employeeテーブルからid,nameを取得
			//					String sql_id = rs.getString("ice_cream_container_id");
			//					String sql_name = rs.getString("ice_cream_container_name");
			//					int sql_price = rs.getInt("ice_cream_container_price");
			//					//取得したidとインスタンス化されたidを比較して条件分岐
			//					if (sql_id.equals(sales.getEmployee_id())) {
			//						sales.setIce_cream_container_name(sql_name);
			//						sales.setIce_cream_container_price(sql_price);
			//					}
			//				}
			//
			//				pStmt.close();
			//			} catch (SQLException e) {
			//				System.out.println("容器");
			//			} catch (Exception e) {
			//				e.printStackTrace();
			//			}
			//			//##############################################################################################################
			//			//データベースにアクセスice_cream_flavor_name_1（フレーバー名）の取得
			//			try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/workspace?"
			//					+ "serverTimezone=JST&useUnicode=true&characterEncoding=UTF-8", "root", "root")) {
			//
			//				String sql = "SELECT * FROM ice_cream_flavor";
			//				PreparedStatement pStmt = conn.prepareStatement(sql);
			//				//Statement pStmt = conn.createStatement(sql);
			//
			//				//select 実行
			//				ResultSet rs = pStmt.executeQuery();
			//
			//				while (rs.next()) {
			//					//employeeテーブルからid,nameを取得
			//					String sql_id = rs.getString("ice_cream_flavor_id");
			//					String sql_name = rs.getString("ice_cream_flavor_name");
			//					//取得したidとインスタンス化されたidを比較して条件分岐
			//					if (sql_id.equals(sales.getFlavor_id_1())) {
			//						sales.setFlavor_name_1(sql_name);
			//					}
			//				}
			//
			//				pStmt.close();
			//			} catch (SQLException e) {
			//				System.out.println("フレーバー");
			//			} catch (Exception e) {
			//				e.printStackTrace();
			//			}
			//			//##############################################################################################################
			//			//データベースにアクセスice_cream_flavor_name_2（フレーバー名）の取得
			//			if (sales.getIce_cream_count_id().equals("No003") || sales.getIce_cream_count_id().equals("No002")) {
			//				try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/workspace?"
			//						+ "serverTimezone=JST&useUnicode=true&characterEncoding=UTF-8", "root", "root")) {
			//
			//					String sql = "SELECT * FROM ice_cream_flavor";
			//					PreparedStatement pStmt = conn.prepareStatement(sql);
			//					//Statement pStmt = conn.createStatement(sql);
			//
			//					//select 実行
			//					ResultSet rs = pStmt.executeQuery();
			//
			//					while (rs.next()) {
			//						//employeeテーブルからid,nameを取得
			//						String sql_id = rs.getString("ice_cream_flavor_id");
			//						String sql_name = rs.getString("ice_cream_flavor_name");
			//						//取得したidとインスタンス化されたidを比較して条件分岐
			//						if (sql_id.equals(sales.getFlavor_id_2())) {
			//							sales.setFlavor_name_2(sql_name);
			//						}
			//					}
			//
			//					pStmt.close();
			//				} catch (SQLException e) {
			//					System.out.println("MySQLに接続できませんでした");
			//				} catch (Exception e) {
			//					e.printStackTrace();
			//				}
			//				//##############################################################################################################
			//			} else if (sales.getIce_cream_count_id().equals("No003")) {
			//				//データベースにアクセスice_cream_flavor_name_3（フレーバー名）の取得
			//				if (sales.getIce_cream_count_id().equals("No003") || sales.getIce_cream_count_id().equals("No002")) {
			//					try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/workspace?"
			//							+ "serverTimezone=JST&useUnicode=true&characterEncoding=UTF-8", "root", "root")) {
			//
			//						String sql = "SELECT * FROM ice_cream_flavor";
			//						PreparedStatement pStmt = conn.prepareStatement(sql);
			//						//Statement pStmt = conn.createStatement(sql);
			//
			//						//select 実行
			//						ResultSet rs = pStmt.executeQuery();
			//
			//						while (rs.next()) {
			//							//employeeテーブルからid,nameを取得
			//							String sql_id = rs.getString("ice_cream_flavor_id");
			//							String sql_name = rs.getString("ice_cream_flavor_name");
			//							//取得したidとインスタンス化されたidを比較して条件分岐
			//							if (sql_id.equals(sales.getFlavor_id_3())) {
			//								sales.setFlavor_name_3(sql_name);
			//							}
			//						}
			//
			//						pStmt.close();
			//					} catch (SQLException e) {
			//						System.out.println("MySQLに接続できませんでした");
			//					} catch (Exception e) {
			//						e.printStackTrace();
			//					}
			//				}
			//				//##############################################################################################################
			//				//データベースにアクセスice_cream_flavor_inf_price（商品金額）の取得
			//				try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/workspace?"
			//						+ "serverTimezone=JST&useUnicode=true&characterEncoding=UTF-8", "root", "root")) {
			//
			//					String sql = "SELECT * FROM ice_cream_inf";
			//					PreparedStatement pStmt = conn.prepareStatement(sql);
			//					//Statement pStmt = conn.createStatement(sql);
			//
			//					//select 実行
			//					ResultSet rs = pStmt.executeQuery();
			//
			//					while (rs.next()) {
			//						//employeeテーブルからid,nameを取得
			//						String sql_id = rs.getString("ice_cream_inf_id");
			//						int sql_price = rs.getInt("ice_cream_inf_price");
			//						//取得したidとインスタンス化されたidを比較して条件分岐
			//						if (sql_id.equals(sales.getIce_cream_inf_id())) {
			//							sales.setIce_cream_price(sql_price);
			//						}
			//					}
			//
			//					pStmt.close();
			//				} catch (SQLException e) {
			//					System.out.println("合計金額");
			//				} catch (Exception e) {
			//					e.printStackTrace();
			//				}
			//				//##############################################################################################################
			//			}
			session.setAttribute("Sales", sales);

			//order-002画面をフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("recipt-001.jsp");
			dispatcher.forward(request, response);
		}
	}

}
