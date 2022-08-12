package collections;
import java.util.HashSet;

public class HashSetToArrayList {

	public static void main(String[] args) {
		
		// Create a HashSet
		HashSet<String> hashdemo = new HashSet<String>();
		hashdemo.add("Red");
		hashdemo.add("Green");
		hashdemo.add("Browm");
		hashdemo.add("Black");
		hashdemo.add("White");
		hashdemo.add("Yellow");
		hashdemo.add("Pink");
		System.out.println("Originel \"Hash Set\" is :" + hashdemo);
		// Create an Array from the HashSet
		String [] new_array = new String[hashdemo.size()];
		hashdemo.toArray(new_array);
		// Displaying array elements
		System.out.println("Array elements :");
		for (String element: new_array) {
			System.out.println(element);
		}

	}

}
