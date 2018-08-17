package com.example.yangjiaxin;

import java.util.Scanner;

public class P2089_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if (a == 0 && b == 0) {
				System.exit(0);
			}
			int m = 0;
			if (a > b) {
				int temp = a;
				a = b;
				b = temp;
			}
			for (int i = a; i <= b; i++) {
				int t = i;
				int x = 1;
				while (t > 0) {
					if (t % 10 == 4 || t % 100 == 62) {
						x = 0;
						break;
					}
					t = t/10;
				}
				if (x == 1) {
					m++;
				}
			}
			System.out.println(m);
		}
		scanner.close();
	}

}
