package demo;

public class ExceptionHandlingDemo {
	public static void main(String[] args) {
		
		try {
			demo();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		/*
		try {
			System.out.println("Hello World...!");
			int i = 1/0;
			System.out.println("Completed");
		}
		catch(Exception exp) {
			System.out.println("I'm in catch block");
			System.out.println("Message is: " + exp.getMessage());
			System.out.println("Message is: " + exp.getCause());
			exp.printStackTrace();
		}
		finally {
			System.out.println("I'm inside finally block");
		}
		*/
	
	}
	
	public static void demo() throws Exception { // throw back to the main function
		System.out.println("Hello World...!");
		int i = 1/0;
		System.out.println("Completed");
	}

}
