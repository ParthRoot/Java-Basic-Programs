import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any number here");
        int a = sc.nextInt();
        boolean flag = true;
        if (a == 0 || a == 1 || a == 4) {
            System.out.println(a + "-Not Prime Number");
            flag = false;
        } else {
            for (int i = 2; i < a / 2; i++) {
                if (a % i == 0) {
                    flag = false;
                    System.out.println(a + "-Not Prime Number");
                    break;
                }
            }
            if (flag) {
                System.out.println(a + "-Is Prime Number");
            }
        }
    }
}
