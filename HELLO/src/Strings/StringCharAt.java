package Strings;

import java.util.Scanner;

public class StringCharAt {

	public StringCharAt() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name");
		String name = sc.nextLine();
		System.out.println("Enter the value of N=");
		int n = sc.nextInt();
		System.out.println(name.charAt(n));
	}

}
