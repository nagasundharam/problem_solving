public class checkArrayisRotatedAndSortedorNot {

        public boolean check(int[] nums) {
            int n = nums.length;
            int count = 0 ;
    
            for(int i = 0 ; i < n - 1; i++){
    
                if (nums[i] <= nums[i + 1]){
                    continue;
    
                }
                else  {
                    if (nums[i] > nums[i + 1]){
                        count+=1;
                        if (count > 1){
                            return false;
                        }
                    }
                }
    
            }
            if (count == 1){
                if (nums[0] < nums[n -1]){
                    return false;
                }
            }
            return true;
    
         
       
        
    
    
      
          
        }
    }
