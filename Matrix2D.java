public class Matrix2D {
    public static void main(String args[]){

        int[][] arr ={{1,2,3},{5,7,4},{6,10,11}};
        
        int row = arr.length;
        int col = arr[0].length;
        int target = 4;

        for(int i = 0 ; i < (row * col) ; i++){
            int r = i/col;
            int c = i % col;


            if (arr[r][c] == target ){
                System.out.println(r+ " " + c);
            }
        }

        System.out.println("Program finished");
    }
}
