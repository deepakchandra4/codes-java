import java.util.*;
public class VectorProgram2{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        Vector v = new Vector(5,2);
        for(int i =0; i<5;i++ ){
            System.out.println("Enter the Elements : ");
            int a = sc.nextInt();
            v.add(a);
        }
        System.out.println("Enter a index you want to delete from these elements "+v);
        int b = sc.nextInt();
        
       
        System.out.println("deleted element "+v.get(b));
        v.remove(b);
        System.out.println(v);

    }
}