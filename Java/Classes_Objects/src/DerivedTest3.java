class Grandparent {
    public void Print() {
        System.out.println("Grandparent's Print()");
    }
}
 
class Parent extends Grandparent {
    public void Print() {
    	super.Print();  
        System.out.println("Parent's Print()");
    }
}
 
class Child3 extends Parent {
    public void Print() {
        super.Print();  
        System.out.println("Child's Print()");
    }
}


public class DerivedTest3 {

	public static void main(String[] args) {
		Child3 c = new Child3();
        c.Print();
        // Grandparent's Print()
        // Parent's Print()
        // Child's Print()

	}

}
