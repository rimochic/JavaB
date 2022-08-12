package errorhandling;

public class ErrorHandling {

	public static void main(String[] args) {
//		int a[] = {3, 7, 9};
//		System.out.println(a[8]);
//		if we run this code block, we will have an Error 
//		To avoid the error appear for the user, we will use "Try ---- Catch"
		
		
//		General error exception
//		---------------------------------------
//		try {
//		int a[] = {3, 7, 9};
//		System.out.println(a[8]);
//		}catch(Exception e){
//			System.out.println("An exception happened");
//		}
//		
		
//		Specific error exception : we copy the error link and we paste it in exception
//		----------------------------------------
		try {
		int a[] = {4, 7, 9};
		System.out.println(a[7]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("An Eception happened");
		}
	}

}
