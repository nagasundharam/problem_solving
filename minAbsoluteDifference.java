import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class minAbsoluteDifference {
   
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n = arr.length;

        Arrays.sort(arr);
        

        // for(int i = 1 ; i < n ; i++){

        //     int key = arr[i];
            
        //     int j = i - 1;
        //     while(j >= 0 && key < arr[j]){
        //         arr[j+1] = arr[j];
        //         j--;

        //     }
        //     arr[j+1] = key;
           
        // }

        List<List<Integer>> li = new ArrayList<>();
        int diff = 0 ;

        int min = Integer.MAX_VALUE;

        for(int i = 1; i < n ; i++){
            int low = Math.abs(arr[i]- arr[i-1]);
            if (min > low){
                min = low;
            }
            
        }

        for(int i = 1; i < n ; i++){
           
            if (min == arr[i] - arr[i-1]){
                List<Integer> innerlist = new ArrayList<>();
                innerlist.add(arr[i-1]);
                innerlist.add(arr[i]);
                li.add(innerlist);
            }


        }

        return li;

      
        
    }
}

