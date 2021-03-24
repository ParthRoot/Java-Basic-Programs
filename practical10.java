/*
Write a test program that prompts the user to enter ten numbers,
invoke a method to reverse the numbers, display the numbers.
 */

import java.util.Scanner;

public class practical10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Print Reverse Array:");
        for(int i=n-1;i>=0;i--){
            System.out.print(a[i]+",");
        }

    }
}
