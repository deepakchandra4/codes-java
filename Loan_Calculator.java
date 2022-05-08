import java.util.Scanner;

public class Practice
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		for(int i = 1; i<=3; i++){
			int real_amount = amount * 3/10;
			amount =  amount - real_amount; 
		}
        System.out.println(amount);
		
	}
}
