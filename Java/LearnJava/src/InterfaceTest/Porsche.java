package InterfaceTest;

public class Porsche implements Car, Cloneable {

	private String ownersName;
	
	public Porsche(String ownersName) {
		this.ownersName = ownersName;
	}

	public void drive() {

		System.out.println("Porsche driving ...");
		

	}

	public void close() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Porsche clone() {
		try {
			return (Porsche) super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		return null;
	}

	public String asString() {
		return "Porsche of " + ownersName;
		
	}

	public void sellTo(String string) {
		this.ownersName = string;
		
	}

}
