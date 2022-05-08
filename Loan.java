import java.util.Scanner;
class Loan{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter loan you want to take : ");
    int loan = sc.nextInt();
    int month1 = ((loan/100) * 10);
    System.out.println("10% of "+loan+ " is " + month1);
    int left = loan-month1;
    System.out.println("Remaining amount : "+left );
    int month2 = ((left/100) * 10);
    System.out.println("10% of "+left+ " is " + month2);
    int left1 = left - month2;
    System.out.println("Remaining amount : " + left1);
    int month3 = ((left1/100) * 10);
    System.out.println("10% of "+left1+ " is " + month3);
    int left2 = left1 -month3;
    System.out.print("Remaining amount : " + left2);
    }
}