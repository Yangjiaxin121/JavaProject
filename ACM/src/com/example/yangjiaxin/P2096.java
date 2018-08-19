package com.example.yangjiaxin;

import java.util.Scanner;

public class P2096 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			int c[] = new int[n];
			int a1;
			int b1;
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
				b[i] = scanner.nextInt();
				a1 = a[i]%100;
				b1 = b[i]%100;
				c[i] = (a1 + b1)%100;
			}
			for (int i = 0; i < c.length; i++) {
				System.out.println(c[i]);
			}
			
		}
		scanner.close();
	}

}
