package main.java.test;

import java.util.ArrayDeque;
import java.util.Queue;

public class RightViewOfTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
			Node root = new Node(3);
			root.left = new Node(5);
			root.right = new Node(6);
			root.left.right = new Node(2);
			root.left.left = new Node(10);


			printRightView(root);
		}

	}
	
	// Iterative function to print the right view of a given binary tree
    public static void printRightView(Node root)
    {
        // return if the tree is empty
        if (root == null) {
            return;
        }
 
        // create an empty queue and enqueue the root node
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
 
        // to store the current node
        Node curr = null;
 
        // loop till queue is empty
        while (!queue.isEmpty())
        {
            // calculate the total number of nodes at the current level
            int size = queue.size();
            int i = 0;
 
            // process every node of the current level and enqueue their
            // non-empty right and right child
            while (i++ < size)
            {
                curr = queue.poll();
 
                // if this is the last node of the current level, print it
                if (i == size) {
                    System.out.println(curr.key + " ");
                }
 
                if (curr.left != null) {
                	System.out.println(curr.left.key);
                    queue.add(curr.left);
                }
 
                if (curr.right != null) {
                	System.out.println(curr.right.key);
                    queue.add(curr.right);
                }
            }
        }
    }

}

class Node{
	Node right;
	Node left;
    int key;

   public Node(int data) {
	   this.key=data;
   }
}
