package table88;

public class Store {
	IStore is;
	StoreVO vo;
	
	public Store(StoreVO vo) {
		this.is = new StoreImpl();
		this.vo = vo;
	}
	
	//가게 추가하기
	public void createStore() {
		is.createStore(vo);
	}
	
	
	//가게 삭제
	public void deleteStore() {
		is.deleteStore(vo.getStoreId());
	}
	
//	//가게 조회
//	public void readStore() {
//		is.readStore(vo);
//	}
//	
//	//가게 업데이트
//	public void updateStore() {
//		is.updateStore(vo);
//	}
//	

}
