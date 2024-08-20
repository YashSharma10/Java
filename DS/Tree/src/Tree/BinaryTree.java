package Tree;

import java.util.Scanner;

class Tree {
    class Node {
        int value;
        Node left, right;

        public Node(int value) {
            this.value = value;
        }
    }

    Node root;

    public void insert(Scanner sc) {
        System.out.println("Enter the root node :");
        int value = sc.nextInt();
        root = new Node(value);
        insert(sc, root);
    }

    public void insert(Scanner sc, Node parent) {
        System.out.println("Do you want to insert to the left of " + parent.value);
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter the value of left of " + parent.value);
            int value = sc.nextInt();
            parent.left = new Node(value);
            insert(sc, parent.left);
        }

        System.out.println("Do you want to insert to the right of " + parent.value);
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter the value of right of " + parent.value);
            int value = sc.nextInt();
            parent.right = new Node(value);
            insert(sc, parent.right);
        }
    }

    public void display() {
        display(root, 0);
      }

      private void display(Node node, int level) {
        if (node == null) {
          return;
        }

        display(node.right, level + 1);

        if (level != 0) {
          for (int i = 0; i < level - 1; i++) {
            System.out.print("|\t\t");
          }
          System.out.println("|------->" + node.value);
        } else {
          System.out.println(node.value);
        }
       display (node.left, level + 1);
      }

    
    public void preorder() {
        preorder(root);
    }

    public void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }
    public void inorder() {
        inorder(root);
    }

    public void inorder(Node node) {
        if (node == null) {
            return;
        }
        
        preorder(node.left);
        System.out.print(node.value + " ");
        preorder(node.right);
    }
    public void postorder() {
        postorder(root);
    }

    public void postorder(Node node) {
        if (node == null) {
            return;
        }
        
        preorder(node.left);
        preorder(node.right);
        System.out.print(node.value + " ");
    }
    
}

public class BinaryTree {
    public static void main(String[] args) {
        Tree a = new Tree();
        Scanner sc = new Scanner(System.in);
        a.insert(sc);
        a.display();
        a.preorder();
        a.inorder();
        a.postorder();
    }
}
