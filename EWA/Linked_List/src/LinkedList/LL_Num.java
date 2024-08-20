package LinkedList;

import java.util.*;

public class LL_Num {

	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<>();
		l1.add(51);
		l1.add(55);
		l1.add(54);
		l1.add(59);
		l1.add(62);

		System.out.println("NORMAL");
		Iterator<Integer> itr = l1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("\nDESCENDING");
		Iterator<Integer> itr1 = l1.descendingIterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("YASH SHARMA 22CSU295");
	}

}
