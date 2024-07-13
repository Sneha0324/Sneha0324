package com.javaprogram.rait;

public class ternery {
	public static void main(String[] args) {
		char ch = 'a';
		
		String Output = (ch>='a' && ch<='z') || (ch>='A' && ch<='Z')
				? ch + " is an alphabet."
		        : ch + " is not an alphabet.";
		
		System.out.println(Output);
	}
}

// condition? true:false;
/*String Output = (ch>='a' && ch<='z') || (ch>='A' && ch<='Z')? ch + " is an alphabet." : ch + " is not an alphabet.";*/