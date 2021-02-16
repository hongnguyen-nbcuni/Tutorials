
class Base2 {
	public void show() {
		System.out.println("Base::show() called");
	}
	
	public void show2() {
		System.out.println("Base::show2() called");
	}
}


class Derived2 extends Base2 {
	public void show() {
		System.out.println("Derived::show() called");
	}
}

public class DerivedTest {

	public static void main(String[] args) {
		Base2 b = new Derived2();
		b.show();				// Derived::show() called
		b.show2();				// Base::show2() called
	}			

}
