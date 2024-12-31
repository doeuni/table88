package table88;

public class MenuTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ReviewTest --> Review --> IReview --> ReviewImpl --> ReviewDAO --> DB
//		MenuVO vo = new MenuVO("pasta", 10000,null);
//		Menu menu = new Menu(vo);
//		
		StoreVO vos = new StoreVO("팔각도","02-920-8888","9:00~17:00","성수", null, 0, false);
		MenuVO vo = new MenuVO("ramen", 1000, vos);
		MenuVO vo2 = new MenuVO("pasta", 3000, vos);

		 // MenuDAO 객체 생성 및 addMenu 호출
		 MenuDAO dao = new MenuDAO();
	        dao.connect();
	        dao.createMenu(vo);
	        dao.createMenu(vo2);
	}

}
