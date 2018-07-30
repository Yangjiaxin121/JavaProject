package com.example.yangjiaxin;

import java.util.Scanner;

public class P1000 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextInt()) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = a + b;
			System.out.println(c);
		}

	}

}
