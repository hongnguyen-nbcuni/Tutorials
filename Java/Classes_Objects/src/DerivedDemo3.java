
// multiple inheritance only through Interfaces.
interface test1
{ 
	public void print_geek(); 
} 

interface test2 
{ 
	public void print_for(); 
} 

interface test3 extends test1,test2 
{ 
	public void print_geek(); 
} 

class child implements test3
{ 
	@Override
	public void print_geek() { 
		System.out.println("Geeks"); 
	} 

	public void print_for() 
	{ 
		System.out.println("for"); 
	} 
}


public class DerivedDemo3 {

	public static void main(String[] args) {
		child c = new child(); 
		c.print_geek(); 	// Geeks
		c.print_for(); 		// for
		c.print_geek();  	// Geeks

	}

}
