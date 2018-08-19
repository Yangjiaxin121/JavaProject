package com.example.yangjiaxin;

import java.util.Scanner;

public class P2138 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int n = scanner.nextInt();
			int a;
			int m = 0;
			for (int i = 0; i < n; i++) {
				a = scanner.nextInt();
				if (isPrim(a) == 1) {
					m++;
				}
			}
			System.out.println(m);
		}
		scanner.close();
	}
	
	static int isPrim(int x) {
		int k = (int) Math.sqrt(x);
		for (int j = 2; j <= k; j++) {
			if (x%j == 0) {
				return 0;
			}
		}
		return 1;
	}

}
