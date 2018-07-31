package com.example.yangjiaxin;

import java.util.Scanner;

public class P2009 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNextInt()) {

			int firstNum = in.nextInt();

			int lastNum = in.nextInt();

			double sum = firstNum;

			double tmp = firstNum;

			for (int i = 0; i < lastNum - 1; i++) {

				tmp = Math.sqrt(tmp);

				sum += tmp;
			}
			System.out.printf("%.2f", sum);
			System.out.println();
		}
	}
}
