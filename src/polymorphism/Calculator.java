package polymorphism;

public class Calculator {

		
//		Two types of polymorphism :
//		Overload
//		Override
		
//		overload : when 2 methods have the same name but different of parameters or different data types
		public void add(int a, int b) {
			int total = a+b;
			
			System.out.println(total);
		}
		
		public void add(int a, int b, int c) {
			int total = a+b;
			System.out.println(total);
		}
		
		public void sub(int a, int b) {
			int total = a - b;
			System.out.println(total);
		}
		
		
	

}
