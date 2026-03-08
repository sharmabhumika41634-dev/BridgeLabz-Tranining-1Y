package com.gla.method.Level2;
import java.util.Scanner;
public class FactorsProgram {
    public static int[] findFactors(int n) {

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                factors[index++] = i;
        }

        return factors;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr)
            sum += i;
        return sum;
    }

    public static int product(int[] arr) {
        int product = 1;
        for (int i : arr)
            product *= i;
        return product;
    }

    public static double sumOfSquares(int[] arr) {
        double sum = 0;
        for (int i : arr)
            sum += Math.pow(i, 2);
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int[] factors = findFactors(n);

        System.out.println("Factors:");
        for (int i : factors)
            System.out.print(i + " ");

        System.out.println("\nSum = " + sum(factors));
        System.out.println("Product = " + product(factors));
        System.out.println("Sum of Squares = " + sumOfSquares(factors));
    }
}
