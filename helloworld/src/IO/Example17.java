package IO;

import java.io.IOException;

public class Example17 {
	public static void main(String[] args) throws IOException {
		StringBuffer sb = new StringBuffer();
		int ch;
		while((ch=System.in.read())!=-1) {
			if(ch=='\r'||ch=='\n') {
				break;
			}
			sb.append((char)ch);
			
		}
		System.out.println(sb);
	}

}
