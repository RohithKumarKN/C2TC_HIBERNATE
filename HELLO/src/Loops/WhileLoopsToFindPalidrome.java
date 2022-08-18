package Loops;

import java.util.Scanner;

public class WhileLoopsToFindPalidrome {

	public WhileLoopsToFindPalidrome() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int reverse = 0;
		while (temp > 0) {
			int lastdigit = temp % 10;
			reverse = reverse * 10 + lastdigit;
			temp /= 10;
			System.out.println(temp + "  " + lastdigit + "  " + reverse);
		}
		if (reverse == n) {
			System.out.println("The given number is palidrome");
			System.out.println(n + "  " + reverse);
		} else {
			System.out.println(n + "  " + reverse);
			System.out.println("The given number is not palidrome");
		}
	}

}
