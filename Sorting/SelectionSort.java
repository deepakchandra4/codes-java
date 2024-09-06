import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        int []arr = { 5,1,3,4,6 };
        for(int i = 0; i <= arr.length - 1; i++){
            int smallest = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        for(int i : arr){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}