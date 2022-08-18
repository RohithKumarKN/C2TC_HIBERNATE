package AssignmentOperator;

import java.util.Scanner;

public class AssignmentOperatorSubtraction {

	public AssignmentOperatorSubtraction() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("A=");
		int a = sc.nextInt();
		System.out.println("N=");
		int n = sc.nextInt();
		a -= n;
		a = --a;
		System.out.println("A=" + a);
	}

}
