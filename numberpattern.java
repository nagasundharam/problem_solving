import java.util.ArrayList;

public class numberpattern {

    public static void main(String a[]){
        int n = 9 ;
        printPat(n);
    }
     public static  ArrayList<Integer> printPat(int n) {
        ArrayList<Integer> li = new ArrayList<>();

        for (int i = 0; i < n ; i++) {
            int d = 0 ;
            int count = 0;
            for (int j = 0; j < n * (n - i); j++) {
                if (count == n - i ){
                    d++;
                    count = 0;
                    System.out.print('/');
                }
                count++;

                System.out.print(n - d);
                li.add(n - d);
                
            }
            System.out.println();
            li.add(-1);
        }

        return li;
    }
}
