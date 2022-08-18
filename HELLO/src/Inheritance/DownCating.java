package Inheritance;

public class DownCating {

	public DownCating() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t1 = new Teacher();
		Cricketer c1 = new Cricketer();
		Person p = t1;
		Teacher t = (Teacher) p;
		boolean y = t1 instanceof Teacher;
		System.out.println(t1 instanceof Teacher);
		System.out.println(t1 instanceof Person);
		System.out.println(t instanceof Person);
		System.out.println(c1 instanceof Cricketer);
		System.out.println(p instanceof Cricketer);
		System.out.println(p instanceof Teacher);
	}

}

