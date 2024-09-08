interface Subject{
    public void Maths();
}
interface Teacher {
    public void Don();
}
class DAA implements Subject{
    public void Maths(){
        System.out.println("10 + 20 = 30");
    }
    public void Don(){
        System.out.println("Habeeb Ulla the fuckin'  Don ");
    }
}
public class MultipleInterface{
    public static void  main(String[] args){
        DAA d = new DAA();
        d.Maths();
        d.Don();
    } 
}
