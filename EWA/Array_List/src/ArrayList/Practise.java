package ArrayList;
import java.util.*;
public class Practise {

	public static void main(String[] args) {
		
		//Question – create an array list of 5 elements 1. Database 2. JDBC  3. Connectivity 4. Oracle 5. NoSQL 
		//1.	Iterate or traverse through all elements using for each element
		//2.	Sorting in ascending as well as descending order
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Elements");
		list.add("Database");
		list.add("JDBC");
		list.add("Connectivity");
		list.add("NoSQL");
		
		//traverse
		
		for(String list1:list) {
			System.out.println(list1);
		}
		
		//sort ascending
		
		Collections.sort(list);
		System.out.println(list);
		
		//sort descending
		Collections.sort(list , Collections.reverseOrder());
		System.out.println(list);
		System.out.println("YASH SHARMA 22CSU295");

	}

}
