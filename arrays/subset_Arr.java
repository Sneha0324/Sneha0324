package arrays;

public class subset_Arr {

	public static boolean isSubset(int[] arr1, int[] arr2, int m, int n) {
		int i, j;
		for(i=0; i<n-1; i++) {
			for(j=0; j<m-1; j++) {
				if(arr1[i]==arr2[j]) {
					break;
				}
				if(j==m) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] arr1 = {11,1,13,21,3,7}, arr2 = {13,3,7,1};
		int n = arr1.length;
		int m = arr2.length;
		boolean flag = false;
		
		
		if(isSubset(arr1, arr2, m, n)) {
			System.out.println("Array 2 is subset of Array 1");
		}else {
			System.out.println("Array 2 is not a subset of Array 1");
		}
		
	}
}
