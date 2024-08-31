import java.util.*;

public class ExceptionHandling {
    static void exceptionHandlingMethod() {
        
        try {
            int [] n = {1 ,2 ,3};
            System.out.println(n[10]);
        } catch (Exception e) {
            System.out.println("There is error");
        }finally{
            System.out.println("Finished");
        }
    }  

    public static void main(String[] args) {
        exceptionHandlingMethod();
    }
}
