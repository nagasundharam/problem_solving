import java.util.ArrayList;
import java.util.List;

public class printPatternWithoutLoop {
    

    
    public List<Integer> pattern(int N) {
        ArrayList<Integer> li = new ArrayList<>();
      
        func(N, li, N, false);
        return li;
    }
    public void func(int n,ArrayList<Integer> li,int original,boolean isNegative){
        
        li.add(n);
        if (original <= 0){
            isNegative = true;
        }
        if ( original == n && isNegative){
            return ;
        }
        
        if ( n > 0 && !isNegative){
            func(n - 5,li,original,false);
        }
        else {
            
            func(n + 5,li,original,true);
        }
        
        
       
        
       
    }
}
