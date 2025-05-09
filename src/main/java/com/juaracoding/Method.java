package com.juaracoding;

public class Method {

    public static void main(String[] args) {
        detailProducts("stick fury", 40, 200000, 2);
        detailProducts("stick predator", 50, 20930, 3);
        detailProducts("stick mezz", 200, 9240941, 5);


    }

    // custom method
    private static void detailProducts(String productName, int stock, double price, int minBuy) {
        System.out.println("nama product: " + productName.toUpperCase());
        System.out.println("jumlah stock:" + stock);
        System.out.println("price:" + price);
        System.out.println("min pembelian:" + minBuy);

        if (stock < 100) {
            System.out.println("peringatan : stock hampir habis");

        }
        System.out.println();
    }

    public static int minBuy() {
        return 1;


    }


    }




