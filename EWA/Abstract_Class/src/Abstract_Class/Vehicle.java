package Abstract_Class;

abstract class Bike {
	Bike() {
		System.out.println("Bike is created");
	}

	abstract void run();

	void changeGear() {
		System.out.println("gear changed");
	}
}

class Honda extends Bike {
	void run() {
		System.out.println("running smootly..");
	}
}

public class Vehicle {
	public static void main(String args[]) {
		Bike obj = new Honda();
		obj.run();
		obj.changeGear();
		System.out.println("YASH SHARMA 22CSU295");
	}

}