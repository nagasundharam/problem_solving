class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        if (n == 1){
            return arr[0];
        }
        if (arr[0] > arr[1]){
            return arr[0];
        }
        if (arr[n - 1] > arr[n-2]){
            return arr[n - 1];
        }
         start = 1;
        end = n- 2;

        while(start <= end){
            int mid = start + (end - start)/2;
            if ((arr[mid] > arr[mid + 1]) && ((arr[mid] > arr[mid - 1]))){
                return mid;
            }
            if (arr[mid] < arr[mid - 1]){
                end= mid -1 ;
               

            }
            else  {
                start = mid + 1;
            }
        }

        return - 1;
    }
}