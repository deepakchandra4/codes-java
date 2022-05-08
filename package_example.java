package mypack;
interface addition{
    abstract void sum(int a, int b);
}
abstract class multi implements addition{
    abstract void mul(int a, int b);
}
class div extends multi{
    public void sum(int a,int b){
        System.out.println("the sum of the number is :"+(a+b));
    }
    public void mul(int a,int b){
        System.out.println("the multiplication of the number is :"+(a*b));
    }
    public void divide(int a, int b){
        System.out.println("the dividation of the number is :"+(a/b));
    }
}
public class package_example {
    public static void main(String[] args) {
        div d=new div();
        d.sum(5,5);
        d.mul(5,5);
        d.divide(10,5);
    }
}