public class richestToCommonWealth {
    public int maximumWealth(int[][] accounts) {
        int row = accounts.length;
        int col = accounts[0].length;
        
        int large = 0;

        for ( int i = 0 ; i <row;i++ ){
            int sum = 0;
            for(int j = 0; j  < col;j++){
                sum+= accounts[i][j];

            }
            if (sum > large){
                large = sum;
            }
        }

        return large;
        
    }
    
}
