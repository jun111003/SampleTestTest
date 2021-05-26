/**
 *
 */
package javasrc;

/**
 * @author j-uchida
 *
 */
public class Stock {
	private int container;
	private int flavor1;
	private int flavor2;
	private int flavor3;
	private int size;
	private String ice_cream_container_name;//アイスクリーム容器名前
	private String ice_cream_container_stock;//アイスクリーム容器名前
	private String flavor_name;//アイスクリーム味１名前
	private String flavor_volume;//アイスクリーム味１名前

	public Stock() {
		container = 0;
		flavor1 = 0;
		flavor2 = 0;
		flavor3 = 0;
	}

	public int getContainer() {
		return container;
	}

	public void setContainer(int container) {
		this.container = container;
	}

	public int getFlavor1() {
		return flavor1;
	}

	public void setFlavor1(int flavor1) {
		this.flavor1 = flavor1;
	}

	public int getFlavor2() {
		return flavor2;
	}

	public void setFlavor2(int flavor2) {
		this.flavor2 = flavor2;
	}

	public int getFlavor3() {
		return flavor3;
	}

	public void setFlavor3(int flavor3) {
		this.flavor3 = flavor3;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getIce_cream_container_name() {
		return ice_cream_container_name;
	}

	public void setIce_cream_container_name(String ice_cream_container_name) {
		this.ice_cream_container_name = ice_cream_container_name;
	}

	public String getIce_cream_container_stock() {
		return ice_cream_container_stock;
	}

	public void setIce_cream_container_stock(String ice_cream_container_stock) {
		this.ice_cream_container_stock = ice_cream_container_stock;
	}

	public String getFlavor_name() {
		return flavor_name;
	}

	public void setFlavor_name(String flavor_name) {
		this.flavor_name = flavor_name;
	}

	public String getFlavor_volume() {
		return flavor_volume;
	}

	public void setFlavor_volume(String flavor_volume) {
		this.flavor_volume = flavor_volume;
	}

}
