//one way to implement thread is to create a Runnable interface and then the thread can be run by passing an instance of the 
//class to a Thread object's constructor and then calling the thread's start() method

package multi_threading;

public class thread_runnable implements Runnable{

	@Override
	public void run() {
		System.out.println(" Task 2 starts . . . ");
		for(int i=200; i<=299; i++ ) {
			System.out.print(i + " ");
		}
		System.out.println("Task 2 Completed  . . .");
		
	}

}



