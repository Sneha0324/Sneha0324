package com.javaprogram.rait;

public class pattern1 {
	public static void main(String[] args) {
		
		for(int i=5; i>=1; --i) {
			for(int space=1; space<=5-i; ++space) {
				System.out.print(" ");
			}
			
			for(int j=i; j<=2*i-1; ++j) {
				System.out.print("*");
			}
			
			for(int j=0; j<i-1; ++j) {
				System.out.print("*");
			}
			
			
			System.out.println();
		}
	}
}
