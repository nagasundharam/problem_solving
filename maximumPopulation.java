public class maximumPopulation {
 
        public int maximumPopulation(int[][] logs) {
    
            int n = logs.length;
    
            int[] note = new int[101];
    
            for(int i = 0 ; i < n ; i++){
                note[logs[i][0] - 1950]++;
                note[logs[i][1] - 1950]--;
            }
            for(int  i = 1 ; i < 101 ;i++){
                note[i] = note[i - 1]+ note[i];
            }
            int max = 0 ;
            int ind = 0;
            for(int  i = 0 ; i < 101;i++){
                if (note[i] > max){
    
                    max = note[i];
                    ind = i;
    
                }
            }
    
            return ind + 1950;
    
    
            
    
          
           
          
        }
    }
    

