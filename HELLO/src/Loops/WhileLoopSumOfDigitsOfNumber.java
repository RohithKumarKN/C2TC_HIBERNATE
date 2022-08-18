package Loops;

import java.util.Scanner;

public class WhileLoopSumOfDigitsOfNumber {

	public WhileLoopSumOfDigitsOfNumber() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		while (temp > 0) {
			int lastdigit = temp % 10;
			temp = temp / 10;
			sum = sum + lastdigit;
			System.out.println(lastdigit + "  " + temp + "  " + sum);
		}
		System.out.println("Sum of digit of " + n + " is " + sum);
	}

}