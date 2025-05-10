public class findPeakElement2 {

        public int[] findPeakGrid(int[][] mat) {
            int n = mat.length;
            int m = mat[0].length;
            int start = 0 ;
            int end = m - 1;
        
    
    
            while(start <= end){
                
                int mid = (start + end)/2;
    
                int row = maxElement(mat,mid);
    
                int left = (mid > 0)? mat[row][mid - 1] : -1;
    
                int right = (mid < m - 1)? mat[row][mid +1] : -1;
                 System.out.println(mat[row][mid]);
                if (mat[row][mid] > left && mat[row][mid] > right){
                    return new int[] {row,mid};
                }
               
                else if (mat[row][mid]> left){
                    start = mid +1 ;
                }
                else {
                    end = mid - 1;
                }
    
    
            }
            return new int[] {-1,-1};
           
            
        }
        public int maxElement(int[][] mat , int c){
            int max = 0;
            int n = mat.length;
            int ind = 0 ;
            for(int i = 0 ; i < n ; i++){
                if (max < mat[i][c]){
                    max = mat[i][c];
                    ind = i;
                }
                
            }
            return ind;
        }
    }
    

