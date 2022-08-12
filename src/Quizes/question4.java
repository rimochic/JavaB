package Quizes;

import java.util.ArrayList;
import java.util.List;

public class question4 {

	public static void main(String[] args) {
		List<String> color = new ArrayList<String>();
		
		color.add("Black");
		color.add("White");
		color.add("Orange");
		color.add("Yellow");
		color.add("Red");
		color.add("Green");
		color.add("Bleu");
		color.add("Pink");
		
//		Retrieve an element (at a specified index) from a given array list
		int p = 0;
		System.out.println("The color of " + p +" position is : " + color.get(p));

	}

}
