import java.util.Arrays;

public class PlusOne61 {
    static int[] plusOne(int[] digits) {
        int n = digits.length - 1;  //2
        for(int i = n; i >= 0; i--){ //2 to 0
            if(digits[i] < 9 ){ //3 < 9 
                digits[i] = digits[i] + 1 ; //3 + 1 = 4
                return digits; //[1 , 2, 4]
            }
            digits[i] = 0; // if 9 then i = 0
        }
        digits = new int[digits.length+1]; //0 + 1 = 2 is length of the array
        digits[0] = 1; // 0 th index = 1 value 
        return digits; // [1 , 0] 
    }
    public static void main(String[] args) {
        int digits[] = {1,2,3};
        int[] result = plusOne(digits);
        System.out.println(Arrays.toString(result));  // Print the result using Arrays.toString()
    }
}
