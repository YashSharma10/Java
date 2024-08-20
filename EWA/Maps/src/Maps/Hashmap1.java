package Maps;
import java.util.*;
import java.awt.*;
public class Hashmap1 {

	public static void main(String[] args) {
		Map<String , Color> m1 = new HashMap<>();
		m1.put("Juliet" , Color.BLUE);
		m1.put("Romeo" , Color.GREEN);
		m1.put("Adam" , Color.RED);
		m1.put("Eve" , Color.BLUE);
		
		// Maps can't be traversed directly so firstly we have to convert it into KeySet or HashSet
		Set<String> KeySet = m1.keySet();
		for(String key : KeySet) {
			Color value = m1.get(key);
			System.out.println(key + ":" + value);
		}
		System.out.println("YASH SHARMA 22CSU295");
	}

}
