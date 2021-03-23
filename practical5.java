/*
Write a program that prompts the user to enter three integers and display the integers in decreasing order.
 */
import java.util.Scanner;
public class practical5 {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc =  new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr = new int[m];

        System.out.print("Enter the array element here:");
        for(int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }

        practical5 obj = new practical5();
        obj.descending(arr);

        obj.display(arr);





    }

    void descending(int arr[]){
        for(int i=0; i<arr.length-1;i++){
            for(int j=0; j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    void display(int arr[]){
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+",");
        }
    }
}
