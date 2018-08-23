package com.example.yangjiaxin;

import java.util.Scanner;

public class P1005 {
	private static int[] arr = new int[100000000];
	private static int result[] = new int[10000];

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = 0;
		while(scanner.hasNext()) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int n = scanner.nextInt();
			if (a < 1 & a > 1000 & b < 1 & b > 1000 & b < 1 & a > 100000000)
				System.exit(0);
			if (a==0&&b==0&&n==0) {
				for (int i = 0; i < result.length; i++) {
					if (result[i] == 0) {
						break;
					}
					System.out.println(result[i]);
				}
			
				System.exit(0);
				
			}
			init(a,b,n);
			//System.out.println(arr[n]);
			result[m++] = arr[n];
		}
		scanner.close();
	}

	private static void init(int a, int b, int n) {
		// TODO Auto-generated method stub
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 1;
		for (int i = 3; i < arr.length; i++) {
			//f(n) = (A * f(n - 1) + B * f(n - 2)) mod 7.
			arr[i] = (a*arr[i-1]+b*arr[i-2])%7;
		}
	}

}
