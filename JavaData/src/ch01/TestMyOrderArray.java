package ch01;

public class TestMyOrderArray {
	public static void main(String[] args) {
		MyOrderArray array = new MyOrderArray();
		array.insert(90);
		array.insert(30);
		array.insert(80);
		array.insert(10);
		
		array.display();
		
		System.out.println(array.binarySearch(10));
	}

}
