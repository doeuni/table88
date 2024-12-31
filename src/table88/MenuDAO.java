package table88;

import java.sql.*;

public class MenuDAO {
	
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
	    public void createMenu(MenuVO vo) {
	        String query = "INSERT INTO menu (menu_id, menu_name, price, is_use, store_id) VALUES ("
	                + vo.getMenuId() + ", '"
	                + vo.getMenuName() + "', "
	                + vo.getPrice() + ", "
	                + (vo.getIsUse()) + ", "
	                + vo.getStore().getStoreId() + ")";
	        try {
	            int i = stmt.executeUpdate(query);
	            System.out.println(i + "행이 추가되었습니다.");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    // 메뉴 삭제
	    public void deleteMenu(int menuId) {
	        String query = "DELETE FROM menu WHERE menu_id = " + menuId;

	        try {
	            int i = stmt.executeUpdate(query);
	            System.out.println(i + "행이 삭제되었습니다.");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
}