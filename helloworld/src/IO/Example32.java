package IO;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Example32 {
	public static void main(String[] args) throws Exception {
		String str = "传智";
		byte[] b1 = str.getBytes();
		byte[] b2 = str.getBytes("GBK");
		System.out.println(Arrays.toString(b1));
		System.out.println(Arrays.toString(b2));
		byte[] b3 = str.getBytes("UTF-8");
		String result1 = new String(b1,"UTF-8");//Mac默认使用UTF-8
		System.out.println(result1);
		String result2 = new String(b2,"GBK");//windows默认使用GBK
		System.out.println(result2);
		String result3 = new String(b3,"UTF-8");
		System.out.println(result3);
		String result4 = new String(b2,"ISO8859-1");
		System.out.println(result4);
	}

}
