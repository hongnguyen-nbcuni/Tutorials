
interface intfA 
{ 
    void m1(); 
} 
  
interface intfB 
{ 
    void m2(); 
} 
  
// class implements both interfaces 
// and provides implementation to the method. 
class sample implements intfA, intfB 
{ 
    @Override
    public void m1() 
    { 
        System.out.println("Welcome: inside the method m1"); 
    } 
  
    @Override
    public void m2() 
    { 
        System.out.println("Welcome: inside the method m2"); 
    } 
} 
  
public class InterfaceDemo {
	
    public static void main (String[] args) 
    { 
        sample ob1 = new sample(); 
  
        // calling the method implemented 
        // within the class. 
        ob1.m1(); 							// Welcome: inside the method m1
        ob1.m2(); 							// Welcome: inside the method m2
    } 
}


/*
interface In1 
{ 
	// public, static and final 
	final int a = 10; 

	// public and abstract  
	void display(); 
} 



//A class that implements the interface. 
public class InterfaceDemo implements In1 
{ 
	// Implementing the capabilities of 
	// interface. 
	public void display() 
	{ 
		System.out.println("Hello"); 
	} 

	// Driver Code 
	public static void main (String[] args) 
	{ 
		InterfaceDemo t = new InterfaceDemo(); 
		t.display(); 							// Hello
		System.out.println(a); 					// 10
	} 
}
*/


/* 

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
public class InterfaceDemo implements PI1, PI2 {

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
		InterfaceDemo d = new InterfaceDemo(); 
		d.show();

	}

}
 */