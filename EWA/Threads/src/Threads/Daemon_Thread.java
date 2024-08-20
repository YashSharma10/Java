package Threads;
class DaemonDemo extends Thread{
	String n;
	public DaemonDemo(String name) {
		n = name;
	}
	public void run(){
		if(Thread.currentThread().isDaemon()) {
			System.out.println(n+" is daemon thread");
		}
		else {
			System.out.println(n+" is user thread");
		}
	}
}
public class Daemon_Thread {

	public static void main(String[] args) {
		DaemonDemo a = new DaemonDemo("String 1");
		DaemonDemo b = new DaemonDemo("String 2");
		DaemonDemo c = new DaemonDemo("String 3");
		
		a.setDaemon(true);
		b.setDaemon(true);
		a.start();
		b.start();
		c.start();
		

	}

}
