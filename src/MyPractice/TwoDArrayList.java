package MyPractice;
import java.util.*;

public class TwoDArrayList {

	public static void main(String[] args) {
//		2D ArrayList = a dynamic list of lists
//		You can change the size of these lists during run time

		ArrayList<ArrayList<String>> grocerylist = new ArrayList();
		
		ArrayList<String> bakerylist = new ArrayList();
		bakerylist.add("pasta");
		bakerylist.add("garlic bread");
		bakerylist.add("donuts");
		
		ArrayList<String> producelist = new ArrayList();
		producelist.add("potatos");
		producelist.add("turnip");
		producelist.add("pepper");
		
		ArrayList<String> drinklist = new ArrayList();
		drinklist.add("soda");
		drinklist.add("coffee");
		
		
		grocerylist.add(bakerylist);
		grocerylist.add(producelist);
		grocerylist.add(drinklist);
		System.out.println(grocerylist);
		System.out.println(grocerylist.get(1));
		System.out.println(grocerylist.get(1).get(0));
	}

}
