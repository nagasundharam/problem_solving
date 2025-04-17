public class MaximumSubArrayKadane {
    
        public int maxSubArray(int[] nums) {
    
            int n = nums.length;
            int sum = 0;
    
            int max = Integer.MIN_VALUE;
    
            for(int i = 0 ; i <n ;i++){
                if (sum < 0){
                    sum = 0;
    
                }
    
                sum+=nums[i];
                if(max < sum){
                    max = sum;
                }
            }
    
            return max;
            
    
    
    
            
            
        }
    }
