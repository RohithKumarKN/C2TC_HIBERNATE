package Constructors;

class automobile {
	int wheels;
	int HeadLights;

	automobile(int noOfWheels) {
		wheels = noOfWheels;
		HeadLights = 2;
	}
}

public class ParameterizedConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		automobile auto = new automobile(3);
		automobile car = new automobile(4);
		System.out.println(car.wheels + " wheels");
		System.out.println(auto.wheels + " wheels");
		System.out.println(car.HeadLights + " Headlights");
		System.out.println(auto.HeadLights + " Headlights");
	}
}
