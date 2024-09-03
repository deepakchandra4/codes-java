    // package LeetCodeProblems;

    public class RemoveDuplicateFromSortedArray {
        public static void main(String[] args) {
            int [] nums = {0,0,1,1,1,2,2,3,3,4,5,5};
            int j = 0;
            for(int i = 0; i<nums.length-1; i++){
                if(nums[j] != nums[i]){
                    //or we can increment first j++
                    nums[++j] = nums[i];  //and change this to nums[j] = nums[i]
                }
            }
            System.err.println(++j); //or j+1
        }
    }
