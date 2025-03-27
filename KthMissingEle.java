public class KthMissingEle {
   
        public int kthMissing(int[] arr, int k) {
            // code here
            
            
            int n = arr.length;
            int last = 100;
            int[] arr1 = new int[1000000];
            
            int index = 0;
            
            for(int i = 0; i < n; i++){
                arr1[arr[i]]++;
            
                
                
                
            }
            int count = 0;
            
            for(int i = 1 ; i < 1000000;i++){
                if (arr1[i]  == 0){
                    count++;
                    
                    
                }
                if (count == k){
                    return i;
                }
                
            }
              return -1;
            
        }
      
    }

