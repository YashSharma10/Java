package Threads;

class ThreadsDemo4 implements Runnable {
	public void run() {
		try {
			// Display the thread that is running
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");
		} catch (Exception e) {
			// throw exception
			System.out.println("Exception is caught");
		}
	}
}

public class Check_Priority {

	public static void main(String[] args) {

		Thread obj = new Thread(new ThreadsDemo());
		obj.start();
		// priority of main thread is 5
		// 1 means least priority , 5 is default priority , 10 is max priority
		System.out.println("Priority of thread 1 : " + obj.getPriority());
		obj.setPriority(7);
		System.out.println("New Priority of thread 1 : " + obj.getPriority());

		Thread obj1 = new Thread(new ThreadsDemo());
		obj1.start();
		System.out.println("\nPriority of thread 2 : " + obj1.getPriority());
		obj1.setPriority(Thread.MIN_PRIORITY);
		System.out.println("New Priority of thread 2: " + obj1.getPriority());

		Thread obj2 = new Thread(new ThreadsDemo());
		obj2.start();
		System.out.println("\nPriority of thread 3 : " + obj2.getPriority());
		obj2.setPriority(Thread.MAX_PRIORITY);
		System.out.println("New Priority of thread 3: " + obj2.getPriority());
	}

}