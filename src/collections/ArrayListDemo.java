package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List <Integer> numbers = new ArrayList<Integer>(5);
		
		for(int i=1; i<= 5; i++) {
		numbers.add(i);
		}
		System.out.println("This is the list added :" + numbers);
//		numbers.remove(3);
//		System.out.println("This is the list after removing an element :" + numbers);
//		numbers.clear();
//		System.out.println("This an empty list" + numbers);
		
		for (int i = 0; i < numbers.size(); i++) {
			
		System.out.println(numbers.get(i));
		}
	}

}
