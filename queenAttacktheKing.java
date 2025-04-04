class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        
       List<List<Integer>> li = new ArrayList<List<Integer>>();
        int n  = queens.length;
        int[][] chess = new int[8][8];

        for(int i = 0 ; i  < n ; i++){
            chess[queens[i][0]][queens[i][1]] = 1 ;

        }
        chess[king[0]][king[1]] = 2 ;

        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0},{1,1},{1,-1},{-1,1},{-1,-1}};
        
        for(int i = 0 ; i < 8 ;i++){
            int r = king[0];
            int c = king[1];

            while(r >= 0 && r < 8 &&  c >= 0 && c < 8){
                r+=dir[i][0];
                c+=dir[i][1];
                System.out.println(r+" " + c);

                if (r >= 0 && r < 8 &&  c >= 0 && c < 8){
                if (chess[r][c] == 1){
                    List<Integer> l = new ArrayList<>();
                    l.add(r);
                    l.add(c);
                    li.add(l);
                    break;
                }
            }
            }
        }


     return li ;
    }
}
