public class diagonalMatrix {

        public int[] findDiagonalOrder(int[][] mat) {
              int n = mat.length;
            int m = mat[0].length;
            
            int size = n * m;
            int r = 0 ;
            int c = 0;
    
            int[] arr = new int[n*m];
            
            boolean up = true;
            
            for(int i = 0 ; i < size ; i++){
                arr[i] = mat[r][c];
                
                if(up){
                    if(r == 0){
                        if (c == m - 1 ){
                            r++;
                        }
                        else {
                        c++;
                        }
                        up = false;
                        continue;
                    }
                 
                   if (c == m - 1){
                       r++;
                       up = false;
                       continue;
                   }
                    
                    r--;
                    c++;
                    
                    
                }
                else{
                     if(c == 0){
                         if (r == n - 1){
                             c++;
                         }
                         else{
                        r++;
                         }
                        up = true;
                        continue;
                    }
                    
                    if(r == n - 1){
                        c++;
                       up = true;
                        continue;
                    }
                  
                    r++;
                    c--;
                    
                }
               
                
            }
            return arr ;
            
        }
    }

