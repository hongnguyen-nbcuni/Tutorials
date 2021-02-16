package com.example.java;

import java.util.Date;
import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {

		// create a calendar
		Calendar cal = Calendar.getInstance();

		// print current date
		System.out.println("The current date is : " + cal.getTime());
		System.out.println("The timezone is : " + cal.getTimeZone().getDisplayName());
		System.out.println("The time in milliseconds : " + cal.getTimeInMillis());

		// return a string representation of this calendar.
		System.out.println(cal.getTime().toString());
		System.out.println(cal.getTime());

		// Demonstrate Calendar's get()method 
		System.out.println("Current Calendar's Year: " + cal.get(Calendar.YEAR)); 
		System.out.println("Current Calendar's Day: " + cal.get(Calendar.DATE)); 
		System.out.println("Current MINUTE: " + cal.get(Calendar.MINUTE)); 
		System.out.println("Current SECOND: " + cal.get(Calendar.SECOND)); 


		// add 20 days to the calendar
		cal.add(Calendar.DATE, 20);
		System.out.println("20 days later: " + cal.getTime());

		// subtract 2 months from the calendar
		cal.add(Calendar.MONTH, -2);
		System.out.println("2 months ago: " + cal.getTime());

		// subtract 5 year from the calendar
		cal.add(Calendar.YEAR, -5);
		System.out.println("5 years ago: " + cal.getTime());


		Calendar cal2 = Calendar.getInstance();

		System.out.println("today date: " + cal2.getTime());

		 // Creating calendar objects 
        Calendar calndr1 
            = (Calendar)Calendar.getInstance(); 
        Calendar calndr2 
            = (Calendar)Calendar.getInstance(); 

		// Displaying the current date 
		System.out.println("The Current"
				+ " System Date: "
				+ calndr1.getTime()); 

		// Setting to a different date 
		calndr1.set(Calendar.MONTH, 5); 
		calndr1.set(Calendar.YEAR, 2020); 
		calndr1.set(Calendar.DAY_OF_WEEK, 15); 
		Date dt = calndr1.getTime(); 

		System.out.println("date of dt is : " + dt);
		
		// Setting the timevalue 
		calndr2.setTime(dt); 

		// Displaying the new date 
		System.out.println("The modified"
				+ " Date:"
				+ calndr2.getTime()); 



	}


}
