package com.javaprogram.rait;

import java.util.Scanner;

public class function2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a= sc.nextInt();
		
		System.out.println(sum(a));
	}
	
	public static int sum(int a){
		if(a>0) {
			return a+sum(a-1);
		}else {
			return 0;
		}
	}
}


