//pa1- Write a program to sum three numbers in Java.

package Java_Exercise;

import java.util.Scanner;

public class practice_set_1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;

        System.out.print("Enter the value of a: ");
        a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        b = sc.nextInt();

        System.out.print("Enter the value of c: ");
        c = sc.nextInt();

        int sum = a+b+c;

        System.out.println("sum of "+a+"+"+b+"+"+c+" = "+sum);

    }
}
