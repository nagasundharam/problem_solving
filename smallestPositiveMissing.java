public class smallestPositiveMissing {
    public int missingNumber(int[] arr) {
        // Your code here
        
        int i = 0 ;
        
        int n = arr.length;
        
        while(i < n){
            int correct = arr[i]  - 1;
            if ( arr[i] > 0 && arr[i] <= n && arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            
            else {
                i++;
            }
        }
        // System.out.println(Arrays.toString(arr));
        for(int j = 0; j < n; j++ ){
            if(arr[j] != j+1 ){
                return j+  1;
                
            }
        }
        
        return n + 1;
    }
}
