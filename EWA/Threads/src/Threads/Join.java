package Threads;
class Xyz extends Thread{
	public void run() {
		for(int i = 1 ; i<5 ; i++) {
			System.out.println("child thread i = " + i);
		}
		System.out.println("Exhibiting from my thread");
	}
}
public class Join {

	public static void main(String[] args) {
		Xyz t = new Xyz();
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
		}
		for(int i = 1 ; i<5 ; i++) {
			System.out.println("main thread i = " + i);
		}
		System.out.println("Exhibiting from my thread");
	}

}
