package IO;

import java.io.*;

public class Targer3 {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("/Users/yangjiaxin/eclipse-workspace1/zuoye/src/IO/CopyBufferReader.java");
			BufferedReader br = new BufferedReader(reader);
			FileWriter writer = new FileWriter("/Users/yangjiaxin/eclipse-workspace1/zuoye/src/IO/Targer3.java");
			BufferedWriter bw = new BufferedWriter(writer);
			String str = null;
			while((str = br.readLine()) != null) {
				bw.write(str);
				bw.newLine();
			}
			br.close();
			bw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
