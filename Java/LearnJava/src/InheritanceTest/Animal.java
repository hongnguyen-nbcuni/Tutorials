package InheritanceTest;

public abstract class Animal {

	protected int age;
	
	
	public abstract void eat();
	
	// any class that inherited from Animal can see this method
	protected void age() {
		System.out.println("Animal age is calculated ...");
		
	}

	public static void something() {
		// TODO Auto-generated method stub
		
	}

}
