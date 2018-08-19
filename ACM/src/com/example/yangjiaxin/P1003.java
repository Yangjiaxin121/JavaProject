package com.example.yangjiaxin;

import java.util.Scanner;

public class P1003 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int max[] = new int[n];
		int start[] = new int[n];
		int end[] = new int[n];
		for (int i = 0; i < n; i++) {
			int m = scanner.nextInt();
			int arr[] = new int[m];

			for (int j = 0; j < m; j++) {
				arr[j] = scanner.nextInt();
			}
			max[i] = arr[0];
			start[i] = 0;
			end[i] = 0;
			int tem;
			for (int j = 0; j < arr.length; j++) {
				tem = arr[j];
				for (int j2 = j + 1; j2 < arr.length; j2++) {
					tem = tem + arr[j2];
					if (tem > max[i]) {
						max[i] = tem;
						start[i] = j + 1;   //输出表示当前数组位置加一
						end[i] = j2 + 1;
					}
				}
			}

		}
		for (int i = 0; i < n; i++) {
			System.out.println("Case " + (i + 1) + ":");
			System.out.println(max[i] + " " + start[i] + " " + end[i]);
			System.out.println();
		}
	}

}
