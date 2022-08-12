package Quizes;
import java.util.Scanner;

public class quiz6 {
	
	public static void main(String[] args) {
		
		String alpha;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a letter :");
		alpha = sc.nextLine().toLowerCase();
		if((alpha.length()>1) || (!Character.isAlphabetic(alpha.charAt(0)))){
			System.out.println("Incorrect input! Please enter a letter :");
		}
		else if ((alpha.charAt(0) == 'a') || (alpha.charAt(0)== 'o')|| (alpha.charAt(0)=='i') || 
				(alpha.charAt(0) == 'u')|| (alpha.charAt(0) == 'e')){
			System.out.println("This letter " + alpha + " is Vowel");
		}
		else {
			System.out.println("This letter " + alpha + " is consonant");
		}
		
		
		 
	}

}