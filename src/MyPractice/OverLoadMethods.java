package MyPractice;

public class OverLoadMethods {

	public static void main(String[] args) {
		
//		Overload methods = methods that share the same name but have different parameters
//							method name + parameters = method signature
		
		System.out.println(add(4,9));
		System.out.println(add(4,9,8));
		System.out.println(add(4,9,8,2));
		
		System.out.println(add(1.3,6.7,5.8));
	
	}
	
	
	static int add(int a, int b) {
		System.out.println("This is an overloaded method number 1");
		return a + b;
	}
	
	static int add(int a, int b, int c) {
		System.out.println("This is an overloaded method number 2");
		return a + b + c;
	}
	
	static int add(int a, int b, int c, int d) {
		System.out.println("This is an overloaded method number 3");
		return a + b + c + d;
	}

	
	
	static double add(double a, double b) {
		System.out.println("This is an overloaded method number 4");
		return a + b;
	}
	
	static double add(double a, double b, double c) {
		System.out.println("This is an overloaded method number 5");
		return a + b + c;
	}
	
	static double add(double a, double b, double c, double d) {
		System.out.println("This is an overloaded method number 6");
		return a + b + c + d;
	}

}
