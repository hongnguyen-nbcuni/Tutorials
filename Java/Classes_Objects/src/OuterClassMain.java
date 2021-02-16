
public class OuterClassMain {

	public static void main(String[] args) {
		
		OuterClass out = new OuterClass();
		out.inner();
		
		// if public class InnerClass 
		OuterClass.InnerClass in = out.new InnerClass();
		in.display();
		
		System.out.println();

	}

}
