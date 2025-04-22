public class RemoveDuplicatesSortedArray {
\
        // Function to remove duplicates from the given array
        public int removeDuplicates(int[] arr) {
            // Code Here
            int count = 1 ;
            int n= arr.length; 
            
            for(int i = 1 ; i < n ; i++){
                if (arr[i] != arr[i - 1]){
                    arr[count] = arr[i];
                    count++;
                }
            
            }
            return count;
            
           
        
        }
    }
    
