package ArrayList;

import java.util.*;

public class Get_Index {

	public static void main(String[] args) {
		// Question – create an array list of 5 elements 1. Database 2. JDBC 3.
		// Connectivity 4. Oracle 5. NoSQL
		// get index value of each element
		// change value of NoSql by Junkings
		ArrayList<String> list = new ArrayList<>();
		list.add("Elements");
		list.add("Database");
		list.add("JDBC");
		list.add("Connectivity");
		list.add("NoSQL");

		// to get index
		for (String a : list) {
			int index = list.indexOf(a);
			System.out.println("Index " + index + " : " + a);

		}

		System.out.println("\n");
		// to change value

		list.set(4, "Junkings");
		for (String a : list) {
			int index = list.indexOf(a);
			System.out.println("Index " + index + " : " + a);

		}
		System.out.println("YASH SHARMA 22CSU295");

	}

}
