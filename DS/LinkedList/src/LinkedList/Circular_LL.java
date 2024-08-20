package LinkedList;

import LinkedList.LL.Node;

class LL2 {
	public Node head, tail;
	int size = 0;

	class Node {
		Node next;
		int data;

		Node(int data) {
			this.data = data;
		}

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	public void insertFirst(int data) {
		Node n1 = new Node(data);
		n1.next = head;
		head = n1;
		size++;
		if (tail == null) {
			tail = head;
		}
	}

	public void insertLast(int data) {
		if (tail == null) {
			insertFirst(data);
			return;
		}
		Node n2 = new Node(data);
		tail.next = n2;
		tail = n2;
		n2.next = head;
		System.out.println("Inserted at last " + data);
		size++;
	}

	public void insert(int data, int index) {
		if (index == 0) {
			insertFirst(data);
		}
		if (index == size) {
			insertLast(data);
			return;
		} else {
			Node temp = head;
			for (int i = 1; i < index; i++) {
				temp = temp.next;
			}
			Node node = new Node(data, temp.next);
			temp.next = node;
			System.out.println("Inserted at index " + index + " " + data);
			size++;
		}
	}

	public void deleteFirst() {
		head = head.next;
		if (head == null) {
			tail = null;
		}
		System.out.println("Deleted First");
		size--;
	}

	public void deleteLast() {
		if (size <= 1) {
			deleteFirst();
		}
		Node temp = head;
		for (int i = 1; i < size - 1; i++) {
			temp = temp.next;
		}
		tail = temp;
		tail.next = head;
		System.out.println("Deleted Last");
		size--;
	}

	public void delete(int index) {
		if (size <= 1) {
			deleteFirst();
		}
		if (size == size - 1) {
			deleteLast();
		}
		Node temp = head;
		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
		System.out.println("Deleted index " + index);
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
			if (temp == head) {
				break; // Avoid infinite loop if the list is not properly circular
			}
		}
		System.out.println("END");
	}
}

public class Circular_LL {

	public static void main(String[] args) {
		LL2 a = new LL2();
		a.insertFirst(10);
		a.insertFirst(20);
		a.display();
		a.insertLast(40);
		a.insertLast(60);
		a.display();
		a.insert(100, 1);
		a.display();
		// a.deleteFirst();
		// a.display();
		// a.deleteLast();
		// a.display();
		a.delete(2);
		a.display();
	}

}
