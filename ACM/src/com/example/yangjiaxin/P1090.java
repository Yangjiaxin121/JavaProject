package com.example.yangjiaxin;

import java.util.Scanner;

//
//public class P1090 {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("please input the N:");
//		while(scanner.hasNextInt()) {
//			int N = scanner.nextInt();
//			int arr1[] = new int[N];
//			int arr2[] = new int[N];
//			int arr3[] = new int[N];
//			for(int i=0; i < N; i++) {
//				arr1[i] = scanner.nextInt();
//				arr2[i] = scanner.nextInt();
//				arr3[i] = arr1[i] + arr2[i];
//				System.out.println(arr3[i]);
//			}
//
//		}
//	}
//
//}

public class P1090 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n!= 0){
            n --;
            int a, b, sum;
            a = s.nextInt();
            b = s.nextInt();
            sum = a + b;
            System.out.println(sum);
        }
    }
}

