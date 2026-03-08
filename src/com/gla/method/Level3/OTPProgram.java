package com.gla.method.Level3;
import java.util.Scanner;
public class OTPProgram {
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    public static void main(String[] args) {

        int[] otp = new int[10];

        for (int i = 0; i < 10; i++) {

            otp[i] = generateOTP();

            System.out.println("OTP " + (i + 1) + " = " + otp[i]);
        }
    }
}
