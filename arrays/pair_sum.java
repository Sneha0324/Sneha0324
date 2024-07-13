package arrays;

import java.util.Scanner;

public class pair_sum {

	public static void main(String[] args) {
		int arr[] = {1,5,7,-1};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int k = sc.nextInt();
		int n = arr.length;
		int i, j, count = 0;
		
		for(i=0; i<=n-1;  i++) {
			for(j=0; j<=n-1; j++) {
				if(arr[i]+arr[j] == k) {
					count++;
				}
			}
		}
		if(count!=1) {
			count /= 2;
		}
		System.out.println(count);
	}
}
