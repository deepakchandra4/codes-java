import java.util.Arrays;

public class RunningSumof1dArray1480{
    static int[] runningSum(int[] nums) {
        for(int i = 1; i<nums.length; i++){
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int[] result = runningSum(nums);
        System.out.println(Arrays.toString(result));
    }
}
