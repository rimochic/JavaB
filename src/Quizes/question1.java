package Quizes;
import java.util.ArrayList;
import java.util.List;


public class question1 {

	public static void main(String[] args) {
		
//		Create a new array list, add some colors (string) and print out the collection
		List<String> color = new ArrayList<String>();
		
		color.add("Black");
		color.add("White");
		color.add("Orange");
		color.add("Yellow");
		color.add("Red");
		color.add("Green");
		color.add("Bleu");
		color.add("Pink");

		System.out.println("collection of color : " + color);
	}

}
