package Quizes;

import java.util.ArrayList;
import java.util.List;

public class question2 {
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
		
//		Iterate through all elements in a array list
		System.out.println("Collecion of color :");
		System.out.println("-------------------");
		for(int i = 0; i < color.size(); i++) {
			System.out.println("   " + color.get(i));
		}
	
}

}
