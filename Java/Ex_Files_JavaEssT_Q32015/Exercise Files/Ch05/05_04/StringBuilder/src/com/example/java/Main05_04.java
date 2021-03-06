package com.example.java;

import java.util.Scanner;

public class Main05_04 {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + ", " + str2 + "!";
        System.out.println(str3);
        
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", ");
        sb.append("World");
        sb.append("!");
        System.out.println(sb);
               
        StringBuilder sb2 = new StringBuilder("Hello")
        		.append(", ")
        		.append("World")
        		.append("!");
        System.out.println(sb2);
     
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value: ");
        String input = scanner.nextLine();
        System.out.println(input);     
        
        sb.delete(0, sb.length()); // delete the content of the string builder
        for (int i = 0; i<3 ; i++) {
        	input = scanner.nextLine();
        	sb.append(input + " test\n");
        	System.out.println(input);
        	System.out.println(sb.toString());
        	
        }
        scanner.close();
    }


}
