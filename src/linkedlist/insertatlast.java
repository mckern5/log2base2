package linkedlist;


class insertatlast {
	
	   static class ll {  //class defn has no (), whereas instantion does
		
		class node{     //defn
			int data=0;
			node next;
				
		}
		
		node head;
		
		private void addlast(int val) {   //method
			
			
			
			node newnode=new node();
			newnode.data=val;
			newnode.next=null;
			
			if(head==null) {
				head=newnode;
			}
			else {
				node lastnode=head;
				
				while(lastnode.next!=null) {
					lastnode=lastnode.next;
				}
				
				lastnode.next=newnode;
			}
			
			
		}//addlast
		
		
		
		
		private void print() {  //method
			
			node temp=head;
			while(temp !=null) {
				System.out.print(temp.data+", ");
				temp=temp.next;
			}
			
		}//print
		
		
	}//ll
	
	
	public static void main(String[] args) {
		
		ll thelist =new ll();
		thelist.addlast(10);
		thelist.addlast(20);
		thelist.addlast(30);
		thelist.addlast(40);
		thelist.print();
		
	}
	
	
}


