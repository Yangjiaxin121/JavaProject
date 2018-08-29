package shilaoshi;

/**
 *                             _ooOoo_
 *                            o8888888o
 *                            88" . "88
 *                            (| -_- |)
 *                            O\  =  /O
 *                         ____/`---'\____
 *                       .'  \\|     |//  `.
 *                      /  \\|||  :  |||//  \
 *                     /  _||||| -:- |||||-  \
 *                     |   | \\\  -  /// |   |
 *                     | \_|  ''\---/''  |   |
 *                     \  .-\__  `-`  ___/-. /
 *                   ___`. .'  /--.--\  `. . __
 *                ."" '<  `.___\_<|>_/___.'  >'"".
 *               | | :  `- \`.;`\ _ /`;.`/ - ` : | |
 *               \  \ `-.   \_ __\ /__ _/   .-` /  /
 *          ======`-.____`-.___\_____/___.-`____.-'======
 *                             `=---='
 *          ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
 *                     佛祖保佑        永无BUG
 *            佛曰:
 *                   写字楼里写字间，写字间里程序员；
 *                   程序人员写程序，又拿程序换酒钱。
 *                   酒醒只在网上坐，酒醉还来网下眠；
 *                   酒醉酒醒日复日，网上网下年复年。
 *                   但愿老死电脑间，不愿鞠躬老板前；
 *                   奔驰宝马贵者趣，公交自行程序员。
 *                   别人笑我忒疯癫，我笑自己命太贱；
 *                   不见满街漂亮妹，哪个归得程序员？
*/



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

public class Fish1 {

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
			sourceDate = simpleDateFormat.parse("2010-1-1"); // 对源字符串类型进行转换
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
			if (day == -1) { // 如果返回天数为-1，则设置state为非法并存如数据库
				state = "输入Date非法";
				save(strDate, state);
				continue;
			}  
			System.out.println(strDate);
			//System.out.println(day);
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

		long time = date.getTime() - sourceDate.getTime(); // 计算目标日期的格林威治时间和源日期的格林威治时间之差
		int day = (int) (time / 1000 / 60 / 60 / 24); // 根据返回的毫秒数计算天数
		return day;
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
		String sql = "insert into fish(date,state) values(?,?)";
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
