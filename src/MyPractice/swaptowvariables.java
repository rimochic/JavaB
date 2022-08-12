package MyPractice;

public class swaptowvariables {
	public static void main(String[] args) {
		// Swap two variables (Switch them)
		String x ="Water";
		String y = "Kool-Aid";
		String temp;
		
		temp = x;
		x = y;
		y = temp;
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
		
	}

}
