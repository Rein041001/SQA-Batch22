package com.juaracoding.oop;

public class MainApp {
    public static void main(String[] args) {

        Fruit apple = new Fruit(100,52);
        apple.grams = 100;
        apple.calsPerGram = 52;
        System.out.println(apple.totalCalories());

        Fruit mango = new Fruit(200,120);
        mango.grams = 200;
        mango.calsPerGram = 120;
        System.out.println(mango.totalCalories());

        Kotak kotak1 = new Kotak(10);
        kotak1.draw();

        Kotak kotak2 = new Kotak(20);
        kotak2.draw();

        Car byd = new Car("Listrik");
        byd.setTahunPembuatan(2025);
        byd.displaySpec();

        Car BMW = new Car("Pertamax");
        BMW.setTahunPembuatan(2024);
        BMW.displaySpec();



    }
}
