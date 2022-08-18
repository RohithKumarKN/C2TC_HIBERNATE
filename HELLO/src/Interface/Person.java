package Interface;

public class Person implements Student, YouTuber {

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj = new Person();
		/*Per.study();
		Per.makeVideo();*/
		YouTuber obj2=obj;
		
		obj2.editVideo();
		obj2.makeVideo();
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("Person is Studying");
	}

	@Override
	public void makeVideo() {
		// TODO Auto-generated method stub
		System.out.println("Person is making Videos");
	}

	@Override
	public void editVideo() {
		// TODO Auto-generated method stub
		System.out.println("Person is editing videos");
	}

}
