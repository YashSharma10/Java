package LinkedList;

import LinkedList.LL.Node;

class LL1 {
	Node head, tail;
	int size = 0;

	class Node {
		int data;
		Node next;
		Node pre;
		int size = 0;

		Node(int val) {
			this.data = val;
		}

		Node(int val, Node next) {
			this.data = val;
			this.next = next;
		}
	}

		public void insertFirst(int data) {
			Node n1 = new Node(data);
			n1.next = head;
			n1.pre = null;
			head = n1;
			if (head != null) {
		        head.pre = n1;
			}
			if(tail==null) {
				tail=head;
			}
			System.out.println("Inserted in beginning " + data);
			size++;
		}
		
		public void insertLast(int data) {
			if (tail == null) {
				insertFirst(data);
				return;
			}
			Node n2 = new Node(data);
			n2.pre=tail;
			tail.next = n2;
			tail = n2;
			System.out.println("Inserted at last " + data);
			size++;
		}
		
		public void insert(int data , int index) {
			if (index == 0) {
				insertFirst(data);
			}
			if (index == size) {
				insertLast(data);
				return;}
			else {
				Node temp = head;
				for (int i = 1; i < index; i++) {
					temp = temp.next;
				}
				Node n1 = new Node(data);
				n1.pre=temp;
				n1.next=temp.next;
				temp.next.pre=n1;
				temp.next = n1;
				System.out.println("Inserted at index " + index + " " + data);
				size++;
			}
		}
		
		public void deleteFirst() {
			if(head!=null) {
				head = head.next;
				head.pre=null;
			}
			else {
				tail=null;
			}
			System.out.println("Deleted First");
			size--;
		}
		
		public void deleteLast() {
			if(tail!=null) {
				tail=tail.pre;
				tail.next=null;
			}
			else {
				head=null;
			}
			System.out.println("Deleted Last");
            size--;
		}
		
		public void delete(int index) {
			if (index==0) {
	            deleteFirst();
	        }
			if(index == size - 1) {
				deleteLast();
			}
			Node temp = head;
			for (int i = 1; i < index; i++) {
				temp = temp.next;
			}
			temp.next=temp.next.next;
			temp.next.pre=temp;
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


public class Double_LL {

	public static void main(String[] args) {
		LL1 a = new LL1();
		a.insertFirst(10);
		a.insertLast(30);
		a.insertFirst(20);
		a.insert(50,1);
		a.display();
		a.delete(1);
		a.deleteFirst();
		a.display();
		a.deleteLast();
		a.display();
		

	}

}
