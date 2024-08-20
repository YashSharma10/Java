package ArrayList;

import java.util.*;

public class Transverse_num {
	public static void main(String args[]) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		System.out.println("ArrayList:" + numbers);
		System.out.print("Updated ArrayList: ");
		// multiply each element by 2
		// using the lambda expression
		numbers.forEach((e) -> {
			e = e * 2;
			System.out.print(e + " ");
			
		});
		System.out.println("YASH SHARMA 22CSU295");
	}
}