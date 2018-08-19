package com.example.yangjiaxin;

import java.util.Scanner;

public class P1108 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
		int b;
		int c = 1;
		while(scanner.hasNext()) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			while(!(c%a==0 && c%b==0)) {
				c++;
			}
			System.out.println(c);
			c = 1;
		}
		scanner.close();
	}

}
