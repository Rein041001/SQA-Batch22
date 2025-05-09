package com.juaracoding;

import java.util.Scanner;

public class Latihan {

    public static void main(String[] args) {

        String email = "rein.wairata30@gmail.com";
        String phoneNumber = "081240800491";
        boolean isRegistered = false;
        boolean isOTPReceived = false;
        boolean isOTPExpired = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input email / nomor HP: ");
        String inEmailOrPhoneNumber = scanner.next();
        if (email.equals(inEmailOrPhoneNumber) || phoneNumber.equals(inEmailOrPhoneNumber)) {
            isRegistered = true;
            if (isRegistered) {
                isOTPReceived = true;
                if (isOTPReceived) {
                    System.out.println("Silahkan input OTP");
                    isOTPExpired = false;
                    if (isOTPExpired) {
                        System.out.println("Redirect ke Dashboard");
                    } else {
                        System.out.println("OTP Expired");
                    }
                } else {
                    System.out.println("Kirim ulang OTP");
                }

            }

        } else {
            System.out.println("Email / Nomor HP belum terdaftar");
        }

    }
}
