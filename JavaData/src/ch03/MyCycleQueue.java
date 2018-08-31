package ch03;

public class MyCycleQueue {
	//底层使用数组
	private long[] arr;
	//有效数据的大小
	private int element;
	//队头
	private int front;
	//队尾
	private int end;
	
	/**
	 * 默认构造方法
	 */
	public MyCycleQueue() {
		arr = new long[10];
		element = 0;
		front = 0;
		end = -1;
	}
	/**
	 * 带参数的构造方法，参数为数组的大小
	 */
	public MyCycleQueue(int maxsize) {
		arr = new long[maxsize];
		element = 0;
		front = 0;
		end = -1;
	}
	/**
	 * 添加数据，从队尾插入
	 */
	public void insert(long value) {
		if (end == arr.length - 1) {
			end = -1;
		}
		arr[++end] = value;
		element++;
	}
	/**
	 * 删除数据，从队头删除
	 */
	public long remove() {
		long value = arr[front++];
		if (front == arr.length - 1) {
			front = 0;
		}
		element--;
		return value;
	}
	/**
	 * 查看数据
	 */
	public long peek() {
		return arr[front];
	}
	/**
	 * 判断是否为空
	 */
	public boolean isEmpty() {
		return element == 0;
	}
	/**
	 * 判断是否满了
	 */
	public boolean isFull() {
		return element == arr.length;
	}
	
	
	
	
	
	
	
	
	
	
	

}
