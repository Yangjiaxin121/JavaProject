package com.example.yangjiaxin;


import java.util.Scanner;
 
public class P1720{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNext()) {
			String str1 = scanner.next();
			String str2 = scanner.next();
			int a = Integer.parseInt(str1, 16);
			int b = Integer.parseInt(str2,16);
			System.out.println(a+b);
		}
	}
}
