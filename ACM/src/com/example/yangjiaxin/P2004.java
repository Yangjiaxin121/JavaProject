package com.example.yangjiaxin;

import java.util.Scanner;

public class P2004 {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		int temp;
		while (cin.hasNext()) {
			temp = cin.nextInt();
			if (temp >= 0 && temp < 60)
				System.out.println("E");
			else if (temp >= 60 && temp < 70)
				System.out.println("D");
			else if (temp >= 70 && temp < 80)
				System.out.println("C");
			else if (temp >= 80 && temp < 90)
				System.out.println("B");
			else if (temp >= 90 && temp <= 100)
				System.out.println("A");
			else
				System.out.println("Score is error!");
		}
		cin.close();
	}
}
