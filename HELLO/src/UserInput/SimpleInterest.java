package UserInput;

import java.util.Scanner;

public class SimpleInterest {

	public SimpleInterest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Principal=");
		int Principal = sc.nextInt();
		System.out.println("Interest=");
		float Interest = sc.nextFloat();
		System.out.println("Time=");
		int Time = sc.nextInt();
		float SimpleIntrest = Principal * Interest * Time / 100;
		System.out.println("SimpleInterest=" + SimpleIntrest);
	}

}
