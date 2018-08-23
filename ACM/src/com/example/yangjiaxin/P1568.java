package com.example.yangjiaxin;

import java.util.Scanner;

public class P1568 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int a = scanner.nextInt();
			long b = f(a);
			int m = 0;
			long c = b;
			while(c!=0) {
				c = c/10;
				m++;
			}
			int d = m-4;
			int e = 1;
			for (int i = 0; i < d; i++) {
				e = e*10;
			}
//			System.out.println(b);
//			System.out.println(m);
			System.out.println(b/e);
		}
		scanner.close();
	}

	private static long f(int a) {
		// TODO Auto-generated method stub
		if (a == 0) {
			return 0;
		}
		if (a == 1) {
			return 1;
		}
		return f(a-1)+f(a-2);
	}

}
