package com.example.yangjiaxin;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P2003 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat control=new DecimalFormat("0.00");
		while(scanner.hasNext()) {
			double r = scanner.nextDouble();
			if (r >= 0) {
				System.out.println(control.format(r));
			} else {
				System.err.println(control.format(-r));
			}
		}
		scanner.close();
	}

}
