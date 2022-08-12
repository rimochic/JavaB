package MyPractice;

import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
		
		// Array = used to store multiples values in a single variable
		
//		String cars[] = {"Toyota","Tesla","Ford"};
//		for(int x = 0; x< cars.length; x++) {
//			System.out.println(cars[x]);
//		}
	
//		String cars[] = new String[3];
//		cars[0] = "Toyota";
//		cars[1] = "Honda";
//		cars[2] = "Nissan";
//		for (int x = 0; x < cars.length; x++) {
//			System.out.println(cars[x]);
//		}
//	
		Scanner input = new Scanner(System.in);
		int num[] = new int[3];
		for (int x = 0; x < num.length; x++) {
		System.out.println("Enter the number " + (x+1) + " :");
		num[x] = input.nextInt();
		}
		System.out.println("The greatest number is " + Math.max(Math.max(num[0], num[1]),(num[2])));
		
	}

}
