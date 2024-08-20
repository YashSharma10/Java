package ArrayList;

import java.util.*;

public class Sorting {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("JAVA");
		list.add("SUPPORTS");
		list.add("PLATFORM");
		list.add("INDEPENDENCE");
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(5);
		list1.add(4);
		
		System.out.println("BEFORE SORTING\n");
		System.out.println(list);
		System.out.println(list1);
		
		Collections.sort(list);
		System.out.println("\nAFTER SORTING\n");
		for (String properties : list) {
			System.out.println(properties);
		}
			
		Collections.sort(list1);
		System.out.println("\nAFTER SORTING\n");
		for (Integer properties1 : list1) {
			System.out.println(properties1);
		}
		System.out.println("YASH SHARMA 22CSU295");
	}

}
