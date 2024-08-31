import java.util.Scanner;

public class Reverse_string
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
		String str = "";
        for(int i = arr.length-1; i >= 0; i--){
          str = str + arr[i];
        }
        System.out.println(str); 
		
	}
}