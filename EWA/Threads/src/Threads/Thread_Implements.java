package Threads;

class ThreadsDemo1 implements Runnable {
	public void run() {
		System.out.println("Threads is under running...");
		for (int i = 0; i <= 10; i++) {
			System.out.println("i = " + i);
		}
	}
}

public class Thread_Implements {

	public static void main(String[] args) {
		ThreadsDemo1 obj = new ThreadsDemo1();
		Thread thread = new Thread(obj);
		System.out.println("Thread is about to Start");
		thread.start();
	}
}
