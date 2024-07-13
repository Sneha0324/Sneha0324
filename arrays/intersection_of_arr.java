package arrays;

public class intersection_of_arr {

	public static void main(String[] args) {
		int[] x = {1,2,4,3};
		int[] y = {1,5,7,4};
		int a = x.length;
		int b = y.length;

		for(int i=0; i<=a-1; i++) {
			
			for(int j=0; j<=b-1; j++) {
				
				if(x[i]==y[j]) {
					System.out.println(x[i]+" ");
				}
			}
		}
	}
}
