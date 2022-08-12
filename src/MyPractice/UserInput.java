package MyPractice;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What's your name ?");
		String name = sc.nextLine();
		System.out.println("How old are you ?");
		int age = sc.nextInt();
		sc.nextLine(); // this is to input string after integer
		System.out.println("What is you favorite food ?");
		String food = sc.nextLine();
		System.out.println("Hello " + name + ", " + " you are " + age + " years old and you like " + food);
		
	}

}
