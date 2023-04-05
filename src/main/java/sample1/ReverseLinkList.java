package main.java.sample1;

public class ReverseLinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node fourth = new Node(4,null);
		Node thrid = new Node(3,fourth);
		Node sec = new Node(2,thrid);
		Node head = new Node(1,sec);
		
		Node org = head;
		
		while(org!=null)  {
			   System.out.println(org.data);
			   org = org.next;
			}
		
		
		System.out.println("After reverse Linked list");
		Node curr = reverseLinkedList(head);
		while (curr != null) {
			System.out.println(curr.data);
			curr=curr.next;
		}

	}
	
	public static Node reverseLinkedList(Node head) {
	    Node current = head;
	    Node temp =  null;
	    Node prev = null;
	    
	    while(current!=null) {
	    	temp = current.next;
	    	current.next = prev;
	    	prev = current;
	    	current = temp;
	    }
	    return prev;
	}

}


class Node{
	int data;
	Node next;
	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}
	
}
