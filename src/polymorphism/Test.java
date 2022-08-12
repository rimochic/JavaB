package polymorphism;

public class Test {

	public static void main(String[] args) {
		
		
		ModernCalculator mc = new ModernCalculator();
		mc.add(3, 6); // 9
		mc.add(4, 3, 9); // 7
		mc.division(5, 2);
		mc.sub(7, 4);
		
		
		System.out.println("------------------");
		
		Calculator cal = new Calculator();
		cal.add(7, 9);
		cal.sub(6, 1);
		
		Calculator cl = new ModernCalculator();
		cl.add(4, 5);
		
		ModernCalculator c = (ModernCalculator)new Calculator();
		c.add(0, 0);
	
		
		
//		Calculator cal = new Calculator();
//		cal.add(34, 2);
//		cal.add(10, 5, 9);
//		cal.sub(34, 6);
//		
//		
//		ModernCalculator mc = new ModernCalculator();
//		mc.add(4, 8);
		

	}

}
