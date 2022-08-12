package MyPractice;

public class StringMethods {

	public static void main(String[] args) {
		
		// String = a reference data type that can store one or more characters
		// reference data types have access to useful methods
		
		String name ="Mostafa";
	//	boolean result = name.equals(name);
	//	int result = name.length();
	//	char result = name.charAt(2);
	//	int result = name.indexOf("o");
//		boolean result = name.isEmpty();
	//	String result = name.toLowerCase();
	//	String result = name.toUpperCase();
//		String result = name.trim();
		String result = name.replace('o', 'a'); // replace the old character with the new one
		System.out.println(result);
	}

}
