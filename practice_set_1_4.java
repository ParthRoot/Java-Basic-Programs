//Write a Java program to convert Kilometers to miles.
package Java_Exercise;

import java.util.Scanner;

public class practice_set_1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the kilometer here: ");
        double kimi = sc.nextDouble();

        double miles = kimi * 0.62137;

        System.out.println(kimi+" Kilometer = "+miles+" Miles");

    }
}
