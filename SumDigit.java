public class SumDigit {
    /******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println(sumDigit(93456));
	}
	public static int sumDigit(int n){
	    
	    if (n == 0){
	        return 0;
	    }
	    
	    return (n%10) + sumDigit(n/10);
	}
}
    

