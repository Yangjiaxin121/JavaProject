package IO;

import java.io.*;

public class Example09 {
	public static void main(String[] args) throws Exception {
		FileWriter writer = new FileWriter("writer.txt");
		String str = "你好，传智播客";
		writer.write(str);
		writer.write("\r\n");
		writer.close();
	}

}
