package com.example.yangjiaxin;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P2002 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final double PI=3.1415927;
		while(scanner.hasNext()) {
			double r = scanner.nextDouble();
			double result;
			DecimalFormat control=new DecimalFormat("0.000");
			System.out.println(control.format(4*PI*r*r*r/3));		
		}
		scanner.close();
	}

}
