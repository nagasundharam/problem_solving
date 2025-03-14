public class anagram {
    public static boolean areAnagrams(String s1, String s2) {
        
        int[] arr1 = new int[256];
        int[] arr2 = new int[256];
        int n1 = s1.length();
        
        int n2 = s2.length();
        
        if (n1 != n2){
            return false;
        }
        
        for(int i = 0 ; i < n1 ; i++){
            arr1[s1.charAt(i)]++;
            arr2[s2.charAt(i)]++;
        }
        for(int j = 0 ; j < 256;j++){
            if (arr1[j] != arr2[j]){
                return false;
            }
        }
        return true;

        
    }
    
}
