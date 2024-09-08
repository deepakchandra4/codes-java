import java.util.Scanner;
public class Array{
    public static void main(String[] args){
        String[] city = {"Lucknow" , "Prayagraj" , "Pratapgarh"};
        for(String i : city){
            System.out.println(i);
        }
        int[][] num = {{1 ,2, 3 ,4} , {9 ,7 ,8 ,6 }};
        int x = num[1][2];
        System.out.println(x);
        for(int i = 0; i < num.length; ++i){
            for(int j = 0; j < num.length; ++j){
               System.out.println(num[i][j]);
       }
        }
    }
}