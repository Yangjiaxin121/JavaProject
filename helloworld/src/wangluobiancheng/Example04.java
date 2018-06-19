package wangluobiancheng;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Example04 {
	public static void main(String[] args) throws Exception {
		new TCPserver().listen();
	}

}
class TCPserver{
	private static final int PORT = 7788;
	public void listen() throws Exception {
		ServerSocket serverSocket = new ServerSocket(PORT);
		Socket client = serverSocket.accept();
		OutputStream os = client.getOutputStream();
		System.out.println("开始与客户端交互数据");
		os.write("传智播客欢迎你！".getBytes());
		Thread.sleep(5000);
		System.out.println("结束与客户端交互数据");
		os.close();
		client.close();
		
	}
}