/**
 *
 */
package sampleClass;

import java.io.Serializable;
import java.util.Date;

/**
 * @author j-uchida
 *
 */
public class SampleClass implements Serializable {

	private int sales_id;
	private int order_id;
	private Date sales_date;
	private String employee_id;
	private String employee_name;
	private String ice_cream_container_id;
	private String ice_cream_inf_id;
	private String flavor_id_1;
	private String flavor_id_2;
	private String flavor_id_3;


	//getter
	public int getSales_id() {
		return sales_id;
	}

	public int getOrder_id() {
		return order_id;
	}

	public Date getSales_date() {
		return sales_date;
	}

	public String getEmployee_id() {
		return employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public String getIce_cream_container_id() {
		return ice_cream_container_id;
	}

	public String getIce_cream_inf_id() {
		return ice_cream_inf_id;
	}

	public String getFlavor_id_1() {
		return flavor_id_1;
	}

	public String getFlavor_id_2() {
		return flavor_id_2;
	}

	public String getFlavor_id_3() {
		return flavor_id_3;
	}

	//setter
	public void setSales_id(int sales_id) {
		this.sales_id = sales_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public void setSales_date(Date sales_date) {
		this.sales_date = sales_date;
	}

	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public void setIce_cream_container_id(String ice_cream_container_id) {
		this.ice_cream_container_id = ice_cream_container_id;
	}

	public void setIce_cream_inf_id(String ice_cream_inf_id) {
		this.ice_cream_inf_id = ice_cream_inf_id;
	}

	public void setFlavor_id_1(String flavor_id_1) {
		this.flavor_id_1 = flavor_id_1;
	}

	public void setFlavor_id_2(String flavor_id_2) {
		this.flavor_id_2 = flavor_id_2;
	}

	public void setFlavor_id_3(String flavor_id_3) {
		this.flavor_id_3 = flavor_id_3;
	}

}
