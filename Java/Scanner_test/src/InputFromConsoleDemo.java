import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// In Java, there are three different ways for reading input 
// from the user in the command line environment(console).
// 1. Using Buffered Reader Class
// 2. Using Scanner Class

public class InputFromConsoleDemo {

	public static void main(String[] args) {

		// 1. Using Buffered Reader Class

		//Enter data using BufferReader 
		BufferedReader reader =  
				new BufferedReader(new InputStreamReader(System.in)); 

		// Reading data using readLine 
		try {

			System.out.print("Name : ");

			String name = reader.readLine();
			// Printing the read line 
			System.out.println(name);   

		} catch (IOException e) {
			e.printStackTrace();
		} 

		// 2. Using Scanner Class

		// Using Scanner for Getting Input from User 
		Scanner in = new Scanner(System.in); 

		System.out.print("String : ");

		String s = in.nextLine(); 
		System.out.println("You entered string "+s); 

		System.out.print("Integer : ");

		int a = in.nextInt(); 
		System.out.println("You entered integer "+a); 

		System.out.print("Float : ");

		float b = in.nextFloat(); 
		System.out.println("You entered float "+b); 

		// 3. Using Console Class

		// Note that this program does not work on IDEs as  
		// System.console() may require console 

		/* 
		System.out.print("Enter Name from console : ");

		// Using Console to input data from user 
		String name = System.console().readLine(); 

		System.out.println(name); 
		*/
	} 


}
