package com.example.java;

public class Main04_05 {

    public static void main(String[] args) {

        int intValue1 = 56;
        int intValue2 = 42;
        
        int result1  = intValue1 + intValue2;
        System.out.println(result1);
        
        double result2 = (double) intValue1 / intValue2;
        System.out.println("Division: " + result2);	// 1.3333333333333333
        
        double doubleValue = -3.99999;
        long rounded = Math.round(doubleValue);
        System.out.println("Round value: " + rounded);  // -4
        
    }

}
