package ConditionalStatements;

import java.util.Scanner;

public class ConditionalStatements {

	public ConditionalStatements() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (number <= 10) {
			System.out.println("Number is less than 20");
		} else if (number > 10 & number <= 20) {
			System.out.println("Number is greater than 10 and less than 20");
		} else {
			System.out.println("Number is greater than 20");
		}
	}

}
