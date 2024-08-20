package Set;
import java.util.*;
public class Treeset {

	public static void main(String[] args) {
		Set<Integer> set1 = new TreeSet<>();
		set1.add(4);
		set1.add(8);
		set1.add(3);
		System.out.println("Set 1 : " + set1);
	
		System.out.println("Set 1 in ascending order ");
		Iterator<Integer> itr = set1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		System.out.println("Set 1 in descending order ");
		Iterator<Integer> itr1 = ((TreeSet<Integer>) set1).descendingIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
			
		}
		System.out.println("YASH SHARMA 22CSU295");
	}

}
