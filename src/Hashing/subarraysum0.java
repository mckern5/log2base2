package Hashing;

//Java program to find
// if there is a zero sum subarray
import java.util.HashSet;
import java.util.Set;	
	
	

	

class ZeroSumSubarray {
	  
	    // Returns true if arr[]
	    // has a subarray with sero sum
	    static Boolean subArrayExists(int arr[])
	    {
	        // Creates an empty hashset hs
	        Set<Integer> hs = new HashSet<Integer>();

	        // Initialize sum of elements
	        int sum = 0;

	        // Traverse through the given array
	        for (int i = 0; i < arr.length; i++) {
	            // Add current element to sum
	            sum += arr[i];

	            // Return true in following cases
	            // a) Current element is 0
	            // b) sum of elements from 0 to i is 0
	            // c) sum is already present in hash set
	            if (arr[i] == 0 || sum == 0 || hs.contains(sum))
	                return true;

	            // Add sum to hash set
	            hs.add(sum);
	        }

	        // We reach here only when there is
	        // no subarray with 0 sum
	        return false;
	    }
	    
	   

	}	    
public class subarraysum0 {
	    
	
	    public static void main(String arg[])
	    {
	        
	    	// Driver's code
		 	ZeroSumSubarray x=new ZeroSumSubarray();
	       
	        int arr[] = {-3, 2, 3, 1, 6};
	        // Function call
	        helper(arr,x);
	        
	        int arr2[] = {4, 2, -3, 1, 6};
	        helper(arr2,x);
	        
	    }
	    
	    private static void helper(int[] arr, ZeroSumSubarray y){
	    	if (y.subArrayExists(arr))
	            System.out.println("Found a subarray with 0 sum");
	        else
	            System.out.println("No Such Sub Array Exists!");
	    }
	   
}
	


