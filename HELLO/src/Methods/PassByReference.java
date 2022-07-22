package Methods;
class Dog {
	int eyes;
}
public class PassByReference {

	public PassByReference() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog a=new Dog();
a.eyes=4;
changeDog(a);
System.out.println(a.eyes);
	}
static void changeDog(Dog dog) {
	dog.eyes=2;
}
}
