package IO;

import java.io.*;

public class Example19 {
	public static void main(String[] args) throws Exception {
		final PipedInputStream pis = new PipedInputStream();
		final PipedOutputStream pos = new PipedOutputStream();
		pis.connect(pos);
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				PrintStream ps = new PrintStream(pos);
				while(true) {
					try {
						System.out.print(Thread.currentThread().getName()+"要求输入的内容：");
						ps.println(br.readLine());
						Thread.sleep(1000);
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
			
		},"发送数据的线程").start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				BufferedReader br = new BufferedReader(new InputStreamReader(pis));
				while(true) {
					try {
						System.out.println(Thread.currentThread().getName()+"收到的内容："+br.readLine());
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
			
		},"接受数据的线程").start();
	}

}
