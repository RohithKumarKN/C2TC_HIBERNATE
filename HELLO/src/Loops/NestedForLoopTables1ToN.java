package Loops;

import java.util.Scanner;

public class NestedForLoopTables1ToN {

	public NestedForLoopTables1ToN() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int j = 1; j <= n; j++) {
			for (int i = 1; i <= 10; i++) {
				System.out.print(j + "*" + i);
				System.out.println("=" + i * j);
			}
			System.out.println();
		}
	}

}
