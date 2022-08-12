package helloworld;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListpractice {

	public static void main(String[] args) {
		
		ArrayList<Integer> nb = new ArrayList<Integer>();
		for (int x = 0; x< 10; x++) 
			nb.add((int)(Math.random()*100));
		System.out.println("List of Numbers : ");
		System.out.println(nb);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to search :");
		int num = sc.nextInt();
		if(nb.contains(num)) {
			System.out.println("It's found");
		}
		else {
			System.out.println("it's not found");
		}

	}

}
