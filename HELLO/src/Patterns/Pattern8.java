package Patterns;

import java.util.Scanner;

public class Pattern8 {

	public Pattern8() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*  ");
			}
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print("  ");
			}
			System.out.println();
		}
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= m - i + 1; j++) {
				System.out.print("*  ");
			}
			for (int j = 1; j <= m - i; j++) {
				System.out.print("  ");
			}
			System.out.println();
		}
	}

}
