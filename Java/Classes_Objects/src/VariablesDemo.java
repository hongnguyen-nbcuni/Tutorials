public class VariablesDemo {

	static int x = 11;
	private int y = 33;
	
	
	public void method1(int k)
	{
		
		VariablesDemo t = new VariablesDemo();
		x = 25;					// static
		this.y = 44;

		System.out.println("VariablesDemo.x: " + VariablesDemo.x); // 24 (static reference to static variable)
		System.out.println("t.x: " + t.x);		// 25, because x is static, should not use t.x; (global, unstantiate) 
		System.out.println("t.y: " + t.y);		// 33
		System.out.println("y: " + y);			// 44

	}

	// public static void method2() {
	//	x = 60;
	//}


	public static void main(String[] args) {
		VariablesDemo w = new VariablesDemo();
		w.method1(5);
	
		System.out.println("w.x: " + VariablesDemo.x);				// 25	
		System.out.println("w.y: " + w.y);							// 44

		VariablesDemo w2 = new VariablesDemo();
		
		System.out.println("w2.x: " + VariablesDemo.x);				// 25
		System.out.println("w2.y: " + w2.y);						// 33
		
		

	}

}
