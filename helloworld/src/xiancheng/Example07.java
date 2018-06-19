package xiancheng;
class MaxPriority implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i< 10; i++) {
			System.out.println(Thread.currentThread().getName()+"正在输出："+i);
		}
	}
	
}

class MinPriority implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i< 10; i++) {
			System.out.println(Thread.currentThread().getName()+"正在输出："+i);
		}
	}
	
}

public class Example07 {
	public static void main(String[] args) {
		Thread minPriority = new Thread(new MinPriority(),"优先级较低的线程");
		Thread maxPriority = new Thread(new MaxPriority(),"优先级较高的线程");
		minPriority.setPriority(Thread.MIN_PRIORITY);
		maxPriority.setPriority(Thread.MAX_PRIORITY);
		maxPriority.start();
		minPriority.start();
	}

}
