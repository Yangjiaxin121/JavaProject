package com.example.yangjiaxin;

import java.util.Scanner;

public class P1001 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextInt()) {
			long n = scanner.nextInt();
			long sum = 0;
			while(n>0) {
				sum = sum + n;
				n--;
			}
				System.out.printf("%d%n%n",sum);
		}

	}

}


//
//import java.util.Scanner;
//
//public class P1001 
//{
//	
//    public static void main(String args[])
//    {
//        
//		Scanner cin=new Scanner(System.in);
//        while(cin.hasNextInt())
//        { 
//        		long s=cin.nextInt();
//        		/*int sn=0;
//        		for(int i=1;i<=s;i++){
//        			sn+=i;
//        			
//        		}   //这种也对。。    */
//        		long sn=s*(s+1)/2;
//        		/*System.out.printf("%d%n%n",(s*(s+1))/2);	//错误。溢出。。。。。  */ 
//        		System.out.printf("%d%n%n",sn);
//   
//        }
//    }
// 
//}

