package com.example.yangjiaxin;

import java.util.Scanner;

public class P2081 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int n = scanner.nextInt();
			String a[] = new String[n];
			for (int i = 0; i < n; i++) {
				a[i] = scanner.next();
			}
			for (int i = 0; i < a.length; i++) {
				String b = a[i].substring(a[i].length()-5, a[i].length());
				String c = "6";
				c = c + b;
				System.out.println(c);
			}
		}
		scanner.close();
	}

}
