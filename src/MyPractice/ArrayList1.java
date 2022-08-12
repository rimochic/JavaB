package MyPractice;
import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		
		// ArrayList = a resizable array
		//			   ELements can be added and removed after compilation phase
		//			   store reference data types
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("Pizza");
		food.add("Hamburger");
		food.add("Hotdog");
		food.add(1,"Couscous");
		
		// Replace value with another one
		food.set(0, "Sushi");
		// Remove value
//		food.remove(1);
		// Clear the ArrayList
//		food.clear();
	
		for (int x = 0; x < food.size(); x++) {
			System.out.println(food.get(x));
		}
		
	}

}
