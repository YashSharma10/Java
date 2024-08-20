package Threads;
class MyThread extends Thread{
	public void run() {
		System.out.println("r1");
		try {
			Thread.sleep(5000);
		}
		catch (InterruptedException e) {
			
		}
		System.out.println("r2 ");
	}
	
}
public class Join_isAlive {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.start();
		System.out.println("t1 is alive : "+t1.isAlive());
		System.out.println("t2 is alive : "+t2.isAlive());
		try {
			t1.join();
			// join ends last thread and start next thread
			System.out.println("t1 is alive : "+t1.isAlive());
		}
		catch(InterruptedException e) {
		}
		t2.start();
		System.out.println("t2 is alive : "+t2.isAlive());
		
	}
}
