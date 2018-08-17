package com.example.yangjiaxin;

import java.util.Scanner;





public class P2012 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int m = scanner.nextInt();
			int n = scanner.nextInt();
			int temp;
			boolean flag = true;
			if(m == 0 && n == 0) {
				System.exit(0);
			} else {
				if(m > n) {
					temp = m;
					m = n;
					n = temp;
				}
				for(int i=m; i<n; i++) {
					int r = i*i+ i + 41;
					for(int j=2;j<r;j++) {
						if (r%j == 0) {
							flag = false;
						}
					}
				}
				if (flag == true) {
					System.out.println("OK");
				}else {
					System.out.println("Sorry");
				}
				flag = true;
			}
		}
		scanner.close();
	}

}
