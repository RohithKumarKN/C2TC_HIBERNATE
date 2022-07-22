package Methods;

public class PassByValue {

	public PassByValue() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 67;
		int d = 23;
		swap(c, d);
		System.out.println("C= " + c + " D= " + d);
	}

	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
}
//swap happen in a&b only, not in c&d it is called pass by value