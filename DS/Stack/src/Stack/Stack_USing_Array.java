package Stack;

import java.util.Scanner;

class Operation{
	int Max=100;
	int Stack[] = new int[Max];
	int top = -1;
	
	public int isEmpty() {
		if(top == -1) {
			return 1;
		}
		else {
			return 0;
		}
	}
	public int isFull() {
		if(top == Max-1) {
			return 1;
		}
		else {
			return 0;
		}
	}
	public void push(int value) {
		if(isFull()==1) {
			System.out.println("Stack is Full");
		}
		else {
			Stack[++top]=value;
			System.out.println("Pushed " + value + " on stack");
		}
	}
	public void pop() {
		if(isEmpty()==1) {
			System.out.println("Stack is Empty");
		}
		else {
			int value = Stack[top--];
			System.out.println("Poped " + value + " on stack");
		}
		
	}
	public void peek() {
		if(isEmpty()==1) {
			System.out.println("Stack is Empty");
		}
		else {
			System.out.println("Top Element is : " + Stack[top] );
		}
	}
	
}
public class Stack_USing_Array {

	public static void main(String[] args) {
		Operation obj = new Operation();
		Scanner sc = new Scanner(System.in);
		int choice;
		do{
			System.out.println("Enter \n1. for push\n2. for pop\n3. for peek\n4. for isEmpty\n5. for isFull\n6. for exit");
			choice = sc.nextInt();
			switch(choice) {
			case 1 :
				System.out.println("Enter value : ");
				int a = sc.nextInt();
				obj.push(a);
				break;
			case 2 :
				obj.pop();
				break;
			case 3 :
				obj.peek();
			case 4 :
				int s=obj.isEmpty();
				if(s==1)
				{
					System.out.println("stack is empty");
				}
				else
				{
					System.out.println("stack is not empty");
				}
				break;
			case 5 :
				int c = obj.isFull();
				if(c==1)
				{
					System.out.println("stack is full");
				}
				else
				{
					System.out.println("stack is not full");
				}
				break;
				
			case 6 :
				sc.close();
				System.out.println("Program closed");
				System.exit(0);
			default :
				System.out.println("Enter valid option !!");
			}
		}while(choice!=3);
				
	}

}
