//Concurrency problem.
//A code where the value of the variable amount is unpredictable.
//we will use isAlive() to avoid concurency Problem.
//isAlive is used for checking whetther the thread has finished running before using any other attribute that thread can change.
public class BBDthread_2 extends Thread{
    public static int amount = 0;
public static void main(String[] args){
    BBDthread_2 bbdu = new BBDthread_2();
    bbdu.start();
    while(bbdu.isAlive()){
    System.out.println("waiting at tmeptation ...");
}
System.out.println("BBD  Thread : " +amount);
amount++;
System.out.println("BBD Thread: " +amount);
}
public void run(){
    amount++;
}
}