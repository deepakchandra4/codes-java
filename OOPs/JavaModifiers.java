public class JavaModifiers {
    //lets make static method 
    static void myStaticMethod() {
        System.out.println("This is static class , it does not need to create object to be called.");
    }

    //public method 
    public void myPublcMethod(){
        System.out.println("It needs an object to be called.");
    }
    //==========================These are access modifiers ================================
    //default modifiers are accessible inside the same package , their classes and subclassses.this is used when we don't specify any modifiers.
    //public : code can be accessible to all the classes out there.
    //private :  code can be accessed by only inside the class.
    //protected : code can by access within the same package and sub classes.


    //===============No Access Modifiers =========================
    /* final : the class can not be inherited to other class.
        abstract :  this class can not used to create objects , to access abstract class it must be inherited to other class.
     */

    public static void main (String args[]){
        myStaticMethod();
        JavaModifiers jm = new JavaModifiers();
        jm.myPublcMethod();
    }
}
