package InterfaceTest;

public class Mercedes implements Car, Asset, Loggable {

	public void drive() {

		System.out.println("Mercedes driving ...");

	}
	
	public int value() {
		return 80000;
	}
	
	public String owner() {
		return "Marcus";
	}

	@Override
	public String message() {
		
		return "I am the car of Marcus";
	}
	
	

}
