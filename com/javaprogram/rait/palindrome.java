package com.javaprogram.rait;

public class palindrome {
	public static void main(String[] args) {
		
		int num=353, reminder=0, reverse=0;
		
	    int n = num;
		
		while(n!=0) {
			reminder = n%10;
			reverse = reverse * 10 + reminder;
			n /=10;
		}
		
		if(reverse==num) {
			System.out.println("The number is palindrome.");
		} else {
			System.out.println("The number is not a palindrome.");
		}
	}
}
