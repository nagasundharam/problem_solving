public class missingNumber {
    public static int miss(int[] nums) {
        int n = nums.length;
    int sum = n * (n+1) / 2;
    int s=0;
    for (int i=0;i<n;i++)
    {
        s += nums[i];
    }

    int missingnumber = sum - s;
    return missingnumber;

    

       
    }
    public static void main(String a[]){
        int[] nums = {1,4,2,3,6,7,8,5};
        System.out.println(miss(nums));

    }
}