package ArrayList;
import java.util.*;
public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("yash");
		l1.add("mohit");
		l1.add("akul");
		l1.add("adi");
		System.out.println(l1);
		//to access any element on specific index
		System.out.println("element on index 2 : "+l1.get(1));
		//changing element
		l1.set(1, "aman");
		System.out.println("element on index 2 : "+l1.get(1));
		System.out.println("YASH SHARMA 22CSU295");
	}

}
