package com.javaprogram.rait;

import java.util.Scanner;

public class forloop6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int count=0;
		
		for(;n!=0; n/=10, ++count) {
		}
		System.out.println(count);
	}
}
