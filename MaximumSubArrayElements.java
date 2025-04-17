public class MaximumSubArrayElements {
    /******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

	public static void main(String[] args) {
	int[] arr = {-2,-3,4,-1,-2,1,5,-3};
	
	int sum = 0;
	int max = arr[0];
	int n = arr.length;
	int as = -1;
	int ae = -1;
	  int start = 0;
	    int end = 0;
	
	for(int i = 0 ; i < n ; i++){
	  
	    sum+= arr[i];
	    
	    if (sum < 0){
	        
	        sum = 0;
	        start = i+1;
	        
	    }
	    if (sum > max){
	        max = sum;
	        as = start;
	        ae = i;
	    }
	    
	}
System.out.println(max);
System.out.println(as +"  "+ae);
	    
	}
}

