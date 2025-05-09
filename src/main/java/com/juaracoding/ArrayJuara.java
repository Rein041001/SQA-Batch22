package com.juaracoding;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayJuara {
    public static void main(String[] args) {

        // Cara 1
        int[] angka = {1, 2, 3, 4, 5};
        System.out.println(angka[3]);

        //cara 2
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        System.out.println(numbers[3]);

        Arrays.sort(numbers);
        for (int number : numbers){
            System.out.println(numbers);
        }

        Scanner scanner = new Scanner(System.in);

        // Masukan Jumlah data = 5
        // price [] = input harga, sekalian totalkan

        System.out.println("masukan jumlah barang");
        int jumlah = scanner.nextInt();
        int[] price = new int[jumlah];
        // looping,assigntment value, operator+=
        int totalPrice = 0;
        for (int i = 0; i < price.length; i++) {
            System.out.println("masukan harga");
            price[i] = scanner.nextInt();
            totalPrice += price[i];

        }
        System.out.println("total harga = " + totalPrice);

        //forEach

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars) {
            System.out.println(car);

        }

        int [][] num = {{1,2,3,4},{5,6,7}};
        System.out.println(num [0][3]);
        System.out.println(num [1][1]);



    }
}
