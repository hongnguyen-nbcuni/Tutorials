package com.example.java;

import java.nio.charset.Charset;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// two ways to create string in Java

		String s1 = "GeeksforGeeks";

		String s2 = new String("GeeksforGeeks");

		// 1
		byte[] barr = {71, 101, 101, 107, 115};
		String sbyte =new String(barr);				// Geeks
		System.out.println(sbyte);	

		int[] uni_code = {71, 101, 101, 107, 115};
		String sunicode = new String(uni_code, 1,3); //eek
		System.out.println(sunicode);	

		// 2. char_set for decoding.
		Charset cs = Charset.defaultCharset();
		String s_byte_char = new String(barr, cs); 	//Geeks
		System.out.println(s_byte_char);	

		// int start_index, int length, Charset char_set) 
		String s3 = new String(barr, 1, 3, cs); 	// eek
		System.out.println(s3);	

		char char_arr[] = {'G', 'e', 'e', 'k', 's'};
		String s4 = new String(char_arr); 			// Geeks
		System.out.println(s4);	

		StringBuffer s_buffer = new StringBuffer("Geeks");
		String s5 = new String(s_buffer); 			// Geeks
		System.out.println(s5);
		System.out.println(s_buffer);				// Geeks

		System.out.println("GeeksforGeeks".length());  // returns 13

		System.out.println("GeeksforGeeks".charAt(3)); // returns  ‘k’

		System.out.println("GeeksforGeeks".substring(3)); // returns “ksforGeeks”

		// Returns the substring from i to j-1 index.
		System.out.println("GeeksforGeeks".substring(2, 5)); // returns “eks”

		String s6 = "Geeks";
		String s7 = "forGeeks";
		System.out.println(s6.concat(s7)); // returns “GeeksforGeeks”

		String s8 = "Learn Share Learn";
		System.out.println(s8.indexOf("Share")); 	// returns 6

		// starting at the specified index.
		System.out.println(s8.indexOf("ea",3));		// returns 13

		System.out.println(s8.lastIndexOf("a"));	// returns 14

		System.out.println("Geeks".equals("Geeks")); // returns true
		System.out.println("Geeks".equals("geeks")); // returns false

		System.out.println("Geeks".equalsIgnoreCase("Geeks")); // returns true
		System.out.println("Geeks".equalsIgnoreCase("geeks")); // returns true

		// strings to be compared
		// This returns difference s1-s2. If :
		// out < 0   s1 comes before s2
		// out = 0  s1 and s2 are equal.
		// out > 0   // s1 comes after s2.
		int out = s1.compareTo(s2);  
		System.out.println(out);				// 0 = s1 and s2 are equal
		System.out.println(s1.compareTo(s6)); 	// 8 = S1 after s6
		System.out.println(s1.compareToIgnoreCase(s2)); 

		String word1 = "HeLLo";
		String word2 = word1.toLowerCase(); // returns “hello"
		String word3 = word1.toUpperCase(); // returns “HELLO”
		
		// removing whitespaces at both ends
		word1 = " Learn Share Learn ";
		word2 = word1.trim(); // returns “Learn Share Learn”
		
		s1 = "feeksforfeeks";
		s2 = "feeksforfeeks".replace('f' ,'g'); // returns “geeksgorgeeks”
		System.out.println(s2);
		
	}

}
