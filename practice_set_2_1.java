//Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade
package Java_Exercise;

import java.util.Scanner;

public class practice_set_2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the grade here: ");
        char c = 'B';

        char d = (char)(c + 8);

        System.out.println("Decrypted grade is: "+d);

        char e = (char)(d - 8);
        System.out.println("Encrypted grade is: "+e);
    }
}
