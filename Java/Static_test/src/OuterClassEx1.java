
public class OuterClassEx1 {

	// The following are major differences between static nested classes and inner classes.
	// A static nested class may be instantiated without instantiating its outer class.
	// Inner classes can access both static and non-static members of the outer class. 
	// A static class can access only the static members of the outer class.

	private static String msg = "GeeksForGeeks";

	// Static nested class
	// A static nested class may be instantiated without instantiating 
	// its outer class.
	public static class NestedStaticClass {

		// Only static members of Outer class 
		// is directly accessible in nested 
		// static class 
		public void printMessage() 
		{ 

			// Try making 'message' a non-static 
			// variable, there will be compiler error 
			System.out.println( 
					"Message from nested static class: "
							+ msg); 
		} 
	}

	// Non-static nested class - 
	// also called Inner class 
	public class InnerClass { 

		// Both static and non-static members 
		// of Outer class are accessible in 
		// this Inner class 
		public void display() 
		{ 
			System.out.println( 
					"Message from non-static nested class: "
							+ msg); 
		} 
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create instance of nested Static class 
		OuterClassEx1.NestedStaticClass printer 
		= new OuterClassEx1.NestedStaticClass(); 

		// Call non static method of nested 
		// static class 
		printer.printMessage(); 

		// In order to create instance of 
		// Inner class we need an Outer class 
		// instance. Let us create Outer class 
		// instance for creating 
		// non-static nested class 
		OuterClassEx1 outer = new OuterClassEx1(); 
		OuterClassEx1.InnerClass inner 
		= outer.new InnerClass(); 

		// Calling non-static method of Inner class 
		inner.display(); 

		// We can also combine above steps in one 
		// step to create instance of Inner class 
		OuterClassEx1.InnerClass innerObject 
		= new OuterClassEx1().new InnerClass(); 

		// Similarly we can now call Inner class method 
		innerObject.display(); 
	} 


}
