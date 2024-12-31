package table88;

import java.sql.*;

public class StoreDAO {
	
	   private Connection con;
	    private Statement stmt;
	    public void connect() {
	        String url = "jdbc:mysql://localhost:3306/catchtable";
	        String user = "root";
	        String pass = "rnskdud1804!";

	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            con = DriverManager.getConnection(url, user, pass);
	            stmt = con.createStatement();
	            System.out.println("데이터베이스 연결 성공");
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    public void disconnect() {
	        try {
	            if (stmt != null) stmt.close();
	            if (con != null) con.close();
	            System.out.println("데이터베이스 연결 종료");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    // 메뉴 추가
	    public void createStore(StoreVO vo) {
	    	String query = "INSERT INTO store (store_id, store_name, store_intro, phone_num, business_hours, location, room, is_use) VALUES ("
	    			+ vo.getStoreId() + ", '"
	    			+ vo.getStoreName() + "', '"
	    			+ vo.getStoreIntro() + "', '"
	    			+ vo.getPhoneNum() + "', '"
	    			+ vo.getBusinessHours() + "', '"
	    			+ vo.getLocation() + "', "
	    			+ vo.getRoom() + ", "
	    			+ vo.getIsUse()
	    			+ ")";


	        try {
	            int i = stmt.executeUpdate(query);
	            System.out.println(i + "행이 추가되었습니다.");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    // 메뉴 삭제
	    public void deleteStore(int storeId) {
	        String query = "DELETE FROM menu WHERE store_id = " + storeId;

	        try {
	            int i = stmt.executeUpdate(query);
	            System.out.println(i + "행이 삭제되었습니다.");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
}
