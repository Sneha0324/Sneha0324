//Palindrome of a string:

package com.javaprogram.rait;

public class palindrome2 {
	public static void main(String[] args) {
		
		String ch="ABAA", rev="";
		
		int length = ch.length();
		
	    for(int i=length-1; i>=0; i--) {
	    	rev = rev+ ch.charAt(i);
	    }
	    
	    if(ch.toLowerCase().equals(rev.toLowerCase())) {
	    	System.out.println("The string is palindrome.");
	    } else {
	    	System.out.println("The string is not a palindrome.");
	    }
		
	}
}
