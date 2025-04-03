public class KthmissingEle1 {

        public int findKthPositive(int[] arr, int k) {
            int n = arr.length;
            int[] h = new int[10000];
    
            for(int i = 0 ; i < n ;i++){
                h[arr[i]]++;
            }
            int count = 0 ;
            int  ind = 0;
            for(int i =1 ; i < 100000 ; i++){
                if (h[i] == 0){
                    count++;
                }
                if (count == k){
                    ind = i;
                    break;
                }
    
            }
            return ind ;
    
    
            
        }
    }
    

