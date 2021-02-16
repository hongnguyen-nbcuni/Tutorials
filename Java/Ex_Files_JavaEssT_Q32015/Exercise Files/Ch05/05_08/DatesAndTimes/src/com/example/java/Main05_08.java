package com.example.java;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main05_08 {

	public static void main(String[] args) {

		Date d = new Date();
		System.out.println(d); // Sun Oct 11 00:59:03 PDT 2020
		GregorianCalendar gc = new GregorianCalendar(2020, 10, 29);
		gc.add(GregorianCalendar.DATE, 1);
		Date d2 = gc.getTime();
		System.out.println(d2);	// Mon Nov 30 00:00:00 PST 2020
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
	
		System.out.println(df.format(d2));	// Monday, November 30, 2020
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);	// 2020-10-11T01:19:22.157
		
		LocalDate ld = LocalDate.of(2020,  1, 28);
		System.out.println(ld);	// 2020-01-28
		
		DateTimeFormatter dtf = DateTimeFormatter.BASIC_ISO_DATE;
		System.out.println(dtf.format(ld));	// 20200128
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ISO_DATE;
		System.out.println(dtf1.format(ld));	// 2020-01-28
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("M/d/yyyy");
		System.out.println(dtf2.format(ld));	// 1/28/2020
		
	}

}

