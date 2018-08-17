package com.example.yangjiaxin;

import java.util.Scanner;
//AH,AM,AS,BH,BM,BS
public class P2033 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int n = scanner.nextInt();
			int AH[] = new int[n];
			int AM[] = new int[n];
			int AS[] = new int[n];
			int BH[] = new int[n];
			int BM[] = new int[n];
			int BS[] = new int[n];
			int CH[] = new int[n];
			int CM[] = new int[n];
			int CS[] = new int[n];
			for (int i = 0; i < n; i++) {
				AH[i] = scanner.nextInt();
				AM[i] = scanner.nextInt();
				AS[i] = scanner.nextInt();
				BH[i] = scanner.nextInt();
				BM[i] = scanner.nextInt();
				BS[i] = scanner.nextInt();
				
				CS[i] = (AS[i] + BS[i])%60;
				int s1 = (AS[i] + BS[i])/60;
				CM[i] = (AM[i] + BM[i] + s1)%60;
				int m1 = (AM[i] + BM[i] + s1)/60;
				CH[i] = (AH[i] + BH[i] + m1);
			}
			for (int i = 0; i < n; i++) {
				System.out.println(CH[i]+" "+CM[i]+" "+CS[i]);
			}
		}
		scanner.close();
	}

}
