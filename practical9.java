import java.util.Scanner;
public class practical9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num 1:");
        int n1 = sc.nextInt();
        System.out.println("Entet the num 2:");
        int n2 = sc.nextInt();

        while(n1 != n2){
            if(n1 > n2){
                n1 = n1 - n2;
            }
            else{
                n2 = n2 - n1;
            }
        }
        System.out.println("GCD:-"+n1);

    }
}
