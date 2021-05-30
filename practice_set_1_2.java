//Pa-2 Write a program to calculate CGPA using marks of three subjects (out of 100)
package Java_Exercise;

import java.util.Scanner;

public class practice_set_1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sub1, sub2, sub3;

        System.out.print("Enter the marks of sub1: ");
        sub1 = sc.nextInt();
        System.out.print("Enter the marks of sub1: ");
        sub2 = sc.nextInt();
        System.out.print("Enter the marks of sub1: ");
        sub3 = sc.nextInt();

        double cgpa = (sub1+sub2+sub3)/30;

        System.out.println("cgpa: "+cgpa);

    }
}
