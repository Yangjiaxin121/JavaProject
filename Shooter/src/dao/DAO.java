package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.DBUtil;

/**
 * 此类就是用来完成数据库增删改查的
 * @author yangjiaxin
 *
 */

public class DAO {
	/*
	 * 增加分数的方法
	 */
	public void save(int score) {
		PreparedStatement ps = null;
		Connection conn = null;
		String sql = "insert into shooter(score) values(?)";
		try {
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, score);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(conn);
		}
	}
	public int max() {
		PreparedStatement ps = null;
		Connection conn = null;
		ResultSet rs=null;
		String sql = "select max(score) from shooter";
		try {
			conn = DBUtil.getConnection();
			Statement stat = conn.createStatement();
			//执行语句，得到结果
			rs=stat.executeQuery(sql);
			//使结果集光标向前移动一行
			rs.next();
			return rs.getInt(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(conn);

		}
		return 0;
	}

}
