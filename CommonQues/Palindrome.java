// package CommonQues;

public class Palindrome {
    static void palindromeNumber(int num){
        int originalNum = num , reverseNum = 0 , rem;
        while(num > 0){
            rem = num %10 ;
            reverseNum = (reverseNum * 10 ) + rem;
            num = num / 10;
        }
        if(originalNum == reverseNum){
            System.out.println("It is palindrome Number");
        }else{
            System.out.println("It is not Palindrome");
        }
    }
    public static void main(String[] args) {
        palindromeNumber(121);
        palindromeNumber(112);
    }
}
