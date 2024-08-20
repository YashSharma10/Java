package Stack;
import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Stack_Using_LL {
    Node top;

    public int isEmpty() {
        if (top == null) {
            return 1; 
        } else {
            return 0;
        }
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed " + value + " onto the stack.");
    }

    public void pop() {
        if (isEmpty() == 1) {
            System.out.println("Stack is empty. Cannot pop.");
            return;
        }
        //int poppedValue = top.data;
        top = top.next;
        //System.out.println("Popped " + poppedValue + " from the stack.");
    }

    public void peek() {
        if (isEmpty() == 1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top element of the stack is: " + top.data);
        }
    }


    public static void main(String[] args) {
    	Stack_Using_LL stack = new Stack_Using_LL();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nStack Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. isEmpty");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    int isEmpty = stack.isEmpty();
                    if (isEmpty == 1) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Stack is not empty.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}