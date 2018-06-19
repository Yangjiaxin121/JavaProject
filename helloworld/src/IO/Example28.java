package IO;

import java.io.File;

public class Example28 {
	public static void main(String[] args) {
		File file = new File("/Users/yangjiaxin/eclipse-workspace/helloworld/src");
		fileDir(file);
	}

	public static void fileDir(File dir) {
		// TODO Auto-generated method stub
		File[] files = dir.listFiles();
		for(File file:files) {
			if(file.isDirectory()) {
				fileDir(file);
			}
			System.err.println(file.getAbsolutePath());
		}
	}

}
