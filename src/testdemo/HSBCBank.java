package testdemo;

public class HSBCBank implements USBank {
	
	
	public void credit() {
		System.out.println("HSBC ------- Credit");
	}
	public void debit() {
		System.out.println("HSBC --------- Debit");
	}
	public void transMoney() {
		System.out.println("HSBC ----------- Transfer Money");
	}
	

}
