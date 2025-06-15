//palindrome
//String
//Longest Common Prefix
//Roman to int




package StartingOut;

public class Basic{
    
    public static void main(String[] args){
        System.out.println("Hell");
        Palindrome(13421);
    }

    static void Palindrome(int num){
        int originalNum = num , reverseNum = 0 ;
        while(num > 0){
            int rem  = num % 10;
            reverseNum = (reverseNum * 10) + rem;
            num = num / 10;
        }
        if(originalNum == reverseNum){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }

}


/*

*/


/*
    
num = 121
orginalnum = num ,  reverseNum=0 , sum

while(num > 0){
 rem = num % 10 - 121/10 = 1 , 2
 reverseNum = (reverseNum * 10) + rem -> 0*10 = 0+1 , 1*10 = 10+2 , 12*10 = 120+1 = 121
 num = num/10 -> 12 , 1 , 0

}
 if(originalNum == reverseNum){
     palindrome
 }else
    Not




*/