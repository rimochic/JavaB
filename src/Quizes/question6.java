package Quizes;

import java.util.ArrayList;
import java.util.List;

public class question6 {

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
		
//		Remove the third element from a array list
		color.remove(2);
		System.out.println(color);
	}

}
