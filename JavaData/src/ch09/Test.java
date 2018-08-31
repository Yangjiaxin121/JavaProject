package ch09;

public class Test {
	
	public static void main(String[] args) {
		long[] arr = new long[10];
		
		for (int i = 0; i < 10; i++) {
			arr[i] = (long) (Math.random()*99);
		}
		QuickSort.display(arr);
		
		long point = arr[arr.length-1];
		QuickSort.partition(arr, 0, arr.length - 1, point);
		
		QuickSort.display(arr);
	}

}
