package multi_threading;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		int i;
		
		System.out.println("Task 1 START");
		for(i=100; i<=199; i++) {
			System.out.print(i+" ");
		}
		System.out.println("Task 1 FINISHED");
		
		/*System.out.println("Task 2 START");
		for(i=200; i<=299; i++) {
			System.out.print(i+" ");
		}
		System.out.println("Task 2 FINISHED");*/
		
		Task_thread task4 = new Task_thread();
		task4.start();
		
		thread_runnable obj = new thread_runnable();
		Thread Thread = new Thread(obj);
		Thread.start();
		Thread.sleep(1000); // tells how long the task has to wait in milliseconds.
		//Thread.join(); --> the tasks runs sequentially.
		
		System.out.println("Task 3 START");
		for(i=300; i<=399; i++) {
			System.out.print(i+" ");
		}
		System.out.println("Task 3 FINISHED");
		
	}
}
