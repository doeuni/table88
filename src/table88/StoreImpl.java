package table88;

public class StoreImpl implements IStore {
	StoreDAO dao;
	
	public StoreImpl() {
		this.dao = new StoreDAO();
	}
	@Override
	public void createStore(StoreVO vo) {
		// TODO Auto-generated method stub
		dao.createStore(vo);

	}

	@Override
	public void deleteStore(int storeId) {
		// TODO Auto-generated method stub
		dao.deleteStore(storeId);

	}
//	@Override
//	public void readStore(StoreVO vo) {
//		// TODO Auto-generated method stub
//		dao.readStore(vo);
//	}
//	@Override
//	public void updateStore(StoreVO vo) {
//		// TODO Auto-generated method stub
//		dao.updateStore(vo);
//	}

}
