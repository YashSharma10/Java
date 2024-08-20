package Stack;

import java.util.*;

public class Stack_Iterator {

	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<>();
		s1.push(340);
		s1.push(380);
		s1.push(490);
		s1.push(500);
		Iterator<Integer> itr = s1.iterator();
		while(itr.hasNext()) {
			System.out.println(s1.peek());
			s1.pop();
			}
		System.out.println("YASH SHARMA 22CSU295");

	}

}
