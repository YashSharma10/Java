package Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Difference {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(5);
		queue.add(6);
		queue.add(8);
		queue.add(2);
		System.out.println("Queue is : "+queue);
		System.out.println("Removing element"+ queue.remove());
		System.out.println("Queue is : "+queue);
		
		
		PriorityQueue<Integer> queue1 = new PriorityQueue<>();
		queue1.add(5);
		queue1.add(6);
		queue1.add(8);
		queue1.add(2);
		System.out.println("Queue is : "+queue1);
		System.out.println("YASH SHARMA 22CSU295");
	}

}
