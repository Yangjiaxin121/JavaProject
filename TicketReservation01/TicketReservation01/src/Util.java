import java.sql.*;

import java.util.*;


public class Util {
	static List<String> list;
	static Connection conn;
	static ResultSet  rs;
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost:3306/ticket";
	static String name;
	    // 鏁版嵁搴撶殑鐢ㄦ埛鍚嶄笌瀵嗙爜锛岄渶瑕佹牴鎹嚜宸辩殑璁剧疆
	    static final String USER = "root";
	    static final String PASS = "1234";
	 
	static{
		
		try {
			//娉ㄥ唽椹卞姩
			Class.forName(JDBC_DRIVER);
			//寤虹珛涓庢暟鎹簱鐨勯┍鍔�
			//conn = DriverManager.getConnection(DB_URL,USER,PASS);
			conn = DriverManager
					.getConnection("jdbc:mysql://localhost/Ticket?useSSL=true&user=root&password=1234");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static List<String> queryinfo(entity e) {
		String name=e.name;
		String sql="select * from ticket where name=?";
		list=new ArrayList<>();
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, name);
			rs=ps.executeQuery();
			while (rs.next()) {
				list.add(rs.getString("name"));
				list.add(rs.getString("idnumber"));
				list.add(rs.getString("info"));
				
			}
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return list;
	}
	
	
}