package com.example.yangjiaxin;

import java.util.Scanner;

public class P2013 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int n = scanner.nextInt();
			int sum = 1;
			for(int i = 1; i<n; i++) {
				sum = (sum + 1)*2;
			}
			System.out.println(sum);
		}
		scanner.close();
	}


}
