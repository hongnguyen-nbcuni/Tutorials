package com.example.java;

// 1) The String object is immutable (unchange) in Java but StringBuffer and StringBuilder are mutable (liable to change) objects.
// 2) StringBuffer is synchronized while StringBuilder is not which makes StringBuilder faster than StringBuffer.
// 3) Concatenation operator "+" is internally implemented using either StringBuffer or StringBuilder.
// 4) Use String if you require immutability, use StringBuffer in java if you need mutable + thread-safety and use StringBuilder in Java if you require mutable + without thread-safety.

public class StringBuilderDemo {

	public static void main(String[] args) {
		// create a StringBuilder object 
		// usind StringBuilder() constructor 
		StringBuilder str = new StringBuilder(); 

		str.append("GFG"); 

		// print string 
		System.out.println("String = " + str); 					// GFG
		System.out.println("String = " + str.toString()); 		// GFG

		// create a StringBuilder object 
		// usind StringBuilder(CharSequence) constructor 
		StringBuilder str1 = new StringBuilder("AAAABBBCCCC"); 

		// print string 
		System.out.println("String1 = " + str1.toString()); 	// AAAABBBCCCC

		// create a StringBuilder object 
		// usind StringBuilder(capacity) constructor 
		StringBuilder str2 = new StringBuilder(10); 

		// print string 
		System.out.println("String2 capacity = " + str2.capacity()); 	// 10

		// create a StringBuilder object 
		// usind StringBuilder(String) constructor 
		StringBuilder str3 = new StringBuilder(str1); 

		// print string 
		System.out.println("String3 = " + str3.toString()); 			// AAAABBBCCC
		
		// reverse the string 
		StringBuilder reverseStr = str3.reverse(); 

		// print string 
		System.out.println("Reverse String3 = " + reverseStr.toString()); // CCCCBBBAAAA

		// Append ', '(44) to the String 
		str3.appendCodePoint(44); 

		// Print the modified String 
		System.out.println("Modified StringBuilder = " + str3); 		// CCCCBBBAAAA,

		// get capacity 
		int capacity = str3.capacity(); 

		// print the result 
		System.out.println("StringBuilder = " + str3); 
		System.out.println("Capacity of StringBuilder = " + capacity); 	// 27

	}

}
