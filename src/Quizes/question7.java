package Quizes;

import java.util.ArrayList;
import java.util.List;

public class question7 {

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
		
//		Search an element in an array list (method 1)
		int i = color.indexOf("Bleu");
		if (i == -1 ) {
			System.out.println("Color not found!");
		}
		else {
			System.out.println("This Color exists in the list");
		}
		
//		Search an element in an array list (method 2)
		
		if(color.contains("Gray")) {
			System.out.println("This color exists in the list");
		}
		else {
			System.out.println("Color not found");
		}
	}

}
