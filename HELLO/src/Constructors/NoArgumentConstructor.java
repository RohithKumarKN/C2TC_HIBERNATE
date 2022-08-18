package Constructors;

class vehicle {
	int wheels;

	vehicle() {
		wheels=3;
	}
}

public class NoArgumentConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehicle auto = new vehicle();
		vehicle auto1=new vehicle();
		System.out.println(auto.wheels + " wheels");
	System.out.println(auto1.wheels+" wheels");
	}

}
