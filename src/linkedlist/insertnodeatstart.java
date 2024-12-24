package linkedlist;

public class insertnodeatstart {
	
	

	static class linkedlist{
		
		private class Node {
			int data;
			Node next;
			
		}
		
		
		Node head;
		
		private void addFirst(int val){   //10,20,30,40 head
		
			Node newNode=new Node();
			newNode.data=val;
			newNode.next=head;
			
			head=newNode;
		}	
		
		private void print() {
			
			Node temp=head;
			
		    while(temp != null) {
		    	System.out.print(temp.data); System.out.print(",");
		    	temp=temp.next;
		    }
			
			
		}
		
		

    }//linkedlist
	
	public static void main(String[] args) {
		
		linkedlist list=new linkedlist();
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addFirst(40);
		list.print();
		
	}
	
}