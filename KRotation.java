import java.util.List;

public class KRotation {
    public int findKRotation(List<Integer> arr) {
        
        int n = arr.size();
        int result = findPivot(arr) + 1;
        // System.out.println(result);
       
       return result % n;
       
    }
    public int findPivot(List<Integer> arr){
        
        int l = arr.size();
        
        int start = 0 ;
        int end = l - 1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            // System.out.println(start +" "+ mid + " " + end);
            
            if (mid < end && arr.get(mid) > arr.get(mid + 1)){
                return mid;
            }
            else if (mid > start && arr.get(mid) < arr.get(mid - 1)){
                return mid - 1;
            }
            if (arr.get(mid) <= arr.get(start)){
                end = mid - 1;
            }
            else {
                start = mid+ 1 ;
                
            }
                
            }
            
            return -1;
        }
        
    }
 
    

