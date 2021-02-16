package com.example.java;

public class Main04_04 {

    public static void main(String[] args) {

        int intValue1 = 56;
        long longValue = intValue1; // widening the type is okay
        System.out.println(longValue);
        //short shortValue1 = intValue1; // narrowing the type is not okay
        
        // need to cast it to short, but make sure the number the original number is not too big
        short shortValue1 = (short)intValue1;
        System.out.println(shortValue1);
    }

}
