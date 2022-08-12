package MyPractice;

import java.text.DecimalFormat;

public class WrapperClasses {

	public static void main(String[] args) {
	//	Wrapper Classes = provides a way to use a primitive data types as reference data types
	//					  reference data types contain useful methods	
	//					  can be used with collections (ex: ArrayList)
		
		
	//    Primitive		Wrapper
	//    ---------     -------
	//	   boolean		Boolean
	//	   char			Character
	//	   int			Integer
	//	   double		Double
		
	//	Autoboxing = the automatic conversion that Java compiler makes between the primitive types to the corresponding object wrapper class
	// 	Unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
		
//		Boolean a = true;		// -|
//		Character b = '@';		// -|
//		Integer c = 123;		// -|- Autoboxing	
//		Double d = 1.345;		// -|
//		String e = "Mostafa";	// -|
//		
//		if(a == true) {							// -|
//			System.out.println("This is true"); // -|- Unboxing
//		}										// -|
		
		
		double p = 600000;
		double d = 80000;
		double i = 5.71/100;
		double n = 30;
		double mInt = i/12;
		double m = n * 12;
			double mortgage = ((p-d) * (mInt*(Math.pow((1 + mInt),m))) / ((Math.pow((1 + mInt),m )- 1))); 
			
			DecimalFormat df = new DecimalFormat("#.##");
		    System.out.println("Original input value: " + mortgage);
		    System.out.println("Using DecimalForamt: " + df.format(mortgage));
			System.out.println("The monthly mortgage is : " + mortgage);
		
	}

}