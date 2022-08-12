package testdemo;

public class Honda extends Car {
	
	public void refuel() {
		System.out.println("This car is refuelling");
	}
	public void start() {
		System.out.println("This " + year + " "+ make + " " + model + " size of "+ size + " ("+ typeCar + ")" + " is runnig");
	}
	
}
