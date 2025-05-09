package com.juaracoding.oop;

public class Kotak {

    int sisi;

    protected Kotak() {
        sisi = 5;
    }
    protected Kotak(int sisi) {
        this.sisi = sisi;

    }
    protected void draw() {
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < sisi; j++) {
                System.out.print("$");


            }
            System.out.println();
        }

    }
}
