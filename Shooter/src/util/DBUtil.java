package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 此类是用来连接数据库的
 * @author yangjiaxin
 * @version 1.7
 */
public class DBUtil {
	public static void main(String[] args) {
		Connection conn = DBUtil.getConnection();
		System.out.println(conn);
		DBUtil.close(conn);
	}
	public static void close(Connection conn) {
		// TODO Auto-generated method stub
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		Connection conn = null;
		try {
			//1.注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			//2.建立连接
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Shooter?useSSL=yes", "root","1234");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("注册驱动失败");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return conn;
		
	}
	

}
