package LinkedList;

import java.util.*;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<>();
		l1.add("YASH");
		l1.add("SHIVAM");
		l1.add("MOHIT");
		l1.add("AKUL");
		
		System.out.println(l1);
		
		Iterator<String> itr = l1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		l1.remove(1);
		System.out.println(l1);
		System.out.println("YASH SHARMA 22CSU295");
	}

}
