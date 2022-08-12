package MyPractice;

public class TwoDarray {

	public static void main(String[] args) {
		
	//	2D array = is an array of arrays
		
//		String cars[][] = new String [3][2];
		
//		cars[0][0] = "Toyota";
//		cars[0][1] = "Ford";
//		cars[1][0] = "Tesla";
//		cars[1][1] = "Honda";
//		cars[2][0] = "Nissan";
//		cars[2][1] = "Acura";
		System.out.println("Cars1\tCars2");
		System.out.println("----\t----");
		
// ----------- Or -------------
		 String cars[][] = {{"Toyota", "Ford"},{ "Tesla","Honda"},{"Nissan", "Acura"}};
		
		for(int x = 0; x < cars.length; x++) {
			for(int y = 0; y < cars[x].length; y++) {
			System.out.print(cars[x][y]+ "\t");
			}
			System.out.println();
		}
	}

}
