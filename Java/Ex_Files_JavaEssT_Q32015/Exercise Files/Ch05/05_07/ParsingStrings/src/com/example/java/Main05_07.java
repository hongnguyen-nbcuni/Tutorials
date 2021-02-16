package com.example.java;

public class Main05_07 {

    public static void main(String[] args) {

        String s1 = "Welcome to California!";
        int position = s1.indexOf("California");
        System.out.println(position);  // 11
        
        String sub = s1.substring(11);
		System.out.println(sub); // California!
		String s2 = "      Welcome!     ";
		String s3 = s2.trim();	// remove leading and trailing spaces
		System.out.println(s3);
    }

}
