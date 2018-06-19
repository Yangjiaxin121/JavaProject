package IO;

import java.io.*;

public class Example08 {
	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader("reader.txt");
		int ch;
		while((ch=reader.read())!=-1) {
			System.out.println((char)ch);
		}
		reader.close();
	}

}
