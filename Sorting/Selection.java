public class Selection {

    static void selectionSortMethod(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int small = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[small] > arr[j]) {
                    small = j;
                }
            }

            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
        for(int i = 0; i<=arr.length - 1; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 2, 4, 6, 2 };
        selectionSortMethod(arr);
    }
}