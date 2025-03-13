import java.util.Arrays;

public class RowColMatrix {
    public static void main(String a[]){
        int[][] arr = {
           {18,21,27,38,55,67}
        };

        System.out.print(Arrays.toString(binarySearch(arr,33)));


    }
    public static int[] binarySearch(int[][] arr,int target){
        int r = 0;
        int c= arr.length - 1;

        while (r < arr.length - 1 && c >=0){
            if (arr[r][c] == target){
                return new int[]{r,c};
            }
            else if (arr[r][c] > target){
                c--;
            }
            else {
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}
