package com.juaracoding;

import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {

        int tinggi = 10;

        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("$");
            }
            System.out.println();
        }

    }
}
