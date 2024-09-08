// package Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        // int[][] num = new int[5][5];
        int[][] num = { { 4, 5, 6 }, { 3, 3, 4, 3, 5 }, { 4, 8, 9, 6, 4 } };

        int x = 3;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (x == num[i][j]) {
                    System.out.print(i +""+ j);
                }
            }
            System.out.println();
        }
    }
}
