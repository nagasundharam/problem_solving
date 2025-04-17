import java.util.ArrayList;
import java.util.List;

public class LuckyNumberInMatrix {
   
    public List<Integer> luckyNumbers(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> li = new ArrayList<>();

        for(int i = 0 ; i < n ; i++){
            int min = Integer.MAX_VALUE;
            int ind =0 ;

            // finding min in row
            for(int j = 0 ; j < m ; j++){
                if (min > matrix[i][j]){
                    min = matrix[i][j];
                    ind = j;
                }

            }
            int max = min;
            // finding min is max in column or not
            for(int k = 0 ; k < n;k++){
                if (max < matrix[k][ind]){
                    max = matrix[k][ind];
                    break;

                }
                
                
            }
            //checking max == min if min is maximum in an matrix then it is a lucky number
            if (max == min) {
                li.add(max);

            }
        }
        return li ;
        
    }
}
