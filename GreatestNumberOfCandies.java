import java.util.ArrayList;
import java.util.List;

public class GreatestNumberOfCandies {
      public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        ArrayList<Boolean> li = new ArrayList<>();

        int max = candies[0];

        for(int i = 0 ; i  < n ; i++){
            if (candies[i]> max){
                max = candies[i];
            }
        }

        for(int i = 0 ;i < n ;i++){
            if ((candies[i] + extraCandies) >= max){
                li.add(true);
            }
            else {
               li.add(false);
            }
        }

        return li;
    }
}
