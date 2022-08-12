package MyPractice;
import java.util.Scanner;

public class IfStatments {

	public static void main(String[] args) {
		
		int year;
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("When were you born ?");
		year = sc.nextInt();
		age = 2022 - year;
		if(age <=18) {
			System.out.println("Your age is " + age + ". \"You are not eligible to vote\"");
		}
		else if (age >=18 && age <= 26) {
			System.out.println("Your age is " + age + ". You are eligile to vote and you will be selected for \"military service\"");
			}
		else if (age > 26 && age <=60){
			System.out.println("Your age is " + age + ". You are elgible to vote");
		}
		else {
			System.out.println("Your age is " + age + ". You are above the age of 60 years old, you are not eligible to vote");
		}
		
		
	}

}
