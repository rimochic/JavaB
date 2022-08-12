package MyPractice;

import java.util.Scanner;

public class ghhhh {

	public static void main(String[] args) {
		
	String alpha;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the letter between A and Z :");
	alpha = sc.next().toLowerCase();
	if (alpha.length()>1 || !Character.isAlphabetic(alpha.charAt(0))) {
		System.out.println("Incorrect input ! Please enter the letter between A and Z :");
	}
	else if ((alpha.charAt(0)== 'a') || (alpha.charAt(0)=='e') || (alpha.charAt(0) == 'u') || 
			(alpha.charAt(0)== 'i') || (alpha.charAt(0)=='o')) {
			System.out.println("This is a vowel");
	}
	else {
		System.out.println("This is a consonant");
	}
	
		sc.close();
		
	}

}
