package com.example.java;

public class Main06_03 {

	public static void main(String[] args) {

		String welcome = "Welcome!";
		char[] chars = welcome.toCharArray();

		/*
		try {
			char lastChar = chars[chars.length];
			System.out.println("Last character: " + lastChar);
		} catch (Exception e) {				// super class of all the exceptions
			e.printStackTrace();
			System.out.println("In catch!");
		}
		*/
		try {
			char lastChar = chars[chars.length];	// should be length - 1
			System.out.println("Last character: " + lastChar);
		} catch (ArrayIndexOutOfBoundsException e) {				// super class of all the exceptions
			e.printStackTrace();
			System.out.println("In catch!");
		}
	}

}
