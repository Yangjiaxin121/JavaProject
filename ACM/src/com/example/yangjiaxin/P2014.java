package com.example.yangjiaxin;

import java.text.DecimalFormat;
import java.util.Scanner;


public class P2014 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			DecimalFormat control=new DecimalFormat("0.00");
			int n = scanner.nextInt();
			int sum = 0;
			int max;
			int min;
			int a[] = new int[n];
			for(int i=0;i<n;i++) {
				a[i] = scanner.nextInt();
				sum = sum + a[i];
			}
			max = a[0];
			for (int i = 0; i < a.length; i++) {
				if (max<a[i]) {
					max = a[i];
				}
			}
			min = a[0];
			for (int i = 0; i < a.length; i++) {
				if(min > a[i]) {
					min = a[i];
				}
			}
			sum = sum - max - min;
			double result = (double)sum / (n-2);
			System.out.println(control.format(result));
		}
		scanner.close();
	}

}
