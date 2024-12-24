package linkedlist;

public class insertnodeatbeginning {

	class node{
		int data;
		node next;
	}
	
	public class linkedlist {
		
		node head;
		
		public void addFirst(int val) {
			node newnode=new node();
			newnode.data=val;
			newnode.next=head;
			
		}
		
		public void print() {
			node temp=head;
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;    //used to idea of temp and temp.next are both nodes!!!
			}
		}
		
	}
	
	public static void main(String[] args) {
		
	}
	
	
	
	
}
