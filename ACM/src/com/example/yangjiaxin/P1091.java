package com.example.yangjiaxin;

import java.util.Scanner;

public class P1091 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    int a; 
        a = scanner.nextInt();
        int b;
        b = scanner.nextInt();
        while(a != 0 || b != 0) {
            int sum = a + b;
            System.out.println(sum);
            a = scanner.nextInt();
            b = scanner.nextInt();
        }

	}

}