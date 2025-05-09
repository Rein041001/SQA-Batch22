package com.juaracoding;

import java.util.Scanner;

public class whileDo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int item = 0;
        while (item < 5) {
            ++item;
            if (item == 2) continue;
            sum += item;

        }
        System.out.println(sum);


        int pin = 123;
        boolean isBlocked = false;
        int count = 0;
        int maxLooping = 3;

        do {
            System.out.println("Input pin = ");
            int inPin = scanner.nextInt();
            if (inPin == pin) break;
            count++;
            if (count == maxLooping) isBlocked = true;
        } while (count < maxLooping); // 3x false

        if (!isBlocked) {
            System.out.println("Lanjutkan Transaksi");
        } else {
            System.out.println("Pin diblokir sementara");
        }

    }
}
