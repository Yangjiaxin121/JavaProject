package IO;

import java.io.*;

public class CopyStream {
	public static void main(String[] args) {	
		try {
			InputStream in = new FileInputStream("/Users/yangjiaxin/eclipse-workspace1/zuoye/src/IO/CopyStream.java");
			OutputStream out = new FileOutputStream("/Users/yangjiaxin/eclipse-workspace1/zuoye/src/IO/target.txt");
			int len;
			while((len = in.read()) != -1) {
				out.write(len);
			}
			in.close();
			out.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
