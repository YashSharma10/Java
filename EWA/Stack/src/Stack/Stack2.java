package Stack;
import java.util.*;
public class Stack2 {

	public static void main(String[] args) {
		//create a stack of these 5 elements 1. EWS 2. AZURE 3. GCP 4. BIG DATA 5. MACHINE LEARNING 
		//REMOVE TWO ELEMENTS FROM TOP AND RETRIEVE ELEMENT FROM TOP
		
		Stack<String> s1 = new Stack<>();
		s1.push("EWS");
		s1.push("AZURE");
		s1.push("GCP");
		s1.push("BIG DATA");
		s1.push("MACHINE LEARNING");
		System.out.println(s1);
		s1.pop();
		System.out.println(s1);
		s1.pop();
		System.out.println(s1);
		System.out.println(s1.peek());
		System.out.println(s1.size());
		System.out.println(s1.capacity());
		
		
		
		
		// initially capacity of stack is 10 but if we add more than 10 elements its size gets doubled
		s1.push("EWS");
		s1.push("AZURE");
		s1.push("GCP");
		s1.push("BIG DATA");
		s1.push("MACHINE LEARNING");
		s1.push("EWS");
		s1.push("AZURE");
		s1.push("GCP");
		s1.push("BIG DATA");
		s1.push("MACHINE LEARNING");
		
		System.out.println(s1.size());
		System.out.println(s1.capacity());
		System.out.println("YASH SHARMA 22CSU295");
	}

}
