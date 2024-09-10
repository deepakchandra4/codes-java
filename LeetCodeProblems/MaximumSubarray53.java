public class MaximumSubarray53{
    static int maxSubArray(int[] nums) {
        int currMax = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            currMax = Math.max(sum , currMax);
            if(sum < 0){
                sum = 0;
            }
        }
        return currMax;


        //Brute Force 
        // int max = Integer.MIN_VALUE;
        // for (int i = 0; i < nums.length; i++) {
        //     int sum = 0;
        //     for (int j = i; j < nums.length; j++) {
        //         sum += nums[j];
        //         max = Math.max(sum, max);
        //     }
        // }
        // return max;
    }
    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        int result = maxSubArray(nums);
        System.out.println(result);
    }
}