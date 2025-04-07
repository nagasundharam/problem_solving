public class CellsWithOddValues {
   
        public int oddCells(int m, int n, int[][] indices) {
            int[][] mat = new int[m][n];
            int l = indices.length;
    
            for(int[] index : indices){
                mat[index[i]]
            }
    
    
        
            int count = 0;
           for(int i = 0 ; i  < n * m ; i++){
            if (mat[i/n][i%n] % 2 != 0){
                count++;
    
            }
    
          
    
           }
             return count;
                
    }
    }

