package shilaoshi;

import java.util.Scanner;

public class Fish {
	public static void main(String[] args) {
		int year, month, day, m = 0; // 先定义需要输入的year，month，day
		// cin>>year>>month>>day;
		// 输入年份日期
		Scanner scanner = new Scanner(System.in);
		year = scanner.nextInt();
		month = scanner.nextInt();
		day = scanner.nextInt();
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
		int sum; // 定义总天数sum
		sum = s + m + day - 1; // 累加年份累计数、月份累计数和day天数
		// cout<<sum<<endl; //输出某日期到2010.1.1的天数
		System.out.println(sum);
		int a;
		a = sum % 5; // 计算天数对5取余的数
		if (a > 0 && a <= 3) // 若在0至3之间即为打鱼，否则为晒网
		{
			// cout<<"打鱼"<<endl;
			System.out.println("打鱼");
		} else {
			// cout<<"晒网"<<endl;
			System.out.println("晒网");
		}

	}
}
/*
 * 
 */
