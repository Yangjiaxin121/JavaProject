package com.example.yangjiaxin;

import java.util.Scanner;

public class P2072 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = 0;
		while (scanner.hasNext()) {
			String string = scanner.nextLine();
			if (string.equals("#")) {
				System.exit(0);
			}
			string.replaceAll(",","");
			String a[] = string.split(" ");
			// for (int i = 0; i < a.length; i++) {
			// for (int j = i; j <= a.length - i; j++) {
			// if (a[i] != a[j]) {
			// System.out.println(a[j]);
			// m++;
			// }
			// }
			// //System.out.println(a[i]);
			// }
			int sum = a.length;
			for (int i = 0; i < a.length; i++) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i].equals(a[j])) {
						m++;
						break;
					}
				}
			}
			System.out.println(sum - m);
			m = 0;
		}
		scanner.close();
	}

}
