public class LinearSearhRecursion {
    

	public static void main(String[] args) {
	
		int[] arr = {1,2,3,4,5};
		System.out.println(find(arr,3,0));
	}
	public static int find(int[] arr,int target,int index){
	    if (index > arr.length){
	        return -1;
	    }
	    
	    
	    return arr[index] == target ? index:find(arr,target,index+=1);
	    }
}

