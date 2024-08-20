package Threads;

class Abcd extends Thread {
	Thread t;
	String name;

	Abcd(String name) {
		this.name = name;
		System.out.println("creating " + name);
	}

	public void run() {
		try {
			for (int i = 4; i > 0; i--) {
				System.out.println("running " + name);
				System.out.println("Thread : " + name + ", " + i);
				Thread.sleep(5000);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread " + name + " interrupted");
		}
		System.out.println("Thread " + name + " exiting");
	}
}

public class Sleep {
	public static void main(String[] args) {
		Abcd t1 = new Abcd("Thread 1");
		t1.start();
		Abcd t2 = new Abcd("Thread 2");
		t2.start();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());

	}

}
