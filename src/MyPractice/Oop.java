package MyPractice;

public class Oop {

	public static void main(String[] args) {
		
//		object = an instance of a class that may contain attributes and methods
//				attributes = all characteristics that object can has
//				methods = different actions can object can perform
//				example : (phone, desk, computer, coffee cup)

		Car myCar = new Car();
		System.out.println(myCar.make);
		System.out.println(myCar.model);
		
		myCar.drive();
		myCar.brake();
		
	}

}
