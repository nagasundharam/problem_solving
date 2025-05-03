public class FairAndCandy {
  
    public int[] fairCandySwap(int[] al, int[] bob) {
        int n = al.length;
        int m  = bob.length;
        
        int sum1 = 0;
        int sum2 = 0;
        Set<Integer> set  = new HashSet<>();

        for(int i = 0 ; i < n ; i++){
            sum1+= al[i];

        }
        for(int i = 0 ; i < m ; i++){
            set.add(bob[i]);
            sum2+= bob[i];
        }
        System.out.println(sum1);
         System.out.println(sum2);
         int[] ans = new int[2];
         int delta = (sum2 - sum1)/2;

         for(int i = 0 ; i < n ; i++){
            int val = delta + al[i];
            if (set.contains(val)){
                ans[0] = al[i];
                ans[1] = val;
            }
         }
         return ans ;

        

       

       
            
          
             
   


            
        
    }
}

