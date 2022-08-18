class vehicle {
	int wheels;

	vehicle(int noOfWheels) {
		wheels = noOfWheels;
	}
}

public class Const {

	public Const() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehicle auto = new vehicle(3);
		vehicle car = new vehicle(4);
		System.out.println(car.wheels + " wheels");
		System.out.println(auto.wheels + " wheels");
	}

}
