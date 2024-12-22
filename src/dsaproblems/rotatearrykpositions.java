package dsaproblems;


//hard
public class rotatearrykpositions {
	
    static int[] arrayRotate(int[] arr, int n, int k) {
		
		reverse(arr,0    ,n-k-1);
		reverse(arr,n-k   ,n-1);
		reverse(arr,0     ,n-1);
		
		return arr;
	}
	
	static int[] reverse(int[] arr, int start, int end) {
		
		while(start < end) {
			int temp=arr[start];
			arr[start++]=arr[end];
			arr[end--]=temp;
		}
		
		return arr;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		//array of integers
		//n -arraysize
		//k number of time array rotated
		
		int[] a= {1,2,3,4,5};
	    int[] c =arrayRotate(a,5,5);
		
		for(int x:c) {
			System.out.print(x);System.out.print(", ");
		}
		

	}

}
