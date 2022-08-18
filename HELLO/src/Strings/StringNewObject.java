package Strings;

public class StringNewObject {

	public StringNewObject() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Rohith";
		String Name = new String("Rohith");
		String name1 = "rohith";
		String Name1 = "rohith";
		System.out.println(name == Name);
		System.out.println(Name1 == name1);
		System.out.println(Name.equals(name));
		System.out.println(name.isEmpty());
	}

}
