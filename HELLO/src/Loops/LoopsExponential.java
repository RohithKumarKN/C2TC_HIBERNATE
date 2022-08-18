package Loops;

import java.util.Scanner;

public class LoopsExponential {

	public LoopsExponential() {
		// TODO Auto-generated constructor stub
	}
//int results=(Math.pow(a,b));
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int results = 1;
		for (int i = 0; i < b; i++) {
			results *= a;
		}
		System.out.println(results);
	}

}
