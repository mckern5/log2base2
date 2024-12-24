package linkedlist;




class linkedlist {
	
	class node{    //class
		int data;
		node next;
	}
	
	node head;
	
	public void addFirst(int val) {    //method
		node newnode=new node();
		newnode.data=val;
		newnode.next=head;
		
	}
	
	public void print() {     //method
		node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;    //used to idea of temp and temp.next are both nodes!!!
		}
	}
	
}

public class insertnodeatbeginning {
	
	
	
	
	public static void main(String[] args) {   //method
		
		linkedlist ll=new linkedlist(); //1 class, 2methods
		
		
	}
	
	
	
	
}



