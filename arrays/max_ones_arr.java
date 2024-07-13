package arrays;

public class max_ones_arr {

	static int r = 4;
	static int c = 4;
	public static void main(String[] args) {
		int[][] arr = {{0,1,1,1},{0,0,1,1},{1,1,1,1},{0,0,0,0}};
		int n = arr.length;
		
		System.out.println("Index of row with maximaum 1s is "+row(arr,n,r,c));
	}
	
	public static int row(int[][] arr, int n, int r, int c) {
		
		boolean flag =true;
		int max_index = 0, max_ones=0;
		int count = 0;
		int i, j;
		
		for(i=0;i<=n-1;i++) {
			
			for(j=0;j<=n-1;j++) {
				if(arr[i][j]==1) {
					flag = false;
					count++;
				}
			}
			
			if(count>max_ones) {
				max_ones = count;
				max_index = i;
			}
			if(flag) {
				return -1;
			}
		}
		return max_index;
	}
}
