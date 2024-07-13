package com.javaprogram.rait;

import java.util.Scanner;

public class primeno2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		boolean flag=true;
		
		for(int i=2; i<=n; i++) {
			
			if(n%i == 0) {
				flag = true;
				break;
			}
		}
		
		if(flag && n >1) {
			System.out.println("Number is prime");
		} else {
			System.out.println("The number isnot prime");
		}
	}
}
