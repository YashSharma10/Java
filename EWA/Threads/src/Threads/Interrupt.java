package Threads;
class InterruptsDemo extends  Thread{
	public void run() {
		try {
			Thread.sleep(5000);
			System.out.println("Welcome to EWA");
		}
		catch(InterruptedException e) {
			throw new RuntimeException("Thread interrupted");
		}
	}
}
public class Interrupt {

	public static void main(String[] args) {
		InterruptsDemo a = new  InterruptsDemo();
		a.start();
		try {
			a.interrupt();
		}
		catch(Exception e) {
			System.out.println("Exception Handled .."+e);
		}

	}

}
