package Quizes;

import java.util.ArrayList;
import java.util.List;

public class question3 {

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
		
//		Insert an element into the array list at the first position
		color.add(0, "Gray");
		System.out.println(color);
		System.out.println("Index\tColors");
		for(int i = 0; i < color.size(); i++) {
			System.out.println(i + "\t"+ color.get(i));
		}

	}

}
