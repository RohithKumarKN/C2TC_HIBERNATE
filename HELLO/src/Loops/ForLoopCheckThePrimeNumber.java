package Loops;

import java.util.Scanner;

public class ForLoopCheckThePrimeNumber {

	public ForLoopCheckThePrimeNumber() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value N");
		int n = sc.nextInt();
		boolean isprime = true;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				isprime = false;
				break;
			}
		}
		if (n < 2)
			isprime = false;
		System.out.println("isprime" + isprime);
	}
}
