import java.util.Scanner;

public class TentBills {

	public TentBills() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total water bill");
		double waterbill = sc.nextDouble();
		double waterbill1 = (waterbill / 6);
		double waterbilltent = waterbill1 * 4;
		System.out.println("Enter the Eletricity bill of Tent");
		int currenttent = sc.nextInt();
		double waterbillowner = waterbill1 * 2;
		System.out.println("Enter the Eletricity bill of owner");
		int currentowner = sc.nextInt();
		double owner = waterbillowner + currentowner;
		double tent = waterbilltent + currenttent;
		double total = waterbill + currenttent + currentowner;
		System.out.println("Total amount of Owner= " + owner);
		System.out.println("Total amount of Tent= " + tent);
		System.out.println("Total amount " + total);
	}

}
