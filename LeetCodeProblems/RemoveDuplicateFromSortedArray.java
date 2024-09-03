    // package LeetCodeProblems;

    public class RemoveDuplicateFromSortedArray {
        public static void main(String[] args) {
            int [] nums = {0,0,1,1,1,2,2,3,3,4};
            int n = nums.length;
            int k = 1;
            for(int i = 0; i <= n - 1; i++ ){
                    if(nums[i] != nums[k+1]){
                        k++;
                    }
            }
            System.out.println();
        }
    }
