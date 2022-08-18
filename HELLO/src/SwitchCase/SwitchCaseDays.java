package SwitchCase;

import java.util.Scanner;

public class SwitchCaseDays {

	public SwitchCaseDays() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int days = sc.nextInt();
		switch (days) {
		case 1:
			System.out.println("I am in office");
			break;
		case 2:
			System.out.println("I am in WFH");
			break;
		case 3:
			System.out.println("I am in Mall");
			break;
		case 4:
			System.out.println("I am in Work");
			break;
		case 5:
			System.out.println("I am in Home");
			break;
		default:
			System.out.println("I am taking rest");
		}
	}

}
