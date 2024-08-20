package Queue;
import java.util.Scanner;

class CircularQueue {
    private int front, rear, size, capacity;
    private int[] queue;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.front = this.rear = -1;
        this.queue = new int[capacity];
    }

    // Enqueue operation
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % capacity; // Circular increment
            }
            queue[rear] = item;
            size++;
            System.out.println("Enqueued: " + item);
        }
    }

    // Dequeue operation
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
        } else {
            System.out.println("Dequeued: " + queue[front]);
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % capacity; // Circular increment
            }
            size--;
        }
    }

    // Check if the queue is full
    private boolean isFull() {
        if (size == capacity) {
            return true;
        } else {
            return false;
        }
    }

    // Check if the queue is empty
    private boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
}

public class Circular{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the capacity of the circular queue: ");
        int capacity = scanner.nextInt();

        CircularQueue circularQueue = new CircularQueue(capacity);

        int choice;
        do {
            System.out.println("\nCircular Queue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to enqueue: ");
                    int element = scanner.nextInt();
                    circularQueue.enqueue(element);
                    break;
                case 2:
                    circularQueue.dequeue();
                    break;
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 0);

        scanner.close();
    }
}

