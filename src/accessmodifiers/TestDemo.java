package accessmodifiers;
import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		
		
		TestDemo obj = new TestDemo();
		System.out.println(obj.doAddition());
		obj.test();
		System.out.println(obj.doDivision(10, 5));
		System.out.println(obj.doMultiplication());
		
//		TestNoModifiers test = new TestNoModifiers();
//		TestNoModifiers test1 = new TestNoModifiers();
//		
//		test.displayscar();
//		test.displayanimal();
//		test.displaysmobile();
				
		
//	-----------------------------------------------------------
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number : ");
//		int x = sc.nextInt();
//		System.out.println("The Multiplication of " + x + " is :");
//		for (int y = 1; y <= 10; y++) {
//			System.out.println("\t"+x +" x " + y + " = " + (x * y));
//		}
//		
		
		
		int sec=259800;
		int min1 = sec/60;
		int sec1=sec%60;
		int min = min1%60;
		int hr = sec/3600;
		int hr1 = hr%24;
		int day = hr/24;
			
		System.out.println("convert seconds to hours "+day+":"+hr1+":"+min+":"+sec1);
	
	}
	 int c =19;
	int x =0;
	void test() {
		System.out.println("Test method");
	}
	
	int doAddition() {
		System.out.println("This the addition :");
		int x =9;
		int y = 6;
		return x+y+c;
	}
	
	int doDivision(int a, int b) {
		System.out.println("This is the division :");
		return a- b;
	}
	
	int doMultiplication(){
		System.out.println("This is the multiplication :");
		return x * c;
	}

}