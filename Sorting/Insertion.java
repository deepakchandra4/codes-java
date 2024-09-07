public class Insertion {
    static void insertMethod(int[] arr){
        for(int i=1; i <= arr.length - 1; i++){
            int currentValue = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > currentValue){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = currentValue;
        }
        for(int i=0;  i< arr.length; i++){
            System.out.print(arr[i]+" , ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] a = {4 , 3 ,1 , 7 ,9};
        int[] arr = a;
        insertMethod(arr);
    }
}
