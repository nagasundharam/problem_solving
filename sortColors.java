public class sortColors {
  
        public void sortColors(int[] nums) {
    
            int n = nums.length;
            for(int i = 0 ; i < n;i++){
    
                int key = nums[i];
    
                int j = i - 1;
                while(j >= 0 && key < nums[j]){
                    nums[j+ 1]= nums[j];
                    j--;
    
    
                }
                nums[j + 1] = key;
            }
    
            
        }
    }
