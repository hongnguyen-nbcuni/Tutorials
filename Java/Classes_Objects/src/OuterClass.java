
public class OuterClass {

	//private class InnerClass {				// this is private, only access within a class
	public class InnerClass {				// this is private, only access within a class	
		public void display() {
			System.out.println("This is an inner class");
		}
	}

	public void inner() {
		InnerClass in = new InnerClass();
		in.display();
	}
}
