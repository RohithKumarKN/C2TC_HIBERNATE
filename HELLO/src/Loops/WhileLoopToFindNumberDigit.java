package Loops;

import java.util.Scanner;

public class WhileLoopToFindNumberDigit {

	public WhileLoopToFindNumberDigit() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N=");
		int n = sc.nextInt();
		int a = (int) Math.log10(n) + 1;
		System.out.println("The number of digits=" + a);
	}

}
