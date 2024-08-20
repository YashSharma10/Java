package ArrayList;
import java.util.*;
public class Iterator {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(66);
		numbers.add(45);
		numbers.add(35);
		numbers.add(84);
		System.out.println("ArrayList:" + numbers);
		
		java.util.Iterator<Integer> itr = numbers.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("YASH SHARMA 22CSU295");

	}

}
