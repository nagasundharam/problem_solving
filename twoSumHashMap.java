import java.util.HashMap;

public class twoSumHashMap {

    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[2];

        for(int i = 0 ; i < n ;i++){
          
          int a = nums[i];
          int find = target - nums[i];

          if (map.containsKey(find)){
            ans[0] = i;
            ans[1] = map.get(find);
            return ans;

          }
          map.put(a,i);

        }
        return new int[] {-1,-1};

    
        
    }
}

