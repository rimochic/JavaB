package helloworld;

public class NestedForLoop {

	public static void main(String[] args) {
		
		 int arr[][]= {{3,5,8},{8,0,4},{1,6,9}};

	        
	        for(int row = 0; row < 3; row++) {
	        for( int column = 0; column < 3; column++) {
	                System.out.print(arr[row][column] + "  ");
	            }
	        System.out.println();

	        }
	}

}
