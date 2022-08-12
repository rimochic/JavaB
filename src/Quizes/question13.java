package Quizes;
import java.util.HashSet;
import java.util.Set;

public class question13 {

	public static void main(String[] args) {
		
		Set<String> hs = new HashSet<>();
		
		hs.add("B");
		hs.add("W");
		hs.add("O");
		hs.add("Y");
		hs.add("R");
		hs.add("G");
		hs.add("B");
		hs.add("P");
		
//		Convert HashSet to Array
		String arr[] = new String[hs.size()];
		hs.toArray(arr);
		
		System.out.println(" Array elements :");
		System.out.println(" --------------"); 
		
		for(int i =0; i<arr.length; i++) {
		System.out.println("\t"+ arr[i]);
		}
		
//		Or
//		for (String el : arr) {
//			System.out.println("\t" + el);
//		}
		
	
	}

}
