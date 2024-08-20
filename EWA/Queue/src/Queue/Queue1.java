package Queue;

import java.util.*;

public class Queue1 {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.add("one");
		queue.add("two");
		queue.add("three");
		queue.add("four");
		System.out.println(queue);
		queue.remove("three");
		System.out.println(queue);
		System.out.println(queue.size());
		System.out.println(queue.contains("two"));
		System.out.println("YASH SHARMA 22CSU295");
	}
}
