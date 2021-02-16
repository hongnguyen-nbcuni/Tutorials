package com.example.java;

import java.util.Calendar;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		// create a calendar
		Calendar cal = Calendar.getInstance();
		// print current date
		System.out.println("The current date calendar is : " + cal.getTime());
		
		Date d1 = new Date();	
		System.out.println("Current date is " + d1);
		
        System.out.println("Miliseconds from Jan 1 "+ 
                "1970 to date d1 is " + d1.getTime());  // in miliseconds
        
		// Creates a date object for the given milliseconds 
		// since January 1, 1970, 00:00:00
		Date d2 = new Date(2323223232L); 
        System.out.println("Date represented is "+ d2 );
        
        // a value less than 0 if the Date is before the Date argument; 
        // and a value greater than 0 if the Date is after the Date argument.
        int c = d1.compareTo(d2); 
        System.out.println(c);  
  
        d2.setTime(204587433443L); 
        System.out.println("After setting "+d2); 
        
        // creating a date object with specified time. 
        Date dateOne = new Date(); 
  
        System.out.println("Date initially: "
                           + dateOne); 
        
        
        
		
	}

}
