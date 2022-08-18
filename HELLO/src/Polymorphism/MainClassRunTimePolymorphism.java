package Polymorphism;

public class MainClassRunTimePolymorphism {

	public MainClassRunTimePolymorphism() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		Pet p = d;
		Animal a = d;
		d.walk();
		p.walk();
		System.out.println(d.name);
		System.out.println(p.name);

	}

}
