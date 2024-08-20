package LinkedList;

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

	public void insertLast(int data) {
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

	public void insert(int data, int index) {
		if (index == 0) {
			insertFirst(data);
		}
		else if (index == size) {
			insertLast(data);
			return;
		} else {
			Node temp = head;
			for (int i = 1; i < index; i++) {
				temp = temp.next;
			}
			Node n1 = new Node(data, temp.next);
			temp.next = n1;
			n1 = temp.next;
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
		for (int i = 1; i < size-1; i++) {
			temp = temp.next;
		}
		tail=temp;
		tail.next=null;
		System.out.println("Deleted Last");
		size--;
	}
	public void delete(int index) {
		if (size <= 1) {
            deleteFirst();
        }
		if(size == size-1) {
			deleteLast();
		}
		Node temp = head;
		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}
		temp.next=temp.next.next;
		System.out.println("Deleted index " + index);
	}
	public Node search(int data) {
		Node node = head;
		while(node!=null) {
			if(node.data == data) {
				return node;
			}
		}
		return null;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("END");
	}
	public Node Reverse() {
		Node cur =head;
		Node pre = null;
		while(cur!=null) {
			Node temp = cur.next;
			cur.next=pre;
			pre=cur;
			cur=temp;
		}
		return cur;
	}
}

public class LL_Operations {
	public static void main(String[] args) {
		LL a = new LL();
		a.insertFirst(10);
		a.insertFirst(20);
		a.display();
		a.insertLast(40);
		a.insertLast(60);
		a.display();
		a.insert(100, 1);
		a.display();
		a.deleteFirst();
		a.display();
		//a.deleteLast();
		a.display();
		//a.delete(2);
		a.display();
		a.Reverse();
		a.display();
		
	}
}
