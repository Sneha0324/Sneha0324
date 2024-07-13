package com.javaprogram.rait;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int even=0, odd=0;
		char choice;
		
		do {
			System.out.println("Enter the range: ");
			int n = sc.nextInt();
			
			if(n%2==0) {
				even += n;
			} 
			else {
				odd +=n;
			}
			
			System.out.print("Do you want to continue? ");
			choice = sc.next().charAt(0);
		}while(choice=='y' || choice=='Y');
			
	     System.out.println("The sum of even numbers is "+even);
	     System.out.println("The sum of odd numbers is "+odd);
	}
}
