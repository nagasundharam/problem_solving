import java.util.Arrays;

public class cyclicSort {

    public static void main(String args[]){
        int[] arr = {7,8,5,3,4,2,1,6};

        int  i = 0 ;
        while (i < arr.length){
            if (arr[i] -1 != i) {
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp; 
            }
            if(arr[i] -1 == i)
            {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
