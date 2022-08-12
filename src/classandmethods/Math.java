package classandmethods;

public class Math {
	public static void main(String[] args) {
		
		doAdd();
		doMultiplication();
		doSubstraction();
//		System.out.println(doDivision(12,2));
		
		System.out.println(doDivision());

	}
	
	static int x = 12;
	static int y = 3;
	
	 static void doAdd() {
		int x = 10;
		int y = 23;
		System.out.println(x + y);
	}
	 
	  static void doMultiplication() {
		 int x = 4;
		 int y = 3;
		 System.out.println(x * y); 
	 }
	 static void doSubstraction() {
		  System.out.println(x - y);
	  }
	 public  static int doDivision() {
		   return x / y;
		   
	   }
	 
	 

}
