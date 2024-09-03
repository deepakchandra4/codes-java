import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Time of Complexity : O(n)
        // Space Complexity : O(n) - cause We are using any extra space.

        HashMap<Integer, Integer> map = new HashMap<Integer , Integer>();

        // filling Hashmaps with values.
        for (int i = 0; i < nums.length - 1; i++) {
            map.put(nums[i], i);
        }

        // for searching values.
        for (int i = 0; i <= nums.length - 1; i++) {
            int num = nums[i];
            int remaining = target - num;
            int secIndex = map.get(remaining);
            if (map.containsKey(remaining)) {
                return new int[] { i, secIndex };
            }
        }
        return new int[] {};

        // ======BruteForce Techinque==========
        // Time of Complexity : O(n^2)
        // Space Complexity : O(1) - cause We are not using any extra space.

        // for (int i = 0; i < nums.length - 1; i++) {
        // for (int j = i + 1; j <= nums.length - 1; j++) {
        // if (nums[i] + nums[j] == target) {
        // return new int[] { i, j };
        // }
        // }
        // }
        // return new int[] {}; // return empty array if no soltuon found.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");
        int n = sc.nextInt();

        System.out.println("Enter array separated  with : ");
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter you Target number : ");
        int target = sc.nextInt();

        Solution sol = new Solution();

        int[] result = sol.twoSum(nums, target);
        if (result.length == 2) {
            System.out.printf(" Indices : %d , %d%n ", result[0], result[1]);
        } else {
            System.out.print("No solution found");
        }

        System.out.println(result);
        sc.close();

    }
}
