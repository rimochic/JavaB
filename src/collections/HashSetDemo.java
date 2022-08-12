package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		Set<String> hashSet = new HashSet<>();
		
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("C");
		hashSet.add("A");
		hashSet.add("D");
		boolean dr = hashSet.add("A"); // It will not add Letter A because it exist already
		System.out.println(dr); // False because A exist
		System.out.println(hashSet);
		boolean dr2 = hashSet.add("F"); // It will add Letter F because it doesn't exist
		System.out.println(dr2); // True because F doesn't exist
		System.out.println(hashSet);
		System.out.println("The list contains C ? " + hashSet.contains("C"));

	}

}
