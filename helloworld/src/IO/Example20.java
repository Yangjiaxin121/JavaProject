package IO;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example20 {
	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("source.txt");
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		FileOutputStream out = new FileOutputStream("target.txt");
		int b;
		while((b=in.read())!=-1) {
			bos.write(b);
		}
		in.close();
		bos.close();
		out.write(bos.toByteArray());
		out.close();
	}

}
