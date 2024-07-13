//Two numbers are entered through the keyboard. 
//Write a program to find the value of one number raised to the power of another.

package com.javaprogram.rait;
import java.util.Scanner;

public class mul {
	    public static void main(String[] args) {
	        int mul=1;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number: ");
	        int n1 = sc.nextInt();
	        
	        System.out.println("Enter the power: ");
	        int n2 = sc.nextInt();
	        
	        for(int i=1; i<=n2; i++){
	            mul *=n1;
	        }
	        
	        System.out.println(mul);
	    }
	
}
