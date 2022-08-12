package polymorphism;

public class ModernCalculator extends Calculator {
	
//	Override : is when 2 methods have the same name, same number of parameters and different body between parent and child class.
	public void add(int a,  int b) {
		int total = a + b;
		System.out.println("The total is : " + total);
	}
	public void division(int x, int y) {
		int z = x / y;
		System.out.println(z);
	}
	
	

}
