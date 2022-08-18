package Abstraction;

public class RepairShop {
	public static void repairCar(Car car) {
		System.out.println("Car is repaired");
	}

	public static void main(String[] args) {
		Brezza brezza = new Brezza();
		Swift swift = new Swift();
		repairCar(swift);
		repairCar(brezza);
	}
}
