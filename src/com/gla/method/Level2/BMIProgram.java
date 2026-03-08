package com.gla.method.Level2;
import java.util.Scanner;
public class BMIProgram {
    public static double calculateBMI(double weight, double heightCm) {

        double heightM = heightCm / 100;
        return weight / (heightM * heightM);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double weight, height, bmi;

        for (int i = 1; i <= 10; i++) {

            System.out.print("Enter weight (kg): ");
            weight = sc.nextDouble();

            System.out.print("Enter height (cm): ");
            height = sc.nextDouble();

            bmi = calculateBMI(weight, height);

            System.out.println("BMI = " + bmi);
        }
    }

}
