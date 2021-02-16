package com.example.java;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		String s = "GeeksForGeeks - "
				+ "A Computer Science Portal for Geeks"; 

		// create a new scanner 
		// with the specified String Object 
		Scanner scanner = new Scanner(s); 

		// print a line of the scanner 
		System.out.println("Scanner String: \n"
				+ scanner.nextLine()); 

		// display information about this scanner , 
		System.out.println("\nString representation "
				+ "of this Scanner:\n"
				+ scanner.toString()); // may be useful for debugging

		// close the scanner 
		scanner.close(); 

		//https://www.geeksforgeeks.org/localdatetime-ofdate-time-method-in-java-with-examples/?ref=rp


		// Declare the object and initialize with 
		// predefined standard input object 
		Scanner sc = new Scanner(System.in); 

		// String input 
		String name = sc.nextLine(); 
		
		System.out.println("Name: " + name);

		// Character input 
		char gender = sc.next().charAt(0); 

        // Numerical data input 
        // byte, short and float can be read 
        // using similar-named functions. 
        int age = sc.nextInt(); 
        long mobileNo = sc.nextLong(); 
        double cgpa = sc.nextDouble(); 
  
        // Print the values to check if the input was correctly obtained. 
        System.out.println("Name: "+name); 
        System.out.println("Gender: "+gender); 
        System.out.println("Age: "+age); 
        System.out.println("Mobile Number: "+mobileNo); 
        System.out.println("CGPA: "+cgpa); 
        
        

	}

}
