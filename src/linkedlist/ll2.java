package linkedlist;

class node{
	int data;
	node next;
}

public class ll2 {
	
	
	
	
	public static void main(String[] args) {
		
		node head=new node();
	    node middle=new node();
	    node last=new node();
	    
	    head.data=10;
	    middle.data=20;
	    last.data=30;
	    
	    head.next=middle;
	    middle.next=last;
	    last.next=null;
	    
	    node temp=head;
	    
	    System.out.println("The linked list elements are:");
	    
	    while(temp!=null) {
	    	System.out.print(temp.data+", ");
	    	temp=temp.next;
	    }
	    
	    
	}

}
