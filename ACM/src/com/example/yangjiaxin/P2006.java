package com.example.yangjiaxin;

import java.util.Scanner;

public class P2006 {
	 public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        while(s.hasNext()) {
	        	int n = s.nextInt();
		        int sum = 1;
		        while(n!= 0){
		            n --;
		            int a, b;
		            a = s.nextInt();
		            if(a%2==1) {
		            	 sum = sum*a;
		            }       
		        }
		        System.out.println(sum);
	        }
	        s.close();
	    }

}
