package helloworld;

//import java.util.Scanner;

public class hello {
	

	int x = 432;
	int y = 8;
	
	// call by value
	public int add(int a, int b){
		int c= a+b;
		return c;
	} 

	public void swap(hello t){
		int temp = x;
		x = y;
		y = temp;
	}

	public static void main(String[] args) {
		
		hello obj = new hello();
		obj.add(3, 8); // call by value
		System.out.println(obj.add(3, 8)); // 11

		 obj.swap(obj);
		System.out.println(obj.x); // 8
		System.out.println(obj.y); // 12 
		
		
		//System.out.println("Hello World");
		
//		 double x, y, z;
//	        Scanner sc = new Scanner(System.in);
//	        System.out.println("Enter the variable \"X\" :");
//	        x = sc.nextDouble();
//	        System.out.println("Enter the variable \"Y\" :");
//	        y = sc.nextDouble();
//	        z = Math.sqrt((x*x) + (y*y));
//	        System.out.println("The hypotenuse is : " + z);
//	        sc.close();
//	        
//	        int a[]= {1,40,6,98};
//	        System.out.println(a[2]);
//		int v1 = 3;
//		int v2 = 3;
//		if (v1 == v2) {
//			System.out.println("Value 1 equal to Value 2");
//		}
//		else {
//		System.out.println("Value 1 is not equal to Value 2");
//		}
//	
	}
		
}
