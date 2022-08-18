package Strings;

import java.util.Scanner;

public class StringSubstringFunction {

	public StringSubstringFunction() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name");
		String name = sc.nextLine();
		System.out.println();
		System.out.println("Enter the value of N");
		int n = sc.nextInt();
		System.out.println(name.substring(n));
		System.out.println("Enter the value of M=");
		int m = sc.nextInt();
		System.out.println(name.substring(n, m));
		System.out.println(name.contains("sh"));
		System.out.println(name.indexOf('R'));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.trim());
	}
}
