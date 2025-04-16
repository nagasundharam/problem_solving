public class SumZeroBruteForceApproach {
  
        public int[] sumZero(int n) {
            
            int sum = 0;
            int[] arr = new int[n];
            int start  = 0 ;
            int end = n - 1 ;
            if (n % 2 != 0){
               start = n/2 -1;
            end = n/2+1;
            }
            else {
                start = n/2 -1;
            end = n/2;
    
            }
            
            
            int pos = 0;
            int neg = 0;
            while(start >= 0 && end <= n ){
                System.out.println(start + " " + end);
    
                arr[start] = ++pos;
                arr[end] = --neg ;
                start = start - 1;
                end = end + 1;
            }
            return arr;
            
    
    
            
    
          
    
    
         
        }
    }
