public class PrimeNumbersInAGivenRange {

	public static void main(String[] args) {
	
		
		boolean[] arr = new boolean[100];
		
		int n = arr.length;
		sieve(arr);
		
		
		
		
		
	}
	public static void  sieve(boolean[] arr){
	    int n = arr.length;
	    for(int i = 2;i * i <= n;i++){
	        if (!arr[i]){
	            for(int j = i * i ; j < n;j+=i){
	                arr[j] = true ;
	            }
	        }
	    }
	    for(int i = 2 ; i < n ; i++){
	        if (!arr[i]){
	            System.out.println(i);
	        }
	    }
	}
}
