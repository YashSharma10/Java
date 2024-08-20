package LinkedList;

import java.util.*;

public class LL_String_Search {

	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<>();
		l1.add("YASH");
		l1.add("SHIVAM");
		l1.add("MOHIT");
		l1.add("AKUL");

		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER NAME TO SEARCH");
		String a = sc.next();

		boolean contains = l1.contains(a);
		if (contains) {
			System.out.println("ITEM FOUND AT INDEX : " + l1.indexOf(a));
		} else {
			System.out.println("ITEM NOT FOUND");
		}
		System.out.println("YASH SHARMA 22CSU295");
	}

}
