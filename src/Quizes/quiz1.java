package Quizes;
import java.util.Scanner;

public class quiz1 {
	
	public static void main(String[] args) {
		
		double x;
		Scanner nb = new Scanner(System.in);
		System.out.println("Enter the number x :");
		x = nb.nextDouble();
		if (x>=0) {
			System.out.println("This number is positive");
		}
		else {
			System.out.println("This number is negative");
		}
		nb.close();
		
	}

}
