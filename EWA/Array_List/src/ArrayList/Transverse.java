package ArrayList;
import java.util.ArrayList;
public class Transverse {

	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("yash");
		l1.add("mohit");
		l1.add("akul");
		l1.add("adi");
		//System.out.println(l1);
		for(String list : l1) {
			System.out.println(list);
		}
		
		l1.forEach((n) -> print(n));
		System.out.println("YASH SHARMA 22CSU295");
	}
	public static void print(String n) {
		System.out.println("name is : "+n);
		
	}

}
