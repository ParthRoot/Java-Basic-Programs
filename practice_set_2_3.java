//Write the following expression in a java program:
//v2-u2/2as
package Java_Exercise;

import java.util.Scanner;

public class practice_set_2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v, u, a, s;
        System.out.print("Enter the value of v: ");
        v = sc.nextInt();

        System.out.print("Enter the value of u: ");
        u = sc.nextInt();

        System.out.print("Enter the value of a: ");
        a = sc.nextInt();

        System.out.print("Enter the value of s: ");
        s = sc.nextInt();

        System.out.println((v*v)-(u*u)/(2*a*s));
    }
}
