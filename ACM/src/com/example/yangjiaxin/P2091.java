package com.example.yangjiaxin;

import java.util.Scanner;

public class P2091 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			String s = scanner.next();
			if (s.equals("@")) {
				System.exit(0);
			}
			int n  = scanner.nextInt();
			for (int i = 0; i < n; i++) {
				if (i==n-1) {
					for (int j = 0; j < n*2-1; j++) {
						System.out.print(s);
					}
					System.out.println();
					System.out.println();
					break;
				}
				for (int j = 0; j < n-i-1; j++) {
					System.out.print(" ");		
				}
				System.out.print(s);
				if (i==0) {
					System.out.println();
					continue;
				}
				for (int j = 0; j < i*2-1; j++) {
					System.out.print(" ");
				}
				System.out.println(s);
				
			}
		}
		scanner.close();
	}

}
