package arrays;

public class arr_water {

	public static int maxWater(int[] arr, int n) {
 
        int res = 0; 
  
        for (int i = 1; i < n - 1; i++) { 
  
            // Find max element on its left 
            int left = arr[i]; 
            for (int j = 0; j < i; j++) { 
                left = Math.max(left, arr[j]); 
            } 
  
            // Find max element on its right 
            int right = arr[i]; 
            for (int j = i + 1; j < n; j++) { 
                right = Math.max(right, arr[j]); 
            } 
  
            // Update max water value 
            res += Math.min(left, right) - arr[i]; 
        } 
        return res; 
	}
	
	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }; 
        int n = arr.length; 
  
        System.out.print(maxWater(arr, n)); 
	}
}
