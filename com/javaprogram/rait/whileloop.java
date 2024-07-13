package com.javaprogram.rait;

import java.util.Scanner;

public class whileloop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks: ");
		int m = sc.nextInt();
		
		while(m<60) {
			System.out.print("The application is rejected");
			m++;
		}
	}
}

