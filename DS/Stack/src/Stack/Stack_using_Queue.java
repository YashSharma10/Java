package Stack;
import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueues {
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    public void push(int x) {
        queue1.add(x);
    }

    public void pop() {
        if (queue1.isEmpty()) {
            System.out.println("Stack is empty");
        }

        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }
    }

    public int top() {
        if (queue1.isEmpty()) {
            System.out.println("Stack is empty");
        }

        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }

        int topElement = queue1.peek();
        return topElement;
    }

    public boolean isEmpty() {
        return queue1.isEmpty();
    }
}

public class Stack_using_Queue {
    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();

        stack.push(1);
        System.out.println("Top element: " + stack.top());
        stack.push(2);
        stack.push(3);



        System.out.println("Top element: " + stack.top());

        System.out.println("Is the stack empty? " + stack.isEmpty());
    }
}
