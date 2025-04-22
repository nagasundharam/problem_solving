public class PlusOneBruteForce {
  
        public int[] plusOne(int[] digits) {
            int n = digits.length;
    
        
            int count = 0;
    
            for(int i = 0 ; i <  n ;i++){
                if (digits[n-i-1] % 9 == 0  && digits[n-i-1] != 0){
                    count++;
                }
                else {
                    break;
                }
                
            }
            int[] arr = (count != n)? new int[n]:new int[n+1];
    
            
    
    
           
    
           
            // int[] arr = new int[s];
    
            int s  = arr.length;
            int carry = 1;
    
            for(int i = 0 ; i < n ;i++){
                
                if (digits[n-i-1] + carry  > 9){
                    arr[n-i-1] = 0 ;
                    carry = 1;
                }
                else {
                    arr[n-i-1] = digits[n-i-1] + carry ;
                    carry = 0;
                }
               
                 
            }
            if (s > n){
                arr[0] = carry;
            }
            return arr ;
            
      
    
           
        }
    }

