package LinkedList;

import java.util.*;

public class LL_Search {

	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<>();
		l1.add(51);
		l1.add(55);
		l1.add(54);
		l1.add(59);
		l1.add(62);

		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER ELEMENT TO SEARCH");
		int a = sc.nextInt();
		int b = -1;

		for (int i = 0; i < l1.size(); i++) {
			int element = l1.get(i);
			if (a == element) {
				b = i;
				break;
			}
		}
		if (b == -1) {
			System.out.println("NUMBER NOT FOUND");
		} else {
			System.out.println("NUMBER FOUND AT INDEX : " + b);
		}
		System.out.println("YASH SHARMA 22CSU295");
	}

}
