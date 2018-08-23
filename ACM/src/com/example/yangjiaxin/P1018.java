package com.example.yangjiaxin;

import java.util.Scanner;

public class P1018 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int n = scanner.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
			}
			for (int i = 0; i < a.length; i++) {
				long result = 1;
				int m =0;
				for (int j = 1; j <= a[i]; j++) {
					result = result*j;
				}
				//System.out.println(result);
				while(result != 0) {
					result = result/10;
					m++;
				}
				System.out.println(m);
			}
			
		}
		scanner.close();
	}

}
