package IO;

import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyReader {
	public static void main(String[] args) {	
		try {
			FileReader in = new FileReader("/Users/yangjiaxin/eclipse-workspace1/zuoye/src/IO/CopyReader.java");
			FileWriter out = new FileWriter("/Users/yangjiaxin/eclipse-workspace1/zuoye/src/IO/target1.txt");
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
