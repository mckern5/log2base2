package linkedlist;

public class ll {
	
	
	
	
	static class Node
	{ 
	    int data;
	    Node next;
	}

	public class LinkedList
	{
	    public static void main(String args[])
	    {

	        Node head=new Node();
	        Node middle=new Node();
	        Node last=new Node();

	        //initialize data
	        head.data = 10;
	        middle.data = 20;
	        last.data = 30;
	        
	        //initialize next
	        head.next = middle;
	        middle.next = last;
	        last.next = null;

	        //System.out.println("The LinkedList Elements Are:");

	        //node temp points at head -->last
	        Node temp = head;
	        while(temp != null)
	        {
	            System.out.print(temp.data); System.out.print(",");
	            temp = temp.next;
	        }
	    }
	}	
	
	
	

}
