package IO;

import java.io.File;

public class Example26 {
	public static void main(String[] args) {
		File file = new File("/Users/yangjiaxin/eclipse-workspace/helloworld/src");
		if(file.isDirectory()) {
			String[] names = file.list();
			for(String name : names) {
				System.out.println(name);
			}
		}
		
	}

}
