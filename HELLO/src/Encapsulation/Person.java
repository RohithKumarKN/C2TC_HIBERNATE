package Encapsulation;

public class Person {
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 30) {
			System.out.println("You are not eligible for the policy");
			this.age=age;
		} else {
			System.out.println("You are eligible for the policy");
			this.age = age;
		}
	}
}
	
	//public String getName() {
		//return name;
	//}

	//public void setName(String name) {
	//	this.name = name;
	//}
//}
