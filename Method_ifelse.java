public class Method_ifelse {
    static void Age_checker(int age){
        if(age > 18){
            System.out.println("Yay You're "+age+" you can drive " );
        }
        else{
            System.out.println("Sorry you're "+age+ " you cannot drive");
        }
    }
    public static void main(String[] args){
        Age_checker(17);
    }
}
