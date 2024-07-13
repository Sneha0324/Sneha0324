package arrays;
import java.util.Arrays;
public class wave_arr {

	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
	}
	
	public void sort(int[] arr, int n) {
		Arrays.sort(arr);
		 
        // Swap adjacent elements
        for (int i=0; i<n-1; i += 2)
            swap(arr, i, i+1);
	}
	
	public static void main(String[] args) {
		wave_arr ob = new wave_arr();
		
		int arr[] = {10, 90, 49, 2, 1, 5, 23};
        int n = arr.length;
        ob.sort(arr, n);
        for (int i : arr)
            System.out.print(i +" ");

	}
}
