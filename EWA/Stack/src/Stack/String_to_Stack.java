package Stack;
import java.util.*;
public class String_to_Stack {

	public static String reverse(String str) {
		Stack<Character> s1 = new Stack<>();
		char[] chars = str.toCharArray();
		
		for(char c : chars) {
			s1.push(c);
		}
		for(int i = 0 ; i<str.length() ; i++) {
			chars[i] = s1.pop();
			}
		return new String(chars);
	}
	public static void main(String[] args) {
		//String str = "sophisticated";
		String str = "i am going to college";
		System.out.println("Before reverse : "+str);
		System.out.println("After  reverse : "+ reverse(str));
		System.out.println("YASH SHARMA 22CSU295");
	}

}
