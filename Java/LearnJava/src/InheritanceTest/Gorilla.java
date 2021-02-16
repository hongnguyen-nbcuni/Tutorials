package InheritanceTest;

public class Gorilla extends Animal {
	
	// since eat() is abstract, this needs to be implemented here
	public void eat() {		
		System.out.println("Gorilla is eating ...");
	}
	
	@Override
	protected void age() {      // this can be public as well
		
		Gorilla.something();
		
		System.out.println("Gorilla is implementing the age by itself ...");
		
	}
	
	
}
