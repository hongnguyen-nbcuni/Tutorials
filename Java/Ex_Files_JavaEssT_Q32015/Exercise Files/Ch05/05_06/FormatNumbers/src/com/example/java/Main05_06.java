package com.example.java;

import java.text.NumberFormat;
import java.util.Locale;

public class Main05_06 {

    public static void main(String[] args) {
    	
    	Locale locale = new Locale("da", "DK"); // language, country

        double doubleValue = 1_234_567.89;
        
        NumberFormat numF = NumberFormat.getNumberInstance(locale);
        System.out.println("Number: " + numF.format(doubleValue)); // 1.234.567,90
         
        NumberFormat curF = NumberFormat.getCurrencyInstance(locale);
        System.out.println("Number: " + curF.format(doubleValue)); // kr 1.234.567,89

        NumberFormat intF = NumberFormat.getIntegerInstance();
        System.out.println("Number: " + intF.format(doubleValue)); // 1,234,568

        
    }

}

