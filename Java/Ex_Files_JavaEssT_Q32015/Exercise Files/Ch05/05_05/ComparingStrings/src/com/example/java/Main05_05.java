package com.example.java;

public class Main05_05 {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hello";
        
        if (str1 == str2) {
        	System.out.println("They match!");
        } else {
        	System.out.println("They are not match!");
        }

        // compare the content of strings user .equals
        String part1 = "Hello ";
        String part2 = "WORLD";
        String str4 = part1 + part2;
        String str5 = "Hello World";
        //if (str4.equals(str5)) {
        if (str4.equalsIgnoreCase(str5)) {	
        	System.out.println("They match!");
        } else {
        	System.out.println("They are not match!");
        }
    
    }

}
