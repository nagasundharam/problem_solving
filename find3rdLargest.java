public class Solution {
    int thirdLargest(int arr[]) {
        if (arr.length < 3) return -1;

        Integer first = null, second = null, third = null;

        for (int num : arr) {
            if (num == first || num == second || num == third) continue;

            if (first == null || num > first) {
                third = second;
                second = first;
                first = num;
            } else if (second == null || num > second) {
                third = second;
                second = num;
            } else if (third == null || num > third) {
                third = num;
            }
        }

        return third != null ? third : -1;
    }
}
 {
    
}
