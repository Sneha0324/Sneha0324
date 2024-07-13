package com.javaprogram.rait;

import java.util.Scanner;

public class function {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
		int a= sc.nextInt();
		int b= sc.nextInt();
		
		myMethod(a,b);
	}
	
	public static void myMethod(int a, int b){
		int add = a+b;
		System.out.println("Addition: "+add);
	}
}


