package com.example.yangjiaxin;

import java.util.Scanner;

public class P2008{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextInt()){
        	int n = scanner.nextInt();
            if(n==0) System.exit(0);
        	double a;
        	int f=0,zero=0,z=0;
        	while(n > 0) {
        		a = scanner.nextDouble();
        		if (a>0) {
					z++;
				}else if (a==0) {
					zero++;
				}else {
					f++;
				}
        		n--;
        	}
        	System.out.println(f+" "+zero+" "+z);
        }
        scanner.close();
    }
}
