/*Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking your weight in kilograms and dividing by the square of your height in meters. Write a program that prompts the user to enter a weight in pounds and height in inches and displays the BMI.
        Note:- 1 pound=.45359237 Kg and 1 inch=.0254 meters.
        bmi = kg/m^2
 */

import java.util.Scanner;
import java.lang.Math;

public class practical4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Pounds Here:");
        double pound = sc.nextDouble();
        System.out.println("Enter the inches here:");
        double inch = sc.nextDouble();

        // convert pound in kg
        double kg = pound * 0.45359237;
        // convert inch in meter
        double meter = inch * 0.0254;

        //calculate BMI
        double bmi = kg / Math.pow(meter, 2);
        System.out.println("BMI:-"+bmi);

    }
}
