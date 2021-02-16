package InterfaceTest;

public interface Car {      
	
	// Car should only define what needs to be done, behavior
	public void drive();
	
	default void display() {
		System.out.println("I'm a car");
	}
	

}
