class missingNuber2 {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int i = 0 ;

        while (i < n){
            int correct =nums[i];
            if (nums[i] < n && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }
            else {
                i++;
            }

        }

        for(int j = 0 ; j < n ;j++){
            if ( nums[j] !=  j){
                return j;
            }
        }
        return n;

  

    

       
    }
    public void swap(int[] nums, int start,int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}