public class KthMissingEle2BinarySearch {

        public int findKthPositive(int[] arr, int k) {
            int start = 0 ;
            int end = arr.length - 1;
    
            while(start <= end){
                int mid = start + (end - start)/2;
    
                int miss = arr[mid] - (mid + 1);
    
                if (miss < k){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            return end + 1 + k ;
           
            
        }
    }

