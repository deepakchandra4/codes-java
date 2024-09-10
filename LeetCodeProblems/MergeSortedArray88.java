import java.util.Arrays;

public class MergeSortedArray88{
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m + n]; // will create new array and store length of both arrays after adding it(length)
        int i = 0, j = 0, k = 0; // initialize this to access elements inside arrays.
        while (i < m && j < n) { // looping , while i is less than m , and j less than n.
            if (nums1[i] < nums2[j]) { // checks condition if nums1 element is smaller than nums2.
                temp[k] = nums1[i]; // updating values of temp element with the nums1
                i++;
                k++; // increase the value for further to check remaining value.
            } else {
                temp[k] = nums2[j]; // update temp element woth nums2 element from 0th one.
                j++;
                k++; // increase the value.
            }
        }
        while (i < m) {
            temp[k] = nums1[i];
            k++;
            i++;
        }
        while (j < n) {
            temp[k] = nums2[j];
            j++;
            k++;
        }
        for (i = 0; i < (m + n); i++) {
            nums1[i] = temp[i];
        }
    }
    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        int n = 3 , m = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}