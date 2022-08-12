package collections;
import java.util.HashMap;

public class HashMapDemo {

	
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		// Putting the values and keys
		map.put("a", 10);
		map.put("b", 20);
		map.put("c", 30);
		map.put("d", 40);

		System.out.println("Size of the map is : " + map.size());
		System.out.println(map);
		System.out.println(map.get("c"));
	
		// Getting Value based on key
		if(map.containsKey("b")) {
			System.out.println("Value for the \"b\" is " + map.get("b"));
		}
		
	}

}
