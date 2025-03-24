import java.util.*;

public class spiralMAtrix {
    public static void main(String args[]){
        int n  = 5;

        int left = 0 ;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;
        int[][] matrix = new int[n][n];
        int count = 0;

        while(top <= bottom && left <= right){
            for(int i = left ; i <= right ; i++){
                count++;
               matrix[top][i] = count;
            }
            top++;
            for(int i = top ; i <= bottom ; i++){
                count++;
               matrix[i][right] = count;
            }
            right--;
            if (top <= bottom){
            for(int i = right ; i >= left ; i--){
                count++;
               matrix[bottom][i] = count;
            }
        }
        bottom--;
        if (left <= right){
            for(int i = bottom ; i >= top  ; i--){
                count++;
               matrix[i][left] = count;
            }
        }
        left++;
    }

    for(int i = 0 ; i < n ;i++){
        System.out.println(Arrays.toString(matrix[i]));
    }

    }
}
