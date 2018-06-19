package xiancheng;

public class Example01 {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
		while(true) {
			System.out.println("Main方法在运行");
		}
	}

}
