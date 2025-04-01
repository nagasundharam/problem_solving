import java.util.Arrays;

public class checkIfPangaram {

    public boolean checkIfPangram(String sentence) {
        int[] a = new int[26];
        int n = sentence.length();

        for(int i = 0 ; i  < n ; i++){
            a[sentence.charAt(i) - 97]++;

        }
        System.out.println(Arrays.toString(a));
        for(int i = 0 ; i < 26;i++){

            if (a[i] == 0){
                return false;
            }
        }
        return true;

         
    }
}

