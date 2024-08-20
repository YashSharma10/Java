// QUE.= you have to us a a tree set to insert the value with the specified key 1 2 3 4 5 with 5 value 1 . algorithm 2. logic 3 . implementation 4. chatgpt 5. machine learning
// 1. covert in descending value
// 2. find value which are greater than 4 ,
// 3. value which are between 2 and 5
// 4. in end replace the value the vale of chatgpt with myownbrain with replace
package Maps;

import java.util.*;

public class Practise {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(1, "algorithm");
		map.put(2, "logic");
		map.put(3, "implementation");
		map.put(4, "chatgpt");
		map.put(5, "machinelearning");
		System.out.println(map);
		System.out.println("Descending order" + map.descendingMap());
		System.out.println("values greater then key 4");
		System.out.println(map.tailMap(4, true));
		System.out.println("values less then key 3");
		System.out.println(map.headMap(3, false));
		System.out.println("values between  key 2 and key 5 ");
		System.out.println(map.subMap(2, false, 5, true));
		System.out.println("replacing chatgpt with own brain ");
        // map.replace(4,"myownbrain");
		System.out.println(map);
		System.out.println("YASH SHARMA 22CSU295");

	}

}