package com.javaprogram.rait;

import java.util.Random;

public class String_Buffer {

	public static void main(String[] args) {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		StringBuffer sb = new StringBuffer();
		
		Random random = new Random();
		
		int length = 7;
		
		for(int i=0; i<length; i++) {
			int index = random.nextInt(alphabet.length());
			
			char randomChar = alphabet.charAt(index);
			
			sb.append(randomChar);
		}
		
		String randomString = sb.toString();
		System.out.println("Random String is "+randomString);
	}
}
