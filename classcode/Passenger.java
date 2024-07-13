package classcode;

import java.util.Scanner;

public class Passenger {

	public static void main(String[] args) {
		
		action a = new action();
		
		action n= new action();
		String input = n.takeInput();
		
		System.out.println("Hello "+n.getName());
		
		System.out.println("Select your choice: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Take Cab \n 2. Check-In \n 3. Walk \n 4. Smile");
		int ch = sc.nextInt();
				
		switch (ch) {
		 
		case 1 :
			a.takeCab();
			break;
			
		case 2: 
			a.checkIn();
			break;
			
		case 3:
			a.walk();
			break;
			
		case 4:
			a.smile();
			break;
			
		default:
			System.out.println("Error");
		}
	}
}
