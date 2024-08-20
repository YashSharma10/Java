package Stack;
import java.util.*;
public class Stack_Peek {

	public static void main(String[] args) {
		// Peek
		Stack<Integer> s1 = new Stack<>();
		s1.push(340);
		s1.push(380);
		s1.push(490);
		s1.push(500);
		System.out.println("Elements in Stack 1 : ");
		while(!s1.empty()) {
			System.out.println(s1.peek());
			s1.pop();
		}
		
		
		// Search
		Stack<String> s2 = new Stack<>();
		s2.push("Yash");
		s2.push("Akul");
		s2.push("Mohit");
		s2.push("Yash");
		s2.push("Sunny");
		System.out.println("Elements in Stack 2 : " + s2);
		
		int location = s2.search("Yash");
		System.out.println("Location of YASH is : " + location);
		int location1 = s2.search("XYZ");
		System.out.println("Location of Element not present is : " + location1);
		System.out.println("YASH SHARMA 22CSU295");
		
	}

}
