package ArrayList;

import java.util.*;

public class Multiply {
	public static void main(String args[]) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(12);
		numbers.add(13);
		numbers.add(5);
		numbers.add(10);
		numbers.add(7);
		System.out.println("numbers before multiplying by 10");
		numbers.forEach((n) -> print(n));
		System.out.println("numbers after multiplying by 10");
		numbers.forEach((n) -> {
			n = n * 10;
			print(n);
			
		}
		);
		System.out.println("YASH SHARMA 22CSU295");

	}

	public static void print(int n) {
		System.out.println(n);
		
	}
}