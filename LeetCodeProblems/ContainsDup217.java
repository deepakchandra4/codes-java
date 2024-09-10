import java.util.HashSet;

public class ContainsDup217 {
    static boolean containsDuplicate(int[] nums){
        HashSet<Integer> hs = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {

            if (hs.contains(nums[i])) {
                return true;
            }
            hs.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3 , 1 };
        boolean result = containsDuplicate(nums);
        System.out.println(result);
    }
}
