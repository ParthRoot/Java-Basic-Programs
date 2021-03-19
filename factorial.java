import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here");
        int a = sc.nextInt();

        factorial fc = new factorial();
        fc.fact(a);
    }
    void fact(int m){
        int f = 1;
        for(int i=0;i<=m-1;i++){
            f = f * (i+1);
        }
        System.out.println("Factorial of " +m+ " = " +f);
    }
}
