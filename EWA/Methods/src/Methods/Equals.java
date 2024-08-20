package Methods;

public class Equals {

	public static void main(String[] args) {
		// EQUALS RETURN BOOLEAN AND COMPARE TWO VALUES AS EQUAL OR NOT
		
		String a = "YASH";
		String b = "YASH";
		
		if(a.equals(b)) {
			System.out.println("a and b are equal variable and their hashValues are : " + a.hashCode()+" & "+ b.hashCode());
		}
		String c = "MOHIT";
		String d = "AKUL";
		
		if(!c.equals(d)) {
			System.out.println("c and d are Unequal variable and their hashValues are : " + c.hashCode()+" & " +  d.hashCode());
		}
		
	}

}
