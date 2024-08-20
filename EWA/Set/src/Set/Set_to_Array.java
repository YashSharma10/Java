package Set;
import java.util.*;
public class Set_to_Array {
	public static void main(String[] args) {
		Set<String> s1 = new HashSet<>();
		s1.add("Yash");
		s1.add("Mohit");
		s1.add("Akul");
		System.out.println("set 1 : " + s1);
		
		String[] str = new String[s1.size()];
		s1.toArray(str);
		for(String strr : str) {
			System.out.println(strr);
		}
		System.out.println("YASH SHARMA 22CSU295");
	}
}
