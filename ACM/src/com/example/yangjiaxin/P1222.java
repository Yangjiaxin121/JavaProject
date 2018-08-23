package com.example.yangjiaxin;

import java.util.Scanner;

public class P1222 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int x = scanner.nextInt();
			int m[] = new int[x];
			int n[] = new int[x];
			for (int i = 0; i < x; i++) {
				m[i] = scanner.nextInt();
				n[i] = scanner.nextInt();
			}
			for (int i = 0; i < x; i++) {
				int z = 1;
				int flag[] = new int[n[i]];
				for (int j = 0; j < flag.length; j++) {
					flag[j] = 0;
				}
				for (int j = 0; j < flag.length; ) {
					
					flag[j] = 1;
					j=j+m[i];
					if (j>=flag.length) {
						j = j - flag.length;
					}
					
					if (j == 0 && z >1) {
						break;
					}
					z++;
				}
				int a =0;
				for (int j = 0; j < flag.length; j++) {
					if (flag[j] == 1) {
						a++;
					}
				}
				if (a != flag.length) {
					System.out.println("Yes");
				}else {
					System.out.println("No");
				}
//				System.out.println(z);
//				for (int j = 0; j < flag.length; j++) {
//					System.out.print(flag[j]+" ");
//				}
			}
		}
		scanner.close();
	}

}
