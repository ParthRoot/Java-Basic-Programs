/*
Write a program that generate 6*6 two-dimensional matrix, filled with 0’s and 1’s
 , display the matrix, check every raw and column have an odd number’s of 1’s.
 */

import java.lang.Math;
import java.util.Scanner;

public class practical11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[6][6];

        //generate matrix
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length;j++){
                int a = (int)(Math.random()*10);
                int x = a%2;
                arr[i][j] = x;
            }
            System.out.println("");
        }
        //display matrix
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }

        //count the row and column

        for(int i=0;i< arr.length;i++){
            int count_raw = 0;
            int count_col = 0;
            for(int j=0;j< arr.length;j++){
                if (arr[i][j] == 1){
                    count_raw = count_raw + 1;
                }
            }
            if(count_raw % 2 == 0){
                System.out.println("Raw "+(i+1)+" have odd number of 1s");
            }

        }

        for(int i=0;i< arr.length;i++){

            int count_col = 0;
            for(int j=0;j< arr.length;j++){
                if (arr[j][i] == 1){
                    count_col = count_col + 1;
                }
            }
            if(count_col % 2 == 0){
                System.out.println("Col "+(i+1)+" have odd number of 1s");
            }

        }





    }
}
