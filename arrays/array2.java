package arrays;

import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		int[] arr = {7,10,4,3,20,15};
		int n = arr.length;
		int i;
		java.util.Arrays.sort(arr);
		
		System.out.println("The sorted array is "+java.util.Arrays.toString(arr));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index number: ");
		int index = sc.nextInt();
		
		for(i=0; i<=n-1; i++) {
			if(arr[i]==arr[index]) {
				System.out.println(arr[index-1]);
			}
		}
		
	}
}
