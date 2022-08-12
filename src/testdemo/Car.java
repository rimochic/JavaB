package testdemo;

public class Car {
	
	String make;
	String model;
	int year;
	int size;
	String typeCar;
	
	public void start() {
		System.out.println("This " + year + " "+ make + " " + model + " ("+ typeCar + ")" + " is starting");
	}
	
	public void stop() {
		System.out.println("This " + year + " " + make + " " + model + " ("+ typeCar + ")" + " is stopping");
	}
	
	// Constructor
	
	 Car(String mk, String mod, int y, int s, String tc){
		super();
		this.make = mk;
		this.model = mod;
		this.year = y;
		this.size = s;
		this.typeCar = tc;
		
	}

}
