package com.example.yangjiaxin;

import java.util.Arrays;
import java.util.Scanner;

public class P1052 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int n = scanner.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			int money = 0;
			for (int i = 0; i < a.length; i++) {
				a[i] = scanner.nextInt();
			}
			for (int i = 0; i < b.length; i++) {
				b[i] = scanner.nextInt();
			}
			Arrays.sort(a);
			Arrays.sort(b);
			for (int i = a.length-1; i >= 0; i--) {
				for (int j = b.length-1; j >=0; j--) {
					if (a[i]>b[j]) {
						money = money+200;
						b[j] = b[b.length-1];
						b = Arrays.copyOf(b, b.length-1);
						break;
					}
					
					if (j == 0) {
						if (a[i]==b[j]) {
							money = money+0;
							b = Arrays.copyOf(b, b.length-1);
						}else {
							money = money - 200;
							b = Arrays.copyOf(b, b.length-1);
						}
					
					}
					
				}
			}
			System.out.println(money);
		}
		scanner.close();
	}

}
