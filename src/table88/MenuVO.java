package table88;

public class MenuVO {
	//static은 공유된다는말
	private static int counter = 5;
	private int menuId;
	private String menuName;
	private int price;
	private int isUse;
	private StoreVO store;
	
	//생성자
	public MenuVO(String menuName, int price, StoreVO store) {
		this.menuId = counter++;
		this.menuName = menuName;
		this.price = price;
		this.isUse = 1;
		this.store = store;		
	}
	
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getIsUse() {
		return isUse;
	}
	public void setIsUse(int isUse) {
		this.isUse = isUse;
	}
	public StoreVO getStore() {
		return store;
	}
	public void setStore(StoreVO store) {
		this.store = store;
	}
}
