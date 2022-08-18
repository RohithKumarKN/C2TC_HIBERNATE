package Inheritance;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher tea = new Teacher();
		tea.name = "Mr.ABC";
		tea.eat();
		tea.Teacher();
		tea.sleep();
		tea.walk();
		Cricketer cri = new Cricketer();
		cri.name = "Mr.ABD";
		cri.Cricket();
		cri.eat();
		cri.sleep();
		cri.walk();
		@SuppressWarnings("unused")
		Person p = new Person();
	}

}
