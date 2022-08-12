package abstraction;

public abstract class ModernCar {
	
//	abstract is superclass that can not be instantiated and it is used to state or define general characteristics

	public abstract void hydraulicBrake();
	
	
	public void autoLock() {
		System.out.println("Auto lock system");
	}
	
	public void navigation() {
		System.out.println("Navigation Available");
	}
	
}
