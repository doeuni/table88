package table88;

import java.util.List;

public class StoreVO {
	private static int counter = 1;
	private int storeId;
	private String storeName;
	private String phoneNum;
	private String openingHours;
	private String location;
	private int room;
	private List<MenuVO> menus;
	private String storeIntro;
	private String businessHours;
	private boolean isUse;
	public String getBusinessHours() {
		return businessHours;
	}


	public void setBusinessHours(String businessHours) {
		this.businessHours = businessHours;
	}


	public boolean getIsUse() {
		return isUse;
	}


	public void setUse(boolean isUse) {
		this.isUse = isUse;
	}


	public String getStoreIntro() {
		return storeIntro;
	}


	public void setStoreIntro(String storeIntro) {
		this.storeIntro = storeIntro;
	}


	//생성자
	public StoreVO(String storeName, String storeIntro, String phoneNum,String businessHours, String location, int room, boolean isUse) {
		//store_id, store_name,store_intro, phone_num, business_hours, location, room, is_use
		this.storeId = counter++;
		this.storeName = storeName;
		this.storeIntro = storeIntro;
		this.phoneNum = phoneNum;
		this.businessHours = businessHours;
		this.location = location;
		this.room = room;
		this.isUse= isUse;
	}
	
	
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		StoreVO.counter = counter;
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getOpeningHours() {
		return openingHours;
	}
	public void setOpeningHours(String openingHours) {
		this.openingHours = openingHours;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	public List<MenuVO> getMenus() {
		return menus;
	}
	public void setMenus(List<MenuVO> menus) {
		this.menus = menus;
	}
	

}
