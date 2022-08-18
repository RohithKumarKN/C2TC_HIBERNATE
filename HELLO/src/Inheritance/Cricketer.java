package Inheritance;

public class Cricketer extends Person {
	protected void Cricket() {
		System.out.println(name + " is playing Cricket");
	}

	public void eat() {
		System.out.println("Cricketer " + name + " is eating ");
	}

}
