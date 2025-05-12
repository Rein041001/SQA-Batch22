package com.juaracoding;

import java.util.Scanner;

public class Bioskop {
    // Array untuk menyimpan film
    static String[] films = new String[10];
    static int filmCount = 0; // Menghitung jumlah film yang telah ditambahkan

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Login
        if (login(scanner)) {
            // Jika login berhasil, tampilkan menu utama
            tampilkanMenu(scanner);
        } else {
            System.out.println("Login gagal! Program selesai.");
        }

        // Menutup scanner setelah selesai
        scanner.close();
    }

    // Method untuk login
    public static boolean login(Scanner scanner) {
        String username = "admin";
        String password = "12345";
        String inputUsername, inputPassword;

        // Proses login, selama username dan password salah, akan diminta ulang
        while (true) {
            System.out.print("Masukkan Username: ");
            inputUsername = scanner.nextLine();
            System.out.print("Masukkan Password: ");
            inputPassword = scanner.nextLine();

            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                System.out.println("Login berhasil!");
                return true; // Login berhasil
            } else {
                System.out.println("Username atau Password salah, coba lagi.");
            }
        }
    }

    // Method untuk menampilkan menu utama
    public static void tampilkanMenu(Scanner scanner) {
        int pilihan;

        // Menampilkan menu dan meminta pilihan pengguna
        do {
            System.out.println("\n=== Menu Utama ===");
            System.out.println("1. Tampilkan Daftar Film");
            System.out.println("2. Input Data Film");
            System.out.println("3. Cari Film");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi (1-4): ");
            // Validasi input menu
            while (!scanner.hasNextInt()) {
                System.out.println("Input tidak valid! Masukkan angka antara 1 dan 4.");
                scanner.next(); // Clear input yang salah
            }
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer input

            // Switch-case untuk memilih menu
            switch (pilihan) {
                case 1:
                    tampilkanFilm();
                    break;
                case 2:
                    inputFilm(scanner);
                    break;
                case 3:
                    cariFilm(scanner);
                    break;
                case 4:
                    System.out.println("Terima kasih, sampai jumpa!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 4); // Looping hingga pengguna memilih untuk keluar
    }

    // Method untuk menampilkan daftar film
    public static void tampilkanFilm() {
        if (filmCount == 0) {
            System.out.println("Tidak ada film yang tersedia.");
        } else {
            System.out.println("\nDaftar Film:");
            for (int i = 0; i < filmCount; i++) {
                System.out.println((i + 1) + ". " + films[i]);
            }
        }
    }

    // Method untuk input data film
    public static void inputFilm(Scanner scanner) {
        if (filmCount < films.length) {
            System.out.print("Masukkan judul film: ");
            films[filmCount] = scanner.nextLine();
            filmCount++;
            System.out.println("Film berhasil ditambahkan.");
        } else {
            System.out.println("Daftar film sudah penuh, tidak dapat menambah film baru.");
        }
    }

    // Method untuk mencari film
    public static void cariFilm(Scanner scanner) {
        System.out.print("Masukkan judul film yang ingin dicari: ");
        String judul = scanner.nextLine();
        boolean found = false;

        // Mencari film di dalam array
        for (int i = 0; i < filmCount; i++) {
            if (films[i].equalsIgnoreCase(judul)) {
                System.out.println("Film ditemukan: " + films[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Film tidak ditemukan.");
        }
    }
}