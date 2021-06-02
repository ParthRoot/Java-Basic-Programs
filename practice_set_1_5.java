//Write a Java program to detect whether a number entered by the user is an integer or not.
package Java_Exercise;

import java.util.Scanner;

public class practice_set_1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the any number here: ");
        System.out.println(sc.hasNextInt());
    }
}
