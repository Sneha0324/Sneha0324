package com.javaprogram.rait;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int res=0, n1=0;
		int copy = n;
		
		while(copy>0) {
			n1 = copy%10;
			res = res*10 + n1;
			copy /= 10;
		}
		System.out.println("The reversed number is: "+res);
	}
}
