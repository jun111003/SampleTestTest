package javasrc;

import java.io.Serializable;

public class Sales implements Serializable {
	private String ice_cream_container_id;//アイスクリーム容器ID
	private String ice_cream_container_name;//アイスクリーム容器名前
	private int ice_cream_container_price;//アイスクリーム容器金額
	private String ice_cream_inf_id;//アイスクリーム詳細ID
	private String ice_cream_size_id;//アイスクリームサイズID
	private String ice_cream_size_name;//アイスクリームサイズ名前
	private String ice_cream_count_id;//アイスクリーム個数ID
	private String ice_cream_count_name;//アイスクリーム個数名前
	private int ice_cream_price;//アイスクリーム金額
	private String flavor_id_1;//アイスクリーム味１
	private String flavor_name_1;//アイスクリーム味１名前
	private String flavor_id_2;//アイスクリーム味２
	private String flavor_name_2;//アイスクリーム味２名前
	private String flavor_id_3;//アイスクリーム味３
	private String flavor_name_3;//アイスクリーム味３名前
	private int money;//受取金額

	public Sales() {
		ice_cream_container_price = 0;
		ice_cream_price = 0;
		money = 0;
	}

	public void check() {
		System.out.println(ice_cream_container_id);
		System.out.println(ice_cream_container_name);
		System.out.println(ice_cream_container_price);
		System.out.println(ice_cream_inf_id);
		System.out.println(ice_cream_size_id);
		System.out.println(ice_cream_size_name);
		System.out.println(ice_cream_count_id);
		System.out.println(ice_cream_count_name);
		System.out.println(ice_cream_price);
		System.out.println(flavor_id_1);
		System.out.println(flavor_name_1);
		System.out.println(flavor_id_2);
		System.out.println(flavor_name_2);
		System.out.println(flavor_id_3);
		System.out.println(flavor_name_3);
		System.out.println(money);
	}

	//getter
	public String getIce_cream_container_id() {
		return ice_cream_container_id;
	}

	public String getIce_cream_container_name() {
		return ice_cream_container_name;
	}

	public int getIce_cream_container_price() {
		return ice_cream_container_price;
	}

	public String getIce_cream_inf_id() {
		return ice_cream_inf_id;
	}

	public String getIce_cream_size_id() {
		return ice_cream_size_id;
	}

	public String getIce_cream_size_name() {
		return ice_cream_size_name;
	}

	public String getIce_cream_count_id() {
		return ice_cream_count_id;
	}

	public String getIce_cream_count_name() {
		return ice_cream_count_name;
	}

	public int getIce_cream_price() {
		return ice_cream_price;
	}

	public String getFlavor_id_1() {
		return flavor_id_1;
	}

	public String getFlavor_name_1() {
		return flavor_name_1;
	}

	public String getFlavor_id_2() {
		return flavor_id_2;
	}

	public String getFlavor_name_2() {
		return flavor_name_2;
	}

	public String getFlavor_id_3() {
		return flavor_id_3;
	}

	public String getFlavor_name_3() {
		return flavor_name_3;
	}

	public int getMoney() {
		return money;
	}

	//setter
	public void setIce_cream_container_id(String ice_cream_container_id) {
		this.ice_cream_container_id = ice_cream_container_id;
	}

	public void setIce_cream_container_name(String ice_cream_container_name) {
		this.ice_cream_container_name = ice_cream_container_name;
	}

	public void setIce_cream_container_price(int ice_cream_container_price) {
		this.ice_cream_container_price = ice_cream_container_price;
	}

	public void setIce_cream_inf_id(String ice_cream_inf_id) {
		this.ice_cream_inf_id = ice_cream_inf_id;
	}

	public void setIce_cream_size_id(String ice_cream_size_id) {
		this.ice_cream_size_id = ice_cream_size_id;
	}

	public void setIce_cream_size_name(String ice_cream_size_name) {
		this.ice_cream_size_name = ice_cream_size_name;
	}

	public void setIce_cream_count_id(String ice_cream_count_id) {
		this.ice_cream_count_id = ice_cream_count_id;
	}

	public void setIce_cream_count_name(String ice_cream_count_name) {
		this.ice_cream_count_name = ice_cream_count_name;
	}

	public void setIce_cream_price(int ice_cream_price) {
		this.ice_cream_price = ice_cream_price;
	}

	public void setFlavor_id_1(String flavor_id_1) {
		this.flavor_id_1 = flavor_id_1;
	}

	public void setFlavor_name_1(String flavor_name_1) {
		this.flavor_name_1 = flavor_name_1;
	}

	public void setFlavor_id_2(String flavor_id_2) {
		this.flavor_id_2 = flavor_id_2;
	}

	public void setFlavor_name_2(String flavor_name_2) {
		this.flavor_name_2 = flavor_name_2;
	}

	public void setFlavor_id_3(String flavor_id_3) {
		this.flavor_id_3 = flavor_id_3;
	}

	public void setFlavor_name_3(String flavor_name_3) {
		this.flavor_name_3 = flavor_name_3;
	}

	public void setMoney(int money) {
		this.money = money;
	}

}