package classcode;

import java.util.Scanner;

public class action {

	String address;
	static String name;

	public static String takeInput() {
	  
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		name = sc.next();
		return name;
	}
	
	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		action.name = name;
	}

	public static void takeCab() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.next();
		
		System.out.println("Enter your address: ");
		String address = sc.next();
		
		System.out.println("Hello "+name+" welcome to Emirates Airline Services. Your cab is ready to go to "+address);
	}
	
	public static void checkIn() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.next();
		
		System.out.println("Hello "+name+" welcome to Emirates Airline Services. You are ready to checkin now.");
	}

	public static void walk() {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.next();
		
		System.out.println("Hello "+name+" you can now enjoy your walk");
	}

	public static void smile() {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.next();
		
		System.out.println("Hello "+name+" you look good while smiling.");
	}
}
