//Write a Java program that asks the user to enter his/her name and greets them with “Hello <name>, have a good day” text
package Java_Exercise;

import java.util.Scanner;

public class practice_set_1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the his/her name here: ");
        String name = sc.next();

        System.out.println("Hello "+name+", have a good day");
    }
}
