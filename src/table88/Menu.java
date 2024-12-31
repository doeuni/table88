package table88;

public class Menu {
	IMenu im;
	MenuVO vo;
	
	public Menu(MenuVO vo) {
		this.im = new MenuImpl();
		this.vo = vo;
		
	}
	
	//메뉴 추가하기
	public void createMenu() {
		im.createMenu(vo);
	}
	//메뉴 삭제하기
	public void deleteMenu() {
		im.deleteMenu(vo.getMenuId());
	}
}
