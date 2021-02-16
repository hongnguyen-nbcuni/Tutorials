
class Base3 { 
	public void Print() { 
		System.out.println("Base"); 
	}          
} 

class Derived3 extends Base3 {     
	public void Print() { 
		System.out.println("Derived"); 
	} 
} 



public class DerivedTest2 {

	public static void DoPrint( Base3 o ) { 
		o.Print();    
	} 
	public static void main(String[] args) { 
		Base3 x = new Base3(); 				
		Base3 y = new Derived3(); 
		Derived3 z = new Derived3(); 
		DoPrint(x); 						// Base
		DoPrint(y); 						// Derived
		DoPrint(z); 						// Derived
	} 
}
