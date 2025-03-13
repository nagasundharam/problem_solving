import  java.util.Arrays;

public class insertionSort {
    public static void main(String a[]){
        int[] arr = {5,4,6,8,4,3};
        int n = arr.length;
       
        for(int i = 1 ; i < n ; i++){
            

            int j = i - 1;
            int key = arr[i];

            while(j >=0 && key < arr[j]){
               arr[j+1] = arr[j];
               j--;
            }
            arr[j+1] = key;
        }

        System.out.println(Arrays.toString(arr));

    }
    
}
