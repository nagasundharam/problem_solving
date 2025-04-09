
    public int diagonalSum(int[][] mat) {

        int sum = 0 ;
        int n = mat.length;
        int m = mat[0].length;
        int r = 0 ;
        int c = 0;

        for(int i = 0 ; i < n ; i++){
            if(r < n && c < m){
                 sum+=mat[r][c];

            }
            else{
                break;
            }
           
          
            r++;
            c++;

        }
        r = 0 ;
        c = n - 1;
        for (int i = 0 ; i < n ;i++){
                if(r < n && c < m){
                 sum+=mat[r][c];

            }
            else{
                break;
            }
           
          
            r++;
            c--;
        }

        if (m % 2 != 0){
            sum -= mat[m/2][m/2];
        }

        return sum;

    }


        