package com.example.yangjiaxin;

import java.util.Scanner;

public class P1443 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int k = scanner.nextInt();
			int a[] = new int[2*k];
			int b[] = null;
			int m=0;
			int flag = 2*k-1;
			int index = 0;
			int sum=0;
			
			while(true) {
				for (int i = 0; i < a.length; i++) {
					a[i] = 0;
				}
				b = a;
				flag = 2*k-1;
				for (int j = 0; j < b.length; j++) {
					sum = 0;
					if (index == 0) {
						flag = j;
						index = m;
						b[flag] = 1;
					}
					for (int i = k; i < b.length; i++) {
						if (b[i] ==1) {
							sum++;
						}
					}
					if (flag < k) {
						break;
					}
					if (b[j] != 1) {
						index--;
					}
					if (j==b.length) {
						j = 0;
					}
				}
				m++;
				index = m;
				if (sum == k) {
					break;
				}
				
			}
			System.out.println(m);
		}
		scanner.close();
	}

}
