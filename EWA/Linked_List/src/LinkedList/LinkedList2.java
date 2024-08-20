package LinkedList;
import java.util.*;
public class LinkedList2 {

	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<>();
		l1.addFirst("YASH");
		l1.addLast("SHIVAM");
		
		Iterator<String> itr = l1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("YASH SHARMA 22CSU295");
	}

}
