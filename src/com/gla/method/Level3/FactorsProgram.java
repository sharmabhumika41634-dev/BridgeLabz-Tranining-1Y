package com.gla.method.Level3;
import java.util.Scanner;
public class FactorsProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int sum = 0;
        int product = 1;

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {

                System.out.println("Factor = " + i);

                sum += i;
                product *= i;
            }
        }

        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
    }
}
