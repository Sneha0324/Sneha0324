package arrays;

import java.util.Scanner;

public class occurrences {

	public static int occur(int[] arr, int n, int x) {
		int i,j;
		int count = 0;
		
		for(i=0; i<=n-1; i++) {	
				if(x == arr[i]) {
					count++;
				}	
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,1,2,2,2,2,2,3};
		int n = arr.length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nuber whose frequency is to be found: ");
		int x = sc.nextInt();
		System.out.println(occur(arr,n,x));
	}
}
