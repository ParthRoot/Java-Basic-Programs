//Write a program that reads a number in meters, converts it to feet, and displays the result.
import java.util.Scanner;
public class practical3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Meters Here:");
        double a = sc.nextDouble();

        double feet = a * 3.2808;
        System.out.println("Meter "+a+"="+feet+" Feet");
    }
}
