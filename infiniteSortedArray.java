// Java program to demonstrate working of an algorithm that
// finds an element in an array of infinite size

class GfG {
  
    static int binarySearch(int[] arr, int target,
                            int start, int end) {
      
        // Perform binary search within the range [start,
        // end]
        while (start <= end) {
          
            // Calculate the mid index
            int mid = start + (end - start) / 2;

            // If target is smaller, search the left half
            if (target < arr[mid]) {
                end = mid - 1;
            }
          
            // If target is larger, search the right half
            else if (target > arr[mid]) {
                start = mid + 1;
            }
          
            // If target is found, return the index
            else {
                return mid;
            }
        }
      
        // If the target is not found, return -1
        return -1;
    }

    // An algorithm that finds an element in an array of
    // infinite size
    static int findPos(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int size = end - start ;
            end = end +  size * 2;
            start = size + 1;
        }
      
      return binarySearch(arr,target,start,end);
        
       
    }

    public static void main(String[] args) {
      
        int[] arr = { 3, 5, 7, 9, 10, 90,
                      100, 130, 140, 160, 170 ,175,180,185,190,200,205,210};

        int target = 7;
        int ans = findPos(arr, target);
        System.out.println(ans);
    }
}
