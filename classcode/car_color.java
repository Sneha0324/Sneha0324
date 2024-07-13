package classcode;

import java.util.Scanner;

public class car_color {

	static String name= "BMW";
	
	public static void color() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the color of the car: ");
		String col = sc.next();
		
		System.out.println("The color of the car "+name+ " is "+col);
	}
}
