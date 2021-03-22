import java.lang.Math;
import java.util.Scanner;
public class random_value {
    public static void main(String[] args) {
        System.out.println("Generate Random Number");
        System.out.println(Math.random());
        Scanner sc =  new Scanner(System.in);
        // generate random number in between two number
        System.out.println("Enter the number 1:");
        int a = sc.nextInt();
        System.out.println("Enter the number 2:");
        int b = sc.nextInt();

        int rand = (int) (Math.random()*(b-a+1)+a);
        System.out.println("Random Number:-"+rand);

        double rand1 = Math.random()*(b - a+1)+a;
        System.out.println("Random Number:-"+rand1);
    }
}
