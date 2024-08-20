package Threads;

class MultiThreading extends Thread{
	private int number;

	// create constructor
	MultiThreading(int number){
		this.number= number;
	}
	public void run() {
		int counter = 0;
		int num = 0;
		do {
			num = (counter+10);
			System.out.println(this.getName()+" prints "+num);
			counter++;
		}
		while(num!=number);
		System.out.println(this.getName()+" printed "+counter+" times");
	}
}

public class Thread2 {

	public static void main(String[] args) {
		System.out.println("Starting Thread 1...");
		//Created a thread class instance
		Thread t1= new MultiThreading(15);
		t1.start();
		System.out.println("Starting Thread 2...");
		Thread t2= new MultiThreading(20);
		t2.start();
		

	}

}