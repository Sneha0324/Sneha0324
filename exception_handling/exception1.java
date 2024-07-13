package exception_handling;

public class exception1 {

	public static void main(String[] args) {
		try {
			System.out.println("This is exception handling code.");
			int[] arr = {1,2,3,4};
			System.out.println(arr[10]);
		} catch(Exception e) {
			System.out.println("Check the index for the array to be found.");
			e.printStackTrace(); //shows the error
		} finally {
			System.out.println("This is the finally section");
		}
	}
}
