package Methods;

import java.util.Scanner;

public class IntroductionMethods {

	public IntroductionMethods() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new java.util.Scanner(System.in);
		int numberOne = sc.nextInt();
		int numberTwo = sc.nextInt();
		int results = maxOf(numberOne, numberTwo);
		System.out.println("The maximum of two number is " + results);
		sayHello();
	}

	static int maxOf(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	// return a>b ? a:b;
	static void sayHello() {
		System.out.println("Hello");
		System.out.println("Good Morning");
	}
}
