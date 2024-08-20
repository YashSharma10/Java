package Stack;

import java.util.*;

class Operation1{
	int Max=100;
	int Stack[] = new int[Max];
	int top = -1;
	
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isFull() {
		if(top == Max-1) {
			return true;
		}
		else {
			return false;
		}
	}
	public void push(int value) {
		if(isFull()==true) {
			System.out.println("Stack is Full");
		}
		else {
			Stack[++top]=value;
			//System.out.println("Pushed " + value + " on stack");
		}
	}
	public void pop() {
		if(isEmpty()==true) {
			System.out.println("Stack is Empty");
		}
		else {
			int value = Stack[top--];
			//System.out.println("Poped " + value + " on stack");
		}
		
	}
	public char peek() {
		//if(isEmpty()==true) {
		//	System.out.println("Stack is Empty");
		//}
		//else {
			//return (char) Stack[top];
		//}
		return (char) Stack[top];
	}
	
}
public class Parenthesis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String b = sc.next();
		isValid(b);

	}
	public static void isValid(String str) {
		Operation1 a = new Operation1();
		for(int i = 0 ; i<=str.length()-1;i++) {
			char ch = str.charAt(i);
			if(a.isEmpty()) {
				a.push(ch);
			}
			else if((ch==')' && a.peek() == '(')||(ch=='}' && a.peek() == '{')||(ch==']' && a.peek() == '[')) {
				a.pop();
			}
			else {
				a.push(ch);
			}
		}
		System.out.println("Parenthesis complete : "+a.isEmpty());
	}

}
