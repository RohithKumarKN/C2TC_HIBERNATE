package Loops;

import java.util.Scanner;

public class ForLoopToSumOfSeries {

	public ForLoopToSumOfSeries() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N=");
		double n = sc.nextDouble();
		double result = 0;
		for (double i = 01; i <= n; i++) {
			result += 1 / i;
		}
		System.out.println("Result=" + result);
	}

}
