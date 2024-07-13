package exception_handling;

public class exception2 {

	public static void main(String[] args) {
		int age = 2;
		
		if(age<18) {
			throw new ArithmeticException("Access denied- You must be atleast 18 years old."); //shows error block
		} else {
			System.out.println("You are eligible to vote.");
		}
	}
}
