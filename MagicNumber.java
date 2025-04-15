public class MagicNumber {
    public static int main(String[] args){
        int n = 3;
        int base = 5;

        int sum = 0;

        while (n> 0){
            int last = n & 1;
            sum+= last * base;

            base = base * 5;
            n = n >> 1 ;

        }
        System.out.println(sum);
    }
    
}
