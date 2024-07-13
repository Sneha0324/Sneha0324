package com.javaprogram.rait;

import java.util.Scanner;

public class power_of_four {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer: ");
		double x = sc.nextDouble();
		boolean res = false;
		
		if(x!=0 && x==Math.pow(4, (Math.log(x)/Math.log(4)))) {
			res = true;
			} else if(x==1) {
				res = true;
				} else {
					res = false;
					}
		
		System.out.println(res);
		
		/*power_of_four obj = new power_of_four();
		
		if(obj.power(x)) {
			System.out.println(x+" is true");
		} else {
			System.out.println(x+" is false");
		}
		
	}
	
		public boolean power(double x) {
		
			do  
			{  
			if(x == 1)  
			{  
			return true;  
			}  
			else if(x % 4 == 0)  
			{  
			x = x / 4;      
			}  
			else  
			{  
			return false;  
			}  
			  
			}while(true);*/ 
		} 
		

}
