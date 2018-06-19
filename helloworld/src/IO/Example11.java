package IO;

import java.io.FileNotFoundException;
import java.io.*;

public class Example11 {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("/Users/yangjiaxin/eclipse-workspace/helloworld/src/IO/Example09.java");
		FileWriter fw = new FileWriter("/Users/yangjiaxin/eclipse-workspace/helloworld/src/IO/copy.java");
		LineNumberReader lr = new LineNumberReader(fr);
		lr.setLineNumber(0);
		String line = null;
		while((line=lr.readLine())!=null) {
			fw.write(lr.getLineNumber()+":"+line);
			fw.write("\n");
		}
		fw.close();
		lr.close();
		
	}

}
