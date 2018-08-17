package com.example.yangjiaxin;

import java.util.Scanner;

public class P2016 {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int N = scanner.nextInt();
			int i = 0;
			int m = 0;
			int as[] = new int[N];;
			if (N==0) {
				System.exit(0);
			}
			for(i=0;i<N;i++) {
				as[i] = scanner.nextInt();
			}
			int min = as[0];
			for (int j = 0; j < as.length; j++) {
				if (min>as[j]) {
					min = as[j];
					m=j;
				}
			}
			int temp = as[0];
			as[0] = as[m];
			as[m] = temp;
			for (int j = 0; j < as.length; j++) {
		          if(j==0){
		                System.out.print(as[j]);
		            }
		             else{
		                System.out.print(" "+as[j]);
		             }
		       
			}
			System.out.println();
			
		}
		scanner.close();
	}

}
