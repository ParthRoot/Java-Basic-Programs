/*Write a program that solves the following equation and displays the value x and y:
        1) 3.4x+50.2y=44.5
        2) 2.1x+.55y=5.9
        (Assume Cramer’s rule to solve equation ax+by=e x=ed-bf/ad-bc cx+dy=f y=af-ec/ad-bc )*/

import java.util.Scanner;
public class practical1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("For equation 1");
        System.out.println("Enter the value of a:");
        double a = sc.nextDouble();
        System.out.println("Enter the value of b:");
        double b = sc.nextDouble();
        System.out.println("Enter the value of e:");
        double e = sc.nextDouble();

        System.out.println("For equation 2");
        System.out.println("Enter the value of c:");
        double c = sc.nextDouble();
        System.out.println("Enter the value of d:");
        double d = sc.nextDouble();
        System.out.println("Enter the value of f:");
        double f = sc.nextDouble();

        double x = ((e*d) - (b*f))/((a*d)-(b*c));
        double y = ((a*f) - (e*c))/((a*d)-(b*c));

        System.out.println("x:"+x);
        System.out.println("y:"+y);



    }

}
