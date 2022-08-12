package constructors;

public class Student {
	
	 String name;
	 int age;
	 String address;
	
	 Student(String name, int age, String address) {
		
		 this.name = name;
		 this.age = age;
		 this.address = address;
		
	}
	 void eat() {
		 System.out.println(this.name + " is eating");
	 }
	 void drink() {
		 System.out.println(this.name + " is drinking");
	 }

}
