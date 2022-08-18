package Constructors;

class Transportation {
	int wheels;
	int Headlight;
	String colour;

	Transportation() {
	}

	Transportation(int wheels) {
		this.wheels = wheels;
		Headlight = 2;
		this.colour = colour;
	}

	Transportation(int wheels, String colour) {
		this.wheels = wheels;
		this.colour = colour;
		Headlight = 2;
	}
}

public class ConstructorOverloading {

	public ConstructorOverloading() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transportation car = new Transportation(4, " Red");
		Transportation xyz = new Transportation();
		Transportation auto = new Transportation(3);
		System.out.println(car.colour + " Colour " + car.wheels + " wheels " + car.Headlight + " Headlight");
		System.out.println(xyz.colour + " " + xyz.Headlight + " " + xyz.wheels);
		System.out.println(auto.colour + " Colour" + auto.Headlight + " Headlight" + auto.wheels + " wheels");
	}

}
