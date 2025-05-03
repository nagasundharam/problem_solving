class Solution {
    public int mySqrt(int x) {
     
    double y = x ;
    int n = x;
    double root = 0;
    if (x == 0 || x == 1 ){
        return x ;
    }

    while(true){
         root = 0.5 * (y + n/y);  
        System.out.println(root);
         System.out.println(y);
        if (Math.abs(root - y) < 1){
            break;
        }
      

        y =  root;
    }
       return  (int) root ;

       

    }
}