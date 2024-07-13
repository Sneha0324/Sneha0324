package com.javaprogram.rait;

import java.util.Scanner;

public class exchange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		System.out.println("First number is "+n1);
		System.out.println("Second number is "+n2);
		
		int temp=0;
		
		temp = n1;
		n1 = n2;
		n2 = temp;
		
		System.out.println("After swapping the first number is "+n1);
		System.out.println("After swapping the second number is "+n2);
	}
}
