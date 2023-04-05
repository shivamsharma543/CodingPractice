package main.java.test;

public class ReverseLinkedList {

	public static void main(String[] args) {
		
		Link sec = new Link(null,3);
		Link first = new Link(sec,2);
		Link head = new Link(first,1);
		
		//System.out.println(head.next.data);
		printLink(head);
		
		System.out.println("After printing");
		printLink(reverse(head));
				
	}
	
	public static Link reverse(Link node) {
		Link temp;
		Link prev = null;
		Link curr = node;
		while(curr!=null) {
			temp = curr.next;
			curr.next=prev;
			prev = curr;
			curr = temp;
			
		}
		
		return prev;
		
	}
	
	public static void  printLink(Link node) {
		while(node!=null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

}

class Link{
	
	Link next;
	int data;
	
	public Link(Link next,int data) {
		this.data = data;
		this.next = next;
	}
	
	
	
}
