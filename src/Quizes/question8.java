package Quizes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class question8 {

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
		
		System.out.println("List before sorting : " + color);
		
//		Sort a given array list
		Collections.sort(color);
		System.out.println("List after sorting : " + color);
//		Or
		color.sort(null);
		System.out.println("List after sorting : " + color);

	}

}
