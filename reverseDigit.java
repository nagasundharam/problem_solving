public class reverseDigit {

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println(sumDigit(345));
	}
	static int sum = 0;
	public static int sumDigit(int n){
	     int rem = n % 10;
	   sum = sum * 10 +rem;
	    
	    if (n%10 == n){
	        return sum;
	    }
	  
	    return  sumDigit(n/10);
	}
}
