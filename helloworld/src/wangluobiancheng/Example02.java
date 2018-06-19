package wangluobiancheng;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Example02 {
	public static void main(String[] args) throws Exception {
		byte[] buf = new byte[1024]; //创建一个长度为1024的字节数组，用于接受数据
		//定义一个DatagramSocket对象，监听的端口号为8954
		DatagramSocket ds = new DatagramSocket(8945);
		//定义一个DatagramPacket对象，用于接受数据
		DatagramPacket dp = new DatagramPacket(buf,1024);
		System.out.println("等待接受数据");
		ds.receive(dp);
		String str = new String(dp.getData(),0,dp.getLength())+"from"
				+dp.getAddress().getHostAddress()+":"+dp.getPort();
		System.out.println(str);
		ds.close();
	}

}
