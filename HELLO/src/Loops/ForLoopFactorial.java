package Loops;

import java.util.Scanner;

public class ForLoopFactorial {

	public ForLoopFactorial() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		double n = sc.nextDouble();
		double factorial = 1;
		for (double i = n; i >= 1; i--) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
	}

}