package com.example.java;

import java.math.BigDecimal;

public class Main04_03 {

    public static void main(String[] args) {

        double value = .012;
        double pSum = value + value + value;
        System.out.println(pSum);	// 0.036000000000000004
        
        String strValue = Double.toString(value);    // 0.012 

        BigDecimal bigValue = new BigDecimal(strValue); // pass in as string -> BigDecimal

        BigDecimal bSum = bigValue.add(bigValue).add(bigValue); 

        System.out.println("Sum of BigDecimals: " + bSum.toString());   /// 0.036 

         
        
    }

}
