package testdemo;

public class Test {
	
	public static void main(String[] args){
		
		
		// static polymorphism
		Honda h = new Honda();
		h.make = "Honda";
		h.model = "Pilot";
		h.year = 2022;
		h.size = 8;
		h.typeCar = "AWD";
		h.start();
		h.stop();
		h.refuel();
		System.out.println("--------------------------");
		
//		Car cr = new Car();
//		cr.make = "Toyota";
//		cr.model = "Camry";
//		cr.typeCar = "FWD";
//		cr.year = 2019;
//		cr.start();
//		cr.stop();
//		System.out.println("****************************");
//		
//		Car cr1 = new Honda(); // This called dynamic polymorphism
//		cr1.make = "Toyota";
//		cr1.model = "Highlander";
//		cr1.typeCar = "AWD";
//		cr1.year = 2020;
//		cr1.size = 7;
//		cr1.start();
		
		System.out.println("-------------------------------------");
		
		Car cr2 = new Car("Ford", "Focus", 2018, 4, "AWD");
		cr2.start();
		
	}
	
	
	
}
	

