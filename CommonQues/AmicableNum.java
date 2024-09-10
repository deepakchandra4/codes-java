public class AmicableNum {
    static void amicableNumber(int num1 , int num2){
        int sum1 = 0;
        int sum2 = 0;
        for(int i=1; i <= num1/2; i++ ){
            if(num1%i==0){
                sum1 += i;
            }
        }
        for(int i=1; i <= num2/2; i++ ){
            if(num2%i==0){
                sum2 += i;
            }
        }
        if(sum1 == num2  && sum2 == num1){
            System.out.println("Amicable");
        }else{
            System.out.println("Not Amicable");
        }
    }
    public static void main(String[] args) {
        amicableNumber(220, 284);
    }    
}
