package Constructors;

class automobiles {
	int wheels;
	int Headlight = 2;

	automobiles(int wheels) {
		this.wheels = wheels;
	}
}

public class ThisConstructors {

	public ThisConstructors() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		automobiles auto = new automobiles(3);
		automobiles car = new automobiles(4);
		System.out.println(auto.wheels + " Wheels");
		System.out.println(car.wheels + " Wheels");
		System.out.println(auto.Headlight + " HeadLight");
		System.out.println(car.Headlight + " Headlight");
	}
}
