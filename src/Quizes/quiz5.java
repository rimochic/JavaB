package Quizes;
import java.util.Scanner;

public class quiz5 {
	
	public static void main(String[] args) {
		
		int day;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index between 1 and 7 :");
		day = sc.nextInt();
		switch (day) {
		case 1 : System.out.println("Today is Monday"); break;
		case 2 : System.out.println("Today is Tuesday"); break;
		case 3 : System.out.println("Today is Wednesday"); break;
		case 4 : System.out.println("Today is Thursday"); break;
		case 5 : System.out.println("Today is Friday"); break;
		case 6 : System.out.println("Today is Saturday"); break;
		case 7 : System.out.println("Today is Sunday"); break;
		default : System.out.println("Incorrect index");
		}
		sc.close();
		
	}

}
