import java.util.ArrayList;

public class firstAndLastOccur {
     ArrayList<Integer> find(int arr[], int x) {
        // code here
        
        ArrayList<Integer> li = new ArrayList<>();
        
        int first = binarySearch(arr,x,true);
        if (first == - 1){
            li.add(first);
            li.add(first);
            
            return li;
            
        }
        
        int last = binarySearch(arr,x,false);
        
        li.add(first);
        li.add(last);
        return li;
    }
    
    public int binarySearch(int arr[],int k,boolean first){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] == k){
                ans = mid;
                if (first){
                     
                end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
               
                
            }
            else if (arr[mid] > k){
                end = mid - 1;
            }
            else {
                start =mid + 1;
            }
        }
        return ans;
    }
    
}
