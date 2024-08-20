package Threads;
class Demo1 extends Thread{
	Demo1(){
		super();
	}
	Demo1(String name){
		super(name);
	}
	
	public void run() {
		for(int i = 0 ; i<5 ; i++) {
			System.out.println(getName() + "i = " + i);
		}
	}
}
public class Change_name_Priority {

	public static void main(String[] args) {
		Demo1 a = new Demo1();
		Demo1 b = new Demo1("child 2");
		
		System.out.println("Threa 1 initial name and priority : ");
		System.out.println("Name : " + a.getName());
		System.out.println("Priority : "+a.getPriority());
		
		System.out.println("Threa 2 initial name and priority : ");
		System.out.println("Name : " + b.getName());
		System.out.println("Priority : "+b.getPriority());
		
		System.out.println();
		
		a.setName("newChild 1");
		a.setPriority(6);
		b.setName("newChild 2");
		b.setPriority(7);
		
		System.out.println("Threa 1 new name and priority : ");
		System.out.println("Name : " + a.getName());
		System.out.println("Priority : "+a.getPriority());
		
		System.out.println("Threa 2 new name and priority : ");
		System.out.println("Name : " + b.getName());
		System.out.println("Priority : "+b.getPriority());	
	}
}
