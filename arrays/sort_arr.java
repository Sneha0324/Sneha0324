package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class sort_arr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		
		System.out.println("Enter the array elements: ");
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The elements of the array are ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		
		java.util.Arrays.sort(arr);
		
		System.out.println("Sorted Array: "+java.util.Arrays.toString(arr));
	}

	private static int[] sort(int[] arr) {
		// TODO Auto-generated method stub
		return null;
	}
}
