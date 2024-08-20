package Set;
import java.util.*;
public class Subset {

	public static void main(String[] args) {
		// we got two sets elements of set 1 are 22 to 28 check whether set2 is subset of set 1 and set 2 has elements 10 and 12
		Set<Integer> s1 = new HashSet<>();
		s1.add(22);
		s1.add(23);
		s1.add(24);
		s1.add(25);
		s1.add(26);
		s1.add(27);
		s1.add(28);
		System.out.println("set 1 : " + s1);
		
		
		Set<Integer> s2 = new HashSet<>();
		s2.add(10);
		s2.add(12);
		System.out.println("set 2 : " + s2);
		
		System.out.println("Is set 2 subset of set 1 : " + s1.containsAll(s2));
		
		System.out.println("YASH SHARMA 22CSU295");
	}

}
