/*
Assume a vehicle plate number consists of three uppercase letters followed by four digits.
Write a program to generate a plate number.
 */

import java.lang.Math;

public class practical7 {
    public static void main(String[] args) {
        char a1 = (char)('A'+(int)(Math.random()*('Z'-'A')));
        char a2 = (char)('A'+(int)(Math.random()*('Z'-'A')));
        char a3 = (char)('A'+(int)(Math.random()*('Z'-'A')));

        int n1 = (int)(Math.random()*10);
        int n2 = (int)(Math.random()*10);
        int n3 = (int)(Math.random()*10);
        int n4 = (int)(Math.random()*10);

        System.out.println("PlateNumber:-"+a1+a2+a3+n1+n2+n3+n4);

        // lower latter
        char n = (char)('a'+(int)(Math.random()*('z' - 'a')));
        System.out.println(n);
    }
}
