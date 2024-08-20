package Threads;
class ThreadsDemo implements Runnable{
	public void run() {
		try {
			// Display the thread that is running
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");
		}
		catch(Exception e){
			// throw exception
			System.out.println("Exception is caught");
		}
	}
}
public class Thread1 {

	public static void main(String[] args) {
		int n = 8;
		for(int i = 0 ; i<n ; i++) {
			Thread obj = new Thread(new ThreadsDemo());
			obj.start();
		}

	}

}
