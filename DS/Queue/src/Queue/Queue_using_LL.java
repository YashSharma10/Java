package Queue;
class LL {
	Node head;
	Node tail;
	int size = 0;

	class Node {
		int data;
		Node next;

		Node(int val) {
			this.data = val;
		}

		Node(int val, Node next) {
			this.data = val;
			this.next = next;
		}
	}
	public void insertFirst(int data) {
		// 1. creation
		Node n1 = new Node(data);
		// 2. address point
		n1.next = head;
		// 3. new head
		head = n1;
		System.out.println("Inserted in beginning " + data);
		if (tail == null) {
			tail = head;
		}
		size++;
	}

	public void Enqueue(int data) {
		if (tail == null) {
			insertFirst(data);
			return;
		}
		// 1. creating node
		Node n2 = new Node(data);
		// 2. point 
		tail.next = n2;
		// 3. updating tail
		tail = n2;
		System.out.println("Inserted at last " + data);
		size++;
	}
	public void Dequeue() {
		head = head.next;
		if (head == null) {
			tail = null;
		}
		System.out.println("Deleted First");
		size--;
	}
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("END");
	}
}
public class Queue_using_LL {

	public static void main(String[] args) {
		LL a= new LL();
		a.Enqueue(10);
		a.Enqueue(20);
		a.Enqueue(30);
		a.display();
		a.Dequeue();
		a.display();

	}

}
