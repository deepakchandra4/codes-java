public class AbundantNum {
    static void abundantNumber(int num){
        int sum = 0;
        for(int i=1; i<=num/2; i++){
            if(num%i==0){
                sum += i;
            }
        }
        if(sum > num){
            System.out.println(num + " is Abundant Number");
        }else{
            System.out.println(num + " is not Abundant Number");
        }
    }
    public static void main(String[] args) {
        abundantNumber(15);
    }    
}
