package com.gla.method.Level3;
import java.util.Scanner;
public class NumberChecker6 {
    public static int sumFactors(int n) {

        int sum = 0;

        for (int i = 1; i < n; i++)
            if (n % i == 0)
                sum += i;

        return sum;
    }

    public static boolean isPerfect(int n) {
        return sumFactors(n) == n;
    }

    public static boolean isAbundant(int n) {
        return sumFactors(n) > n;
    }

    public static boolean isDeficient(int n) {
        return sumFactors(n) < n;
    }

    public static int factorial(int n) {

        int f = 1;

        for (int i = 1; i <= n; i++)
            f *= i;

        return f;
    }

    public static boolean isStrong(int n) {

        int temp = n;
        int sum = 0;

        while (n > 0) {

            int d = n % 10;
            sum += factorial(d);
            n /= 10;
        }

        return sum == temp;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.println("Perfect = " + isPerfect(num));
        System.out.println("Abundant = " + isAbundant(num));
        System.out.println("Deficient = " + isDeficient(num));
        System.out.println("Strong = " + isStrong(num));
    }

}
