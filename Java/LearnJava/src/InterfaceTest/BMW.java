package InterfaceTest;


public class BMW implements Car {
	
	public void drive() {
		
		System.out.println("BMW driving ...");
		
	}
	
	public int value() {
		return 80000;
	}
	
	public String owner() {
		return "Marcus";
	}
	
}
