package MyPractice;

public class Methods {

	public static void main(String[] args) {
//		Method = a block of code that is executed whenever it is called upon
		String name = "Mostafa";
		int age = 21;
		hello(name, age);
		System.out.println(add(3,6));
	
		
	}

	static void hello(String name, int age) {
		System.out.println("Hello, " + name + " ,you are " + age);
	}
	
	static int add(int x, int y) {
		int z = x+y;
		return z;
	}
	

	
	
	
}
