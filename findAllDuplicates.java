import java.util.ArrayList;
import java.util.List;

public class findAllDuplicates {
    
    public List<Integer> findDuplicates(int[] nums) {

        int n = nums.length;
        int  i = 0;

        ArrayList <Integer> li = new ArrayList<>();


        while(i < n){
            int correct = nums[i] - 1 ;
            if (nums[i] - 1 != i && (nums[i] != nums[correct])){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }

        for(int ind = 0 ; ind  < n ; ind++){
            if (nums[ind] != ind + 1){
                li.add(nums[ind]);


            }
        }
        return li;

        
        
    }
    public void swap(int[] nums,int first,int last){

        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;

    }
}
    

