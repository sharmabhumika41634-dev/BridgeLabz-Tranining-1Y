package com.gla.method.Level3;
import java.util.Scanner;
public class NumberChecker {
    public static int countDigits(int n) {

        int count = 0;

        while (n != 0) {
            count++;
            n /= 10;
        }

        return count;
    }

    public static int[] getDigits(int n) {

        int count = countDigits(n);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }

        return digits;
    }

    public static boolean isDuck(int[] digits) {

        for (int i : digits)
            if (i == 0)
                return true;

        return false;
    }

    public static boolean isArmstrong(int n, int[] digits) {

        int power = digits.length;
        int sum = 0;

        for (int i : digits)
            sum += Math.pow(i, power);

        return sum == n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int[] digits = getDigits(num);

        System.out.println("Digits count = " + countDigits(num));

        if (isDuck(digits))
            System.out.println("Duck Number");
        else
            System.out.println("Not Duck Number");

        if (isArmstrong(num, digits))
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }

}
