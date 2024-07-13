package com.javaprogram.rait;

public class frequency {

	public static void main(String[] args) {
		String str = "This is an awesome website.";
		char ch='e';
		int frequency = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(ch==str.charAt(i)) {
				++frequency;
			}
		}
		
		System.out.println("Frequency of "+ch+ " is "+frequency);
	}
}
