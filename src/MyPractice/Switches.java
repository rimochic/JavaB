package MyPractice;
import java.util.Scanner;

public class Switches {
	public static void main(String[] args) {
		// Switch : statement that allows a variable to be tested for equality against a list of values.
		
		int day;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day index :");
		day = sc.nextInt();
		switch(day) {
		case 1:	System.out.println("Today is Monday");
		break;
		case 2: System.out.println("Today is Tuesday");
		break;
		case 3: System.out.println("Today is Wednesday");
		break;
		case 4: System.out.println("Today is Thursday");
		break;
		case 5: System.out.println("Today is Friday");
		break;
		case 6 :System.out.println("This is Saturday");
		break;
		case 7: System.out.println("Today is Sunday");
		break;
		default : System.out.println("Incorrect index");
		
	}

}
}
