package helloworld;

import java.util.Scanner;

public class Shuru {
	public static void main(String[] args) {
		Scanner sb = new Scanner(System.in);
		System.out.println("请输入name:");
		String name = sb.nextLine();
		System.out.println("请输入age:");
		int age = sb.nextInt();
		System.out.println("name:"+name+" age:"+age);
		sb.close();
	}
}
