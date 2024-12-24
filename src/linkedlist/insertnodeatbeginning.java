package linkedlist;

//study this can be confusing
class insertnodeatbeginning {

	 static class linkedlist {
		
		class node{    //class
			int data;
			node next;
		}
		node head;
		
		private void addFirst(int val) {    //method
			
			
			
			
			node newnode=new node();
			newnode.data=val;
			newnode.next=head;                    // 40 <-30<-20<-10
			
			head=newnode;
			
		}
		
		private void print() {     //method
			node temp=head;
			while(temp!=null) {
				System.out.print(temp.data+", ");
				temp=temp.next;    //used to idea of temp and temp.next are both nodes!!!
			}
		
		}
   }//static ll




	
	
	
	
	public static void main(String[] args) {   //method
		
		linkedlist list=new linkedlist(); //1 class, 2methods
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addFirst(40);
		
		list.print();
		
	}
	
}//insertatht beginnning
	
	




