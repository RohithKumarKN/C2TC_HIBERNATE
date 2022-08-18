package Strings;

import java.util.Scanner;

public class StringsConcat {

	public StringsConcat() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name");
		String name = sc.nextLine();
		//type1
		name=name+" Kumar";
		System.out.println(name);
		//type2
		System.out.println(name.concat(" K N"));
		System.out.println(name.replace('.', ' '));
	}

}
