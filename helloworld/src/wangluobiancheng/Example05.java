package wangluobiancheng;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Example05 {
	public static void main(String[] args) throws Exception, Exception {
		new TCPClient().connect();
	}

}
class TCPClient{
	private static final int PORT = 7788;
	public void connect() throws Exception, IOException {
		Socket client = new Socket(InetAddress.getLocalHost(),PORT);
		InputStream is = client.getInputStream();
		byte[] buf = new byte[1024];
		int len = is.read(buf);
		System.out.println(new String(buf,0,len));
		client.close();
	}
}
