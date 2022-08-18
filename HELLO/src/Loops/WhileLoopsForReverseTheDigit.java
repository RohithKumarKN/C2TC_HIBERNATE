package Loops;

import java.util.Scanner;

public class WhileLoopsForReverseTheDigit {

	public WhileLoopsForReverseTheDigit() {
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
			System.out.println(lastdigit + "  " + reverse + "  " + temp);
		}
		System.out.println("The reverse digit of  " + n + "  is  " + reverse);
	}

}
