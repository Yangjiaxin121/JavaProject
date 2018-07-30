package com.example.yangjiaxin;

import java.util.Scanner;

public class P1093 {
	public static void main(String[] args) {
		   Scanner s = new Scanner(System.in);
		   int N = s.nextInt();
	        while(N != 0){
	            int n = s.nextInt(), sum = 0;
	            for(int i = 1; i <= n; i ++){
	                int a = s.nextInt();
	                sum += a;
	            }
	            System.out.println(sum);
	            N--;
	        }
	}

}
