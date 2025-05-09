package com.juaracoding.oop;

public class Car {
    private    String bahanBakar;
    private int tahunPembuatan = 2000;

    protected Car (String bahanBakar){
        this.bahanBakar = bahanBakar;
    }
    protected void setTahunPembuatan(int tahunPembuatan){
        this.tahunPembuatan = tahunPembuatan;
    }
protected void displaySpec(){
    System.out.println(bahanBakar);
    System.out.println(tahunPembuatan);
}
}
