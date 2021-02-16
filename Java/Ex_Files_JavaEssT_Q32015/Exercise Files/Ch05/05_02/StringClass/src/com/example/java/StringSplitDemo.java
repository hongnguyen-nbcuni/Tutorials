package com.example.java;

public class StringSplitDemo {

	public static void main(String[] args) {

		// 1
		String str = "word1, word2 word3@word4?word5.word6"; 
		String[] arrOfStr = str.split("[, ?.@]+"); 
		// word1
		// word2
		// word3
		// word4
		// word5
		// word6
		
		for (String a : arrOfStr) 
			System.out.println(a); 

		//2
		str = "TestSplit@String1@String2";

		arrOfStr = str.split("@", 2);

		for (String a : arrOfStr)
			System.out.println(a); 
		// TestSplit
		// String1@String2

		// 3
		arrOfStr = str.split("@", 3);
		for (String a : arrOfStr)
			System.out.println(a); 
		// TestSplit
		// String1
		// String2

		// 4
		String str2 = "TestSplit:String1:String2"; 
		arrOfStr = str2.split(":"); 

		for (String a : arrOfStr) 
			System.out.println(a); 
		// TestSplit
		// String1
		// String2

	}

}
