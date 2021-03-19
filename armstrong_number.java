import java.util.Scanner;
public class armstrong_number {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the any number here");
        int j = sc.nextInt();

        armstrong_number obj = new armstrong_number();
        obj.arm(j);

    }

    void arm(int n){
        int temp = n;
        int result=0;
        int a;
        while(n>0){
            a = n%10;
            n = n/10;
            result = result+(a*a*a);
        }
        if(temp == result){
            System.out.println(temp+"-Armstrong Number");
        }
        else {
            System.out.println(temp+"-Not Armstrong Number");
        }
    }
}
