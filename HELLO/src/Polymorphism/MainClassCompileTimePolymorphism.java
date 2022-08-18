package Polymorphism;

public class MainClassCompileTimePolymorphism {

	public MainClassCompileTimePolymorphism() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		wishes(" w ");
		wishes();
	}

	public static void wishes() {
		System.out.println("Hi");
	}

	public static void wishes(String s) {
		System.out.println("Hello");
	}
}
