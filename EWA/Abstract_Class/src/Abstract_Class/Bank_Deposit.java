package Abstract_Class;

import java.util.Scanner;

abstract class Bank {
	abstract public void getBalance();
}

class ABank extends Bank {
	public void getBalance() {

		System.out.println("$100 are Deposited in the Bank");
	}
}

class BBank extends Bank {
	public void getBalance() {

		System.out.println("$150 are Deposited in the Bank");
	}
}

class CBank extends Bank {
	public void getBalance() {
		System.out.println("$200 are Deposited in the Bank");
	}
}

public class Bank_Deposit {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for Bank A");
		System.out.println("Press 2 for Bank B");
		System.out.println("Press 3 for Bank C");
		int n = sc.nextInt();
		Bank a = new ABank();
		Bank b = new BBank();
		Bank c = new CBank();
		switch (n) {
		case 1:
			a.getBalance();
			break;
		case 2:
			b.getBalance();
			break;
		case 3:
			c.getBalance();
			break;
		default:
			System.out.println("Wrong choice");
		}
		System.out.println("YASH SHARMA 22CSU295");
	}
}