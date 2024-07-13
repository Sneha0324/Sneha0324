package arrays;

public class second_largest_arr {

	public static void main(String[] args) {
		int[] a = {1,3,5,6,8,9,7};
		int largest = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for(int n : a) {
			if(n>largest) {
				second = largest;
				largest = n;
			} else if(n>second && n!=largest) {
				second = n;
			}                                                                                                
		}
		System.out.println("The second largest number is "+second);
	}
}
