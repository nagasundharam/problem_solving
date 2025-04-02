public class BinarySearch2dMatrix {
    public static void main(String args[]){
        int[][] arr = {{1,3,5,7},{11,13,15,17},{21,23,25,27}};
        int row = arr.length;
        int col = arr[0].length;

        

        int start = 0;
        int end = row * col ;
        int target = 13;

        while(start <= end){
            
            int mid = start + (end - start)/2;
            System.out.println(mid+" "+start+" "+end);
            if (arr[mid/col][mid % col] == target ){
                System.out.println("Target Found");
                break;
            }
            else if (arr[mid/col][mid % col] > target){
                end = mid - 1;
                
            }
            else {
                start = mid + 1;
            }
        }
        System.out.println("Not Found");

    }
}
