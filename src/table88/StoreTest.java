package table88;

public class StoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//public StoreVO(String storeName, String storeIntro, String phoneNum,String businessHours, String location, int room, boolean isUse) {
		
		StoreVO vo = new StoreVO("팔각도","설명","02-920-8888","9:00~17:00","성수",1, true);
//		Store store = new Store(vo);
		
		 // MenuDAO 객체 생성 및 addMenu 호출
		StoreDAO dao = new StoreDAO();
	        dao.connect();
	        dao.createStore(vo);
//	        dao.createMenu(vo2);
	
	}
	
	

}
