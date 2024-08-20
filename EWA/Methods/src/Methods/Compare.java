package Methods;
import java.util.*;

class Student implements Comparable<Student>{
	int rollno;
	String name;
	int age;
	Student(int rollno , String name , int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	public int compareTo(Student st) {
		if(age==st.age) {
			return 0;
		}
		else if(age>st.age) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
}
public class Compare {

	public static void main(String[] args) {
		ArrayList<Student> a1 = new ArrayList<>();
		a1.add(new Student(1,"yash",18));
		a1.add(new Student(2,"mohit",19));
		a1.add(new Student(3,"akul",20));
		Collections.sort(a1);
		for(Student st : a1) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}
