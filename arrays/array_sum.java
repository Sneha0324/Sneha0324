package arrays;

import java.util.Scanner;

public class array_sum {

	public static void main(String[] args) {
		int[] arr = {3,2,1,7,5,4};
		int max = 0;
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++ ) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		for(int i=1; i<arr.length; i++ ) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("The largest number is the array is "+max);
		
		System.out.println("The smallest number is the array is "+min);
		
		int add = min + max;
		
		System.out.println("The addition of smallest and largest values of the array is "+add);
	}
}
