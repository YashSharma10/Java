package Tree;
class BST{
	class Node{
		int value;
		Node left , right;
		int height;
		
		public Node(int value){
			this.value=value;
		}
		public int getValue() {
			return value;
		}
	}
	
	Node root;
	
	public int height(Node node) {
		if(node==null) {
			return -1;
		}
		return node.height;
	}
	public boolean isEmpty() {
		return root==null;
	}
	
	public void insert(int value) {
		root = insert(value,root);
	}
	public Node insert(int value , Node node) {
		if(node==null) {
			node = new Node(value);
			return node;
		}
		if(value<node.value) {
			node.left=insert(value,node.left);
		}
		if(value>node.value) {
			node.right=insert(value,node.right);
		}
		
		node.height=Math.max(height(node.left), height(node.right))+1;
		return node;
	}
	
	public void add(int[] num) {
		for(int i =0; i< num.length;i++) {
			this.insert(num[i]);
		}
	}
	public boolean balanced(Node node) {
		if(node==null) {
			return true;
		}
		return Math.abs(height(node.left)-height(node.right))<=1&& balanced(node.left)&&balanced(node.right);
	}
	
	public void display() {
		display(this.root , "Root Node :");
	}
	public void display(Node node , String details) {
		if(node==null) {
			return;
		}
		System.out.println(details + node.value);
		display(node.left,"left child of "+node.value+" : " );
		display(node.right,"right child of "+node.value+" : " );
	}
	
}
public class BinarySearchTree{
	public static void main(String args[]) {
		BST a = new BST();
		int[] b = {1,4,3,6,4,3,5,4,24,4,};
		a.add(b);
		a.display();
	}
}