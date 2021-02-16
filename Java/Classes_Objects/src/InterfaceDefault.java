// to demonstrate multiple 
// inheritance through default methods. 

interface PI1 
{ 
	// default method 
	default void show() 
	{ 
		System.out.println("Default PI1"); 
	} 
} 

interface PI2 
{ 
	// Default method 
	default void show() 
	{ 
		System.out.println("Default PI2"); 
	} 
} 


// Implementation class code 
public class InterfaceDefault implements PI1, PI2 {

	// Overriding default show method 
	public void show() 
	{ 
		// use super keyword to call the show 
		// method of PI1 interface 
		PI1.super.show(); 					// Default PI1

		// use super keyword to call the show 
		// method of PI2 interface 
		PI2.super.show(); 					// Default PI2
	}

	public static void main(String[] args) {
		InterfaceDefault d = new InterfaceDefault(); 
		d.show();

	}

}
 

