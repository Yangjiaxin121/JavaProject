package com.example.yangjiaxin;

import java.util.Scanner;

public class P2136 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int s;
		while(scanner.hasNext()) {
			s = scanner.nextInt();
			for (int i = s-1; i >= 0; i--) {
				if (isPrim(i)==1) {
					System.out.println(i);
					break;
				}
			}
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
