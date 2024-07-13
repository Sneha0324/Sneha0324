package arrays;

public class stock_profit_price {

	public static int profit(int[] arr, int start, int end) {
		if(start >= end) {
			return 0;
		}
		
		int profit = 0;
		
		for(int i=start; i<end; i++) {
			for(int j=i+1; j<=end; j++) {
				if(arr[j]>arr[i]) {
					int current = arr[j] - arr[i] + profit(arr,start,i-1) + profit(arr,j+1,end);
					
					profit = Math.max(profit, current);
				}
			}
		}
		return profit;
	}
	
	public static void main(String[] args) {
		int[] arr = {100,180,260,310,40,535,695};
		int n = arr.length;
		
		System.out.println(profit(arr,0,n-1));
	}
}
