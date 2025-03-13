import java.util.Arrays;

public class selectionSort {

    public static void main(){
        int[] arr = {5,4,6,8,4,3};
        int n = arr.length;
       
        int index = 0;
        for(int i = 0 ; i < n ; i++){
            index= i;
            for(int j = i + 1 ; j < n ; j++){
                if (arr[index] > arr[j]){
                  
                    index = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;


        }

        System.out.println(Arrays.toString(arr));
    }
    
}
