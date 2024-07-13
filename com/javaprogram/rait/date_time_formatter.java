package com.javaprogram.rait;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class date_time_formatter {

	public static void main(String[] args) {
		LocalDateTime myDate = LocalDateTime.now();
		
		System.out.println("Before Formatting: "+myDate);
		
		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String formattedDate = myDate.format(myFormat);
		System.out.println("After Formatting: "+formattedDate);
	}
}
