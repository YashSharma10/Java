package Set;

import java.util.*;

public class Hashset {

	public static void main(String[] args) {
		// creating set1 using HashSet class
		Set<Integer> set1 = new HashSet<>();
		set1.add(4);
		set1.add(7);
		set1.add(3);
		System.out.println("set 1 : " + set1);
		Iterator<Integer> itr = set1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		// creating set2 using HashSet class
		Set<Integer> set2 = new HashSet<>();
		set2.add(5);
		set2.add(9);
		set2.add(8);
		System.out.println("set 2 : " + set2);
		Iterator<Integer> itr1 = set2.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		// Union of two sets
		set2.addAll(set1);
		System.out.println("Union / Updated set 2: " + set2);

		// subset of two
		System.out.println(set2.containsAll(set1));

		// complement of two sets
		set2.retainAll(set1);
		System.out.println("Complement / Updated set 2: " + set2);
		System.out.println("YASH SHARMA 22CSU295");
	}

}
