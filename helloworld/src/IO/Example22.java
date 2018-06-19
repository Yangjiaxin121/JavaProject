package IO;

import java.io.*;

public class Example22 {
	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader("A.txt");
		CharArrayWriter caw = new CharArrayWriter();
		int b;
		while((b=reader.read())!=-1) {
			caw.write(b);
		}
		reader.close();
		caw.close();
		char[] c = caw.toCharArray();
		CharArrayReader cr = new CharArrayReader(c);
		int i = 0;
		while((i=cr.read())!=-1) {
			System.out.println((char)i);
		}
	}
}
