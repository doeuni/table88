package table88;

public class MenuImpl implements IMenu {

	MenuDAO dao;
	
	public MenuImpl() {
		this.dao = new MenuDAO();
	}
	@Override
	public void createMenu(MenuVO vo) {
		// TODO Auto-generated method stub
		dao.createMenu(vo);
	}

	@Override
	public void deleteMenu(int menuId) {
		// TODO Auto-generated method stub
		dao.deleteMenu(menuId);
	}

}
