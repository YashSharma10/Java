package Queue;
import java.util.Scanner;

class DequeArray {
    private int front, rear, size, capacity;
    private int[] deque;

    public DequeArray(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.front = -1;
        this.rear = -1;
        this.deque = new int[capacity];
    }

    // Enqueue operation at rear
    public void enqueueRear(int item) {
        if (isFull()) {
            System.out.println("Deque is full. Cannot enqueue at the rear.");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % capacity;
            }
            deque[rear] = item;
            size++;
            System.out.println("Enqueued at the rear: " + item);
        }
    }

    // Enqueue operation at front
    public void enqueueFront(int item) {
        if (isFull()) {
            System.out.println("Deque is full. Cannot enqueue at the front.");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                front = (front - 1 + capacity) % capacity;
            }
            deque[front] = item;
            size++;
            System.out.println("Enqueued at the front: " + item);
        }
    }

    // Dequeue operation from front
    public void dequeueFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot dequeue from the front.");
        } else {
            int item = deque[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % capacity;
            }
            size--;
            System.out.println("Dequeued from the front: " + item);
        }
    }

    // Dequeue operation from rear
    public void dequeueRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot dequeue from the rear.");
        } else {
            int item = deque[rear];
            if (front == rear) {
                front = rear = -1;
            } else {
                rear = (rear - 1 + capacity) % capacity;
            }
            size--;
            System.out.println("Dequeued from the rear: " + item);
        }
    }

    // Check if the deque is full
    public boolean isFull() {
        return size == capacity;
    }

    // Check if the deque is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Peek at the front element
    public void peekFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot peek at the front.");
        } else {
            System.out.println("Front element: " + deque[front]);
        }
    }

    // Peek at the rear element
    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot peek at the rear.");
        } else {
            System.out.println("Rear element: " + deque[rear]);
        }
    }
}

public class DoubleQueue{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the capacity of the deque: ");
        int capacity = scanner.nextInt();

        DequeArray dequeArray = new DequeArray(capacity);

        int choice;
        do {
            System.out.println("\nDeque Operations:");
            System.out.println("1. Enqueue at the Rear");
            System.out.println("2. Enqueue at the Front");
            System.out.println("3. Dequeue from the Front");
            System.out.println("4. Dequeue from the Rear");
            System.out.println("5. Peek at the Front");
            System.out.println("6. Peek at the Rear");
            System.out.println("7. Check if the Deque is Full");
            System.out.println("8. Check if the Deque is Empty");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter element to enqueue at the rear: ");
                    int elementRear = scanner.nextInt();
                    dequeArray.enqueueRear(elementRear);
                    break;
                case 2:
                    System.out.print("Enter element to enqueue at the front: ");
                    int elementFront = scanner.nextInt();
                    dequeArray.enqueueFront(elementFront);
                    break;
                case 3:
                    dequeArray.dequeueFront();
                    break;
                case 4:
                    dequeArray.dequeueRear();
                    break;
                case 5:
                    dequeArray.peekFront();
                    break;
                case 6:
                    dequeArray.peekRear();
                    break;
                case 7:
                    System.out.println("Deque is full: " + dequeArray.isFull());
                    break;
                case 8:
                    System.out.println("Deque is empty: " + dequeArray.isEmpty());
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



