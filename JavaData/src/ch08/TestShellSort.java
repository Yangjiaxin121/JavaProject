package ch08;

public class TestShellSort {
	
	public static void main(String[] args) {
		long[] arr = new long[5];
		arr[0] = 34;
		arr[1] = 23;
		arr[2] = 2;
		arr[3] = 1;
		arr[4] = -4;
		System.out.print("[");
		for (long l : arr) {
			System.out.print(l + " ");
		}
		System.out.println("]");
		
		System.out.println();
		
		ShellSort.sort(arr);
		System.out.print("[");
		for (long l : arr) {
			System.out.print(l + " ");
		}
		System.out.println("]");
		
	}
	
	


}
