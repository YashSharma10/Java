package Stack;

import java.util.*;

public class Stack1 {

	public static void main(String[] args) {
		// Stack of Integer
		Stack<Integer> s1 = new Stack<>();
		boolean result = s1.empty();
		System.out.println("Is Stack Empty : " + result);
		s1.push(5);
		s1.push(6);
		s1.push(8);
		s1.push(9);
		System.out.println("Elements in Stack 1 : " + s1);
		result = s1.empty();
		System.out.println("Is Stack Empty : " + result);
		s1.pop();
		s1.pop();
		System.out.println("Elements in Stack 1 : " + s1);

		
		// Stack of String
		Stack<String> s2 = new Stack<>();
		s2.push("Yash");
		s2.push("Akul");
		s2.push("Mohit");
		s2.push("Sunny");
		System.out.println("Elements in Stack 2 : " + s2);
		System.out.println("YASH SHARMA 22CSU295");
		
	}

}
