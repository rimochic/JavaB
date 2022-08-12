package Quizes;

import java.util.HashSet;

public class question12 {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<>();
		
		hs.add("B");
		hs.add("W");
		hs.add("O");
		hs.add("Y");
		hs.add("R");
		hs.add("G");
		hs.add("B");
		hs.add("P");
		
		System.out.println("List of HashSet : " + hs);
		System.out.println("Is this HashSet empty ? :" + hs.isEmpty());
//		Empty an HashSet
		hs.clear();
		System.out.println("HashSet is empty :" + hs);
//		Test a hash set is empty or not
		System.out.println("Is this HashSet empty ? :" + hs.isEmpty());
		

	}

}
