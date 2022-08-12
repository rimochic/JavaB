package MyPractice;
import java.util.ArrayList;

public class ForEachLoop {

	public static void main(String[] args) {
		
//		For-each = traversing technique to iterate through the elements in an array/collection
//					less steps, more readable
//					less flexible

//		String animals[] = {"dog", "cat", "rat", "bird"};
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Mouse");
		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Monkey");
		
		// For Loop
//		for(int x = 0; x< animals.length; x++) {
//		System.out.println(animals[x]);
//		}
		 // For Each loop
		for(String i : animals) {
			System.out.println(i);
		}
		
//		for(int x = 0; x<animals.size(); x++) {
//			System.out.println(animals.get(x));
//		}
		
		
	}
		

}
