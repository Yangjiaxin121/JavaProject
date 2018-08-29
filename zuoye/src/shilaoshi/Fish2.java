package shilaoshi;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Fish2 {

	private static SimpleDateFormat simpleDateFormat; // 定义SimpleDateFormat对日期进行解析
	static Date sourceDate = null; // 定义源日期

	public static void main(String[] args) throws IOException {

		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd"); // 设置日期输入格式
		simpleDateFormat.setLenient(false); // 设置如果日期不合法则抛出异常
		String strDate = null; // 目标Date字符串
		int day; // 两个日期之间的天数
		int remainder; // 对5取余后的余数
		String state; // 状态
		try {
			sourceDate = simpleDateFormat.parse("1990-1-1"); // 对源字符串类型进行转换
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("输入Date非法"); // 如果日期不合法，则抛出异常
		}

		// BufferedReader按行读取文件
		FileInputStream inputStream = new FileInputStream("target.txt"); // 读取文件中的数据
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

		while ((strDate = bufferedReader.readLine()) != null) { // 按行读取
			// System.out.println(str);
			day = getDay(strDate); // 调用getDay函数，计算目标日期与源日期之间的天数
			//System.out.println(day);
			if (day == -1) { // 如果返回天数为-1，则设置state为非法并存如数据库
				state = "输入Date非法";
				save(strDate, state);
				continue;
			}
			System.out.println(strDate);
			remainder = day % 5; // 计算天数对5取余的数
			if (remainder > 0 && remainder <= 3) { // 若在0至3之间即为打鱼，否则为晒网
				System.out.println("打鱼");
				state = "打鱼";
				save(strDate, state); // 将打鱼状态，日期存入数据库
			} else {
				System.out.println("晒网");
				state = "晒网";
				save(strDate, state); // 将晒网状态，日期存入数据库
			}
		}

		// close
		inputStream.close();
		bufferedReader.close();

	}

	/**
	 * 计算目标日期与源日期之间的天数
	 * 
	 * @param dateString
	 * @return
	 */
	private static int getDay(String dateString) {
		// TODO Auto-generated method stub
		Date date = null;
		try {
			date = simpleDateFormat.parse(dateString); // 对源字符串类型进行转换
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("输入Date非法"); // 如果日期不合法则返回-1
			return -1;
		}
		
		int year=0, month=0, day=0, m = 0; // 先定义需要输入的year，month，day，m表示月分的总天数
		// 输入年份日期
		year = date.getYear();
		month = date.getMonth();
		day = date.getDay();
		System.out.println(year+"-"+month+"-"+day);
		// 判断是否为闰年
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			switch (month - 1) // 若是闰年，月份减一，通过switch语句累加之前月份的天数
			{
			case 0:
				m = 0;
				break;
			case 1:
				m = 31;
				break;
			case 2:
				m = 31 + 29;
				break;
			case 3:
				m = 31 + 29 + 31;
				break;
			case 4:
				m = 31 + 29 + 31 + 30;
				break;
			case 5:
				m = 31 + 29 + 31 + 30 + 31;
				break;
			case 6:
				m = 31 + 29 + 31 + 30 + 31 + 30;
				break;
			case 7:
				m = 31 + 29 + 31 + 30 + 31 + 30 + 31;
				break;
			case 8:
				m = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
				break;
			case 9:
				m = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
				break;
			case 10:
				m = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
				break;
			case 11:
				m = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
				break;
			}
		} else {
			switch (month - 1) // 若为平年，与上面类似，只是2月改成28天
			{
			case 0:
				m = 0;
				break;
			case 1:
				m = 31;
				break;
			case 2:
				m = 31 + 28;
				break;
			case 3:
				m = 31 + 28 + 31;
				break;
			case 4:
				m = 31 + 28 + 31 + 30;
				break;
			case 5:
				m = 31 + 28 + 31 + 30 + 31;
				break;
			case 6:
				m = 31 + 28 + 31 + 30 + 31 + 30;
				break;
			case 7:
				m = 31 + 28 + 31 + 30 + 31 + 30 + 31;
				break;
			case 8:
				m = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
				break;
			case 9:
				m = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
				break;
			case 10:
				m = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
				break;
			case 11:
				m = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
				break;
			}
		}

		int n, s; // 定义闰年个数为n，年份累计数为s
		n = (year - 2010 + 1) / 4; // 计算闰年天数
		s = n * 366 + (year - 2010 - n) * 365; // 累计平年天数与闰年天数
		int sum=0; // 定义总天数sum
		sum = s + m + day; // 累加年份累计数、月份累计数和day天数
		
		return sum;
	}

	/**
	 * 建立连接
	 * 
	 * @return
	 */
	public static Connection getConnection() {
		Connection conn = null;
		try {
			// 1.注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			// 2.建立连接
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Fish?useSSL=yes", "root", "1234");
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

	/**
	 * save函数，将源Date与状态存入数据库
	 * 
	 * @param strDate
	 * @param state
	 */
	public static void save(String strDate, String state) {
		PreparedStatement ps = null;
		Connection conn = null;
		String sql = "insert into fish1(date,state) values(?,?)";
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, strDate);
			ps.setString(2, state);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
