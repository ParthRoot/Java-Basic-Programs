/*
Write a program that reads an integer and displays all its smallest factors in increasing order.
For example if input number is 120, the output should be as follows:2,2,2,3,5.
 */

import java.util.Scanner;

public class practical8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here");
        int n = sc.nextInt();
        int a = n;
        int h = 2;
        for(int i=2;i<10;i++){

            if(n%h == 0){
                System.out.print(h+",");
                n = n/h;
            }
            else{
                h = h + 1;
            }

        }
    }
}
