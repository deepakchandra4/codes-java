//Method overloading can have same name of the multiple method with different parameters.

class Method_overloading{
    static int method(int x,int y){
        return x + y;
    }
    static double method(double x , double y){
        return x + y;
    }
    public static void main(String[] args){
        int m1 = method(4,3);
        double m2  = method(56.2 , 64.2);
        System.out.println(m1);
        System.out.println(m2);
    }
}