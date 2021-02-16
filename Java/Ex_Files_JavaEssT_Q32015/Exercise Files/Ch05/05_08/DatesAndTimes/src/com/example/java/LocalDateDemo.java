package com.example.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateDemo {

	public static void main(String[] args) {
			
		// https://www.geeksforgeeks.org/localdatetime-ofdate-time-method-in-java-with-examples/?ref=rp
		
        // Create LocalDate object 
        // using LocalDate.of() method 
        LocalDate date 
            = LocalDate.of(2020, 12, 20); 
  
        // Create LocalTime object 
        // using LocalTime.of() method 
        LocalTime time = LocalTime.of(6, 30); 
  
        // Create LocalDateTime object 
        LocalDateTime localdatetime 
            = LocalDateTime.of(date, time); 
  
        // Print full date and time 
        System.out.println( 
            "DateTime: " + localdatetime); 
          
        // Parses the date 
        LocalDateTime dt1 
            = LocalDateTime.parse("2020-11-03T12:45:30"); 
  
        // Prints the date 
        System.out.println(dt1); 
  
        // Parses the date 
        LocalDateTime dt2 
            = LocalDateTime.parse("2020-12-04T12:45:30"); 
  
        // Prints the date 
        System.out.println(dt2); 
  
        // Compares both dates 
        System.out.println(dt1.isAfter(dt2)); 
        
        // Compares the date 
        System.out.println("Is Date 1 "
                           + "equal to Date 2: "
                           + dt2.equals(dt1));
        
        // Compares the date 
        System.out.println("After comparison: "
                           + dt2.isEqual(dt1)); 
        
        
        // create a LocalDateTime Object 
        LocalDateTime local 
            = LocalDateTime.parse("2021-01-28T22:29:10"); 
  
        // get DayOfMonth 
        int dayOfMonth = local.getDayOfMonth(); 
  
        // print result 
        System.out.println("DayOfMonth: "
                           + dayOfMonth); 
        
        // print result 
        System.out.println("DayOfWeek: "
                           + local.getDayOfWeek()); 
        
        System.out.println("DayOfYear: "
                + local.getDayOfYear()); 
        
        System.out.println("Hour: "
                + local.getHour()); 
        
        System.out.println("Year: "
                + local.getYear()); 
        
        System.out.println("Second: "
                + local.getSecond()); 

        System.out.println("Minute: "
                + local.getMinute()); 
        
        System.out.println("Momth: "
                + local.getMonth()); 
        
        // Get the LocalDateTime instance 
        LocalDateTime dt = LocalDateTime.now(); 
  
        // Get the LocalDate representation of this LocalDateTime 
        // using toLocalDate() method 
        System.out.println(dt.toLocalDate()); // 2020-12-23
        
        System.out.println(dt); // 2020-12-23T18:15:49.960
        
        
	}

}
