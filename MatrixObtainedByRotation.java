public class MatrixObtainedByRotation {


        public int[][] Rotate(int[][] mat){
         
           int n = mat.length;
            int m = mat[0].length;
            int[][] nmat = new int[n][m];
    
            for(int i = 0 ; i < n ; i++){
                for(int j = 0 ; j < m ; j++){
                   
                    nmat[i][j] = mat[j][n - i-1];
              
    
                }
            }
    
            return nmat ;
            
        }
        public boolean checkSame(int[][] mat, int[][] target){
            int n = mat.length;
            int m = mat[0].length;
            for(int i = 0 ; i < n ; i++){
                for(int j = 0 ; j< m ;j++){
                    if (mat[i][j] != target[i][j]){
                         return false;
                    }
                }
            }
            return true;
        }
        public boolean findRotation(int[][] mat, int[][] target) {
    
            mat = Rotate(mat); 
           int count = 0;
    
           while(count != 4){
             mat = Rotate(mat);
             if (checkSame(mat,target)){
                return true;
             }
             count++;
           }
           return false;
    
    
            
        }
    }

