package Loops;

import java.util.Scanner;

public class ForLoopTables {

	public ForLoopTables() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number, which table requried");
		int n = sc.nextInt();
		for (int i = 01; i <= 10; i++) {
			int table = n * i;

			System.out.print(n + "*" + i);
			System.out.println("=" + table);

		}
System.out.println();
	}
}
