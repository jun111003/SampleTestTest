/**
 *
 */
package javasrc;

/**
 * @author j-uchida
 *
 */
public class Order {
	private int sales_id;//受注番号
	private int order_id;//注文番号
	private String sales_date;//売上時間
	private String employee_id;//従業員番号
	private String employee_name;//従業員名前
	private int money;//受取金額

	public Order(){
		sales_id = 0;
		order_id = 0;
		money = 0;
	}

	public void check() {
		System.out.println(sales_id);
		System.out.println(order_id);
		System.out.println(sales_date);
		System.out.println(employee_id);
		System.out.println(employee_name);
		System.out.println(money);
	}

	public int getSales_id() {
		return sales_id;
	}

	public int getOrder_id() {
		return order_id;
	}

	public int getMoney() {
		return money;
	}

	public String getSales_date() {
		return sales_date;
	}

	public String getEmployee_id() {
		return employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	//setter
	public void setSales_id(int sales_id) {
		this.sales_id = sales_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void setSales_date(String sales_date) {
		this.sales_date = sales_date;
	}

	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
}
