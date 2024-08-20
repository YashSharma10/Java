package Queue;

import java.util.*;

public class Queue2 {

	public static void main(String[] args) {
		Queue<String> q1 = new LinkedList<>();
		q1.offer("YASH");
		q1.offer("MOHIT");
		q1.offer("AKUL");
		q1.offer("SUNNY");
		Iterator<String> itr = q1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		q1.remove();
		q1.poll();
		System.out.println("after removing 2 elements");
		Iterator<String> itr1 = q1.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("YASH SHARMA 22CSU295");
	}

}
