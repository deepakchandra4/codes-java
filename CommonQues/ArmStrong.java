// package CommonQues;

public class ArmStrong {
    static void armstrongNum(int num){
        int rem , result=0 , originalNum ;
        originalNum = num;
        while(originalNum > 0){
            rem = originalNum % 10;
            result = result + (rem*rem*rem);
            originalNum = originalNum/10;
        }
        if(result == num){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }
    public static void main(String[] args) {
        armstrongNum(153);
        armstrongNum(20);
    }
}