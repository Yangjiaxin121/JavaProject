package com.example.yangjiaxin;

import java.util.Scanner;

public class P2001 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			double x1 = scanner.nextDouble();
			double y1 = scanner.nextDouble();
			double x2 = scanner.nextDouble();
			double y2 = scanner.nextDouble();
			double result;
			result = Math.sqrt((y1-y2)*(y1-y2)+(x1-x2)*(x1-x2));
			System.out.printf("%.2f\r\n",result);		
		}
		scanner.close();
	}
}


