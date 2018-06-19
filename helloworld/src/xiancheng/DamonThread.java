package xiancheng;

public class DamonThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println(Thread.currentThread().getName()+"---is running");
		}
	}

}
