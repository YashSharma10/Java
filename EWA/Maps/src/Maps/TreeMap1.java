package Maps;
import java.util.*;
public class TreeMap1 {
	// always use EntrySet with TreeMap
	public static void main(String[] args) {
		// treeMap
		Map<Integer,String> map = new TreeMap<>();
		map.put(1,"rahul");
		map.put(2,"aman");
		map.put(3,"kush");
		map.put(4,"rahul");
		map.put(5,"rajat");
		System.out.println("before invoking remove() method");
		for(Map.Entry m : map.entrySet()) 
		{
			System.out.println(m.getKey()+ ". "+m.getValue());
		}
		
		// descending order
		System.out.println("Descending order ");
		Map<Integer,String> map1 = new TreeMap<>(Collections.reverseOrder());
		map1.putAll(map);
		for(Map.Entry m : map1.entrySet()) 
		{
			System.out.println(m.getKey()+ ". "+m.getValue());
		}
		
		// remove 
		map.remove(2);
		System.out.println("after invoking remove() method");
		for(Map.Entry m : map.entrySet()) 
		{
			System.out.println(m.getKey()+ ". "+m.getValue());
		}
		System.out.println("YASH SHARMA 22CSU295");
	}

}