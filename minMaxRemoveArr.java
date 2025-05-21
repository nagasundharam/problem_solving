public class minMaxRemoveArr {
 
    public double average(int[] salary) {
        int n = salary.length;

        int min = salary[0];
        int max = 0 ;
        double sum = 0.0000;

        for(int i = 0 ; i < n ; i++){
            if (min > salary[i]){
                min = salary[i];
            }
            if (max < salary[i]){
                max = salary[i];

            }

            sum+=salary[i];
        }
        sum = sum - min - max;

        return sum/(n-2);
        
        
    }
}

