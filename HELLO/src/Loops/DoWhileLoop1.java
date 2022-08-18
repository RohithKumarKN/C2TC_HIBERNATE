package Loops;

import java.util.Scanner;

public class DoWhileLoop1 {

	public DoWhileLoop1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = 1;
		do {
			n = sc.nextInt();
			System.out.println(n);

		} while (n != 0);

	}
}
