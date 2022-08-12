package testdemo;

public interface USBank {
	
	
	int min_bal = 100;
	
	public void credit();
	public void debit();
	public void transMoney();

	
/* Interface
 * Only methods declaration
 * No method body, only method prototype
 * We can declare variables and they are by default static
 * Variables values will not change
 * No static method in interface
 * No main method in interface
 * We can not create the object in interface
 * Interface is abstract in nature
*/
	
}
