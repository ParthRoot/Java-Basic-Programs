//Ex-1 CBSE Board Percentage Calculator
package Java_Exercise;

import java.util.Scanner;

public class exercise_1 {
    public static void main(String[] args) {
        int maths, eng, sci, ss, com;

        Scanner sc = new Scanner(System.in);

        System.out.println("Marks is out of 100: ");

        System.out.println("Enter the maths marks here: ");
        maths = sc.nextInt();
        System.out.println("Enter the english marks here: ");
        eng = sc.nextInt();
        System.out.println("Enter the science marks here: ");
        sci = sc.nextInt();
        System.out.println("Enter the social science marks here: ");
        ss = sc.nextInt();
        System.out.println("Enter the computer marks here: ");
        com = sc.nextInt();

        double per;
        per = ((maths+eng+sci+ss+com)/500.0)*100;
        System.out.println("Percentage: "+per+"%");
    }
}
