package com.example.yangjiaxin;

import java.util.Scanner;

public class P1249 {
	private static int[] ans = new int[10001];

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int n = scanner.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = scanner.nextInt();
			}
			init();
			for (int i = 0; i < a.length; i++) {
				System.out.println(ans[a[i]]);
			}
		}
		scanner.close();
	}

	private static void init() {
		// TODO Auto-generated method stub
		ans[0]=1;
	    ans[1]=2;
	    ans[2]=8;
	    for(int i=3;i<=10000;i++)
	    {
	        //(2*(n-1)-1)*3+3=6*(n-1)
	        ans[i]=ans[i-1]+6*(i-1);
	    }
	}

}
