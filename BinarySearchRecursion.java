public class BinarySearchRecursion {
    public static void main(String args[]) {
        int[] arr = {1, 2, 4, 6, 8, 11, 22, 33};
        int target = 11;
        System.out.println(binarySearch(arr, target, 0, arr.length - 1));
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1; // Base case: target not found
        }

        int mid = start + (end - start) / 2; // Calculate mid index

        if (arr[mid] == target) {
            return mid; // Target found, return index
        }

        if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, end); // Search right half
        }

        return binarySearch(arr, target, start, mid - 1); // Search left half
    }
}
