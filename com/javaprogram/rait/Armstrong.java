package com.javaprogram.rait;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int no = sc.nextInt();
		
		int remainder, result=0;
		int copy_of_no = no;
		
		while(copy_of_no!=0) {
			remainder = copy_of_no%10;
			result +=Math.pow(remainder,3);
			copy_of_no /= 10; 
		}
		
		if(result == no) {
			System.out.println(no+" is an armstrong number.");
		} else {
			System.out.println(no+" is not an armstrong number.");
		}
	}
}
