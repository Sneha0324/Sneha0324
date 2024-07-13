package com.javaprogram.rait;

import java.util.Scanner;

public class cal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the operator: +,-,*,/");
		char operator = sc.next().charAt(0);
		
		System.out.println("Enter the number 1: ");
		int n1 = sc.nextInt();
		
		System.out.println("Enter the number 2: ");
		int n2 = sc.nextInt();
		
		switch (operator) {
		case '+' :
			int sum = n1+n2;
			System.out.println("The sum is "+sum);
			break;
			
		case '-' :
			int sub=n1-n2;
			System.out.println("The subtraction is "+sub);
			break;
			
		case '*' :
			int mul = n1*n2;
			System.out.println("The multiplication is "+mul);
			break;
			
		case '/' :
			int div= n1/n2;
			System.out.println("The division is "+div);
			break;
			
		default:
			System.out.println("Error");
		}
		
	}
}
