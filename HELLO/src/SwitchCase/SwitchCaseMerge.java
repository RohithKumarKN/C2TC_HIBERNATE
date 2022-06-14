package SwitchCase;

import java.util.Scanner;

public class SwitchCaseMerge {

	public SwitchCaseMerge() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.nextLine().charAt(0);
		char days = sc.nextLine().charAt(0);
		switch (days) {
		case 'M':
		case 'T':
			System.out.println("I am in office");
			break;
		case 'W':
			System.out.println("I am in meeting");
			break;
		default:
			System.out.println("I am in Home");
		}
	}

}
