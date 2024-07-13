package com.javaprogram.rait;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class date_time {

	public static void main(String[] args) {
		
		LocalDate myObj = LocalDate.now(); //create a date object
		System.out.println("Today's date: "+myObj);
		
		LocalDateTime myObj2 = LocalDateTime.now();
		System.out.println("Today's date: "+myObj2);
		
		/*String string = "2024-01-06";
		LocalDate date = LocalDate.parse(string.DateTimeFormatter.ISO_DATE);
		System.out.println("Date: "+date);*/
	}
}
