// package CommonQues;

import java.util.Scanner;

public class PrimeNumber {
    static void primeNumber(int num) {
        boolean isPrime = false;
        if (num <= 1) {
            System.out.println(isPrime);
        }
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(!isPrime);
            }
        }
        if (!isPrime) {
            System.out.println("It is Prime Number");
        } else {
            System.out.println("It is not prime Numbers");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check Prime Number : ");
        int num = sc.nextInt();
        primeNumber(num);
    }
}
