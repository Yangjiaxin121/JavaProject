package com.example.yangjiaxin;

import java.util.Scanner;

public class P1995 {
	 public static void main(String[] args) {
		long s[] = new long[61];
		s[0] = 0;
		s[1] = 1;
		int n ,t,i,m;
		
		for (i=2;i<61;i++) {
			s[i] = s[i-1]*2;
		}
		
		Scanner scanner = new Scanner(System.in);
		t =scanner.nextInt();
		
		for (int j=0;j<t;j++) {
			n = scanner.nextInt();
			m = scanner.nextInt();
			System.out.println(s[n-m+1]);
		}
	}
}
