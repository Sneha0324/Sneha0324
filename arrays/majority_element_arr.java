package arrays;

public class majority_element_arr {

	public static void main(String[] args) {
		int[] arr = {3,3,4,2,4,4,2,4,4};
		int n = arr.length;
		int count = 0;
		int maxCount = 0;
		int index = -1;

		
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-1; j++) {
				
				 if (arr[i] == arr[j])
	                    count++;
			}
	
			 if (count > maxCount) {
	                maxCount = count;
	                index = i;
	            }
		}
		 if (maxCount > n / 2)
	            System.out.println(arr[index]);
	 
	        else
	            System.out.println("No Majority Element");
	}
}
