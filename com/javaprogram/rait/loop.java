package com.javaprogram.rait;

import java.util.Scanner;

public class loop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x="karan";
		
		System.out.println("Enter the name: ");
		
		String y =sc.nextLine();
		
		if(x.equals(y)) {
			System.out.println("Correct");
		}
		else {
			System.out.println("Incorrect");
		}
	}
}
