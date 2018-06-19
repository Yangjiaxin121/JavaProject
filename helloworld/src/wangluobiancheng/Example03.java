package wangluobiancheng;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Example03 {
	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(3000);
		String str = "hello world";
		DatagramPacket dp = new DatagramPacket(str.getBytes(),str.length(),
				InetAddress.getByName("localhost"),8945);
		System.out.println("发送信息");
		ds.send(dp);
		ds.close();
	}

}
