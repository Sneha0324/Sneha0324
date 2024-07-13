//Another way to create a thread is by extending the Thread class and overriding its run() method.
//The thread can be run by creating an instance of the class and call its start() method.

package multi_threading;

public class Task_thread extends Thread {

	@Override
	public void run() {
		System.out.println(" Task 4 starts . . . ");
		for(int i=400; i<=499; i++ ) {
			System.out.print(i + " ");
		}
		System.out.println("Task 4 Completed  . . .");
		
	}
	
}
