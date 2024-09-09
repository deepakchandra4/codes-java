public class BBDthread extends Thread{
public static void main(String[] args){
    BBDthread t = new BBDthread();
    t.start();
    System.out.println("Omg I love you :)");
}
public void run(){
    System.out.println("Babu Banarsi Das University is good College.");
}
}