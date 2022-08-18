package Inheritance;

public class Person {
	protected String name;

	protected void walk() {
		System.out.println("Person "+name + " is walking");
	}

	public void eat() {
		System.out.println("Person "+name + " is eating");
	}

	public void sleep() {
		System.out.println("Person "+name + " is sleeping");
	}
}
