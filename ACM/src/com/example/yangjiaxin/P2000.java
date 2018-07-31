package com.example.yangjiaxin;

import java.util.Arrays;
import java.util.Scanner;

public class P2000 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			String string = scanner.nextLine();
			char[] ch = string.toCharArray();
			Arrays.sort(ch);
			System.out.println(ch[0]+" "+ch[1]+" "+ch[2]);
		}
	}
}
