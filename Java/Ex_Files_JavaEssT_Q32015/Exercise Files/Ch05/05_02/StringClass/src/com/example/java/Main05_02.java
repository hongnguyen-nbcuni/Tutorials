package com.example.java;

public class Main05_02 {

	public static void main(String[] args) {

		String str = "geekss@for@geekss"; 
		String[] arrOfStr = str.split("@", 2); 

		System.out.println("arrOfStr1: ");

		for (String a : arrOfStr) 
			System.out.println(a); 


		String[] arrOfStr2 = str.split("@", 5); 

		System.out.println("arrOfStr2: ");

		for (String a : arrOfStr2) 
			System.out.println(a); 

		System.out.println("arrOfStr3: ");

		str = "geekss@for@geekss"; 

		// the pattern will be applied as many times as possible
		String[] arrOfStr3 = str.split("@", -2); 

		for (String a : arrOfStr3) 
			System.out.println(a); 

		// the pattern will be applied as many times as possible
		// and trailing empty strings will be discarded.
		String[] arrOfStr4 = str.split("s", 0); 

		System.out.println("arrOfStr4: ");

		for (String a : arrOfStr4) 
			System.out.println(a); 

		str = "word1, word2 word3@word4?word5.word6"; 
		String[] arrOfStr5 = str.split("[, ?.@]+"); 

		System.out.println("arrOfStr5: ");

		for (String a : arrOfStr5) 
			System.out.println(a);



	}

}


