package com.juaracoding;

public class operator {

    public static void main(String[] args) {

        int modulus = 80 % 9;
        System.out.println(modulus);

        int x = 2;
        int num1 = 10 * x++;
        System.out.println(num1);

        int y = 2;
        int num2 = 10 * ++y;
        System.out.println(num2);

        int a = 10;
        a += 5;   // a = a = 5; a = 10 + 5 = 15
        System.out.println(a);

        boolean relational = 5 > 9;
        System.out.println(relational);

        //Bitwise

        int num3 = 10 & 12;
        System.out.println(num3);

        int num4 = 181 >> 1;
        System.out.println(num4); // Shift Right

        int num5 = 108 << 1;
        System.out.println(num5);





    }
}
