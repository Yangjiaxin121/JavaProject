package com.example.yangjiaxin;

import java.util.Scanner;

public class P2089 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if (a==0 && b==0) {
				System.exit(0);
			}
			int m = 0;
			if (a > b) {
				int temp = a;
				a = b;
				b = temp;
			}
			for (int i = a; i <= b; i++) {
				String string = String.valueOf(i);
				if (string.contains("4") || string.contains("62")) {
					continue;
				}
				m++;
			}
			System.out.println(m);
		}
		scanner.close();
	}

}
