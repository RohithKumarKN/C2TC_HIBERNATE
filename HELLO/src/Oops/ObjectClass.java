package Oops;

class dog1 {
	boolean hasFur;
	String bread, colour;
	int legs, eyes;

	public void eat() {
		System.out.println("Dog is eating");
	}

	public void bark() {
		System.out.println("Dog is barking");
	}

	public void description() {
		System.out.println("Dog has " + legs + " Legs and " + eyes + " Eyes");
	}

	public void behaviour() {
		System.out.println("Dog is voilent");
	}
}

public class ObjectClass {
	public ObjectClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog1 dog11 = new dog1();
		dog1 dog2 = new dog1();
		dog11.legs = 4;
		dog11.eyes = 2;
		dog11.eat();
		dog2.bark();
		dog11.description();
		dog2.behaviour();
	}
}
