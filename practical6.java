//Write a program that prompts the user to enter a letter and check whether a letter is a vowel or constant.

import java.util.Scanner;

public class practical6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the those character here if you check this is vowel or not");
        char a = sc.next().charAt(0);

        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
            System.out.println(a + " is Vowel");
        } else {
            System.out.println(a + " is not Vowel");
        }
    }
}

