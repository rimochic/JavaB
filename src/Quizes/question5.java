package Quizes;

import java.util.ArrayList;
import java.util.List;

public class question5 {

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
		
//		Update specific array element by given element
		color.set(0, "Gray");
		System.out.println(color);

	}

}
