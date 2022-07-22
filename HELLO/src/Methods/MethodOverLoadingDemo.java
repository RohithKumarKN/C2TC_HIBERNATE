package Methods;

import java.util.Scanner;

public class MethodOverLoadingDemo {
	static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	double add(double a, double b) {
		double sum = a + b;
		return sum;
	}

	double add(double a, double b, double c) {
		double sum = a + b + c;
		return sum;
	}

	double add(int a, double b, int c) {
		double sum = a + b + c;
		return sum;
	}

	public MethodOverLoadingDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double b = sc.nextDouble();
		int c = sc.nextInt();
		//
		double results = sum(a, b, c);
		System.out.println("Sum= " + results);
		MethodOverLoadingDemo obj = new MethodOverLoadingDemo();
		System.out.println(obj.add(10, 10));
		System.out.println(obj.add(a, b));
		System.out.println(obj.add(results, b));
	}

	private static double sum(int a, double b, int c) {
		// TODO Auto-generated method stub
		return a + b + c;
	}

}
