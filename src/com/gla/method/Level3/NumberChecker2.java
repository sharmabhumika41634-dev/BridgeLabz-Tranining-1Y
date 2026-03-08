package com.gla.method.Level3;
import java.util.Scanner;
public class NumberChecker2 {
    public static int[] getDigits(int n) {

        int count = String.valueOf(n).length();
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }

        return digits;
    }

    public static int sumDigits(int[] digits) {

        int sum = 0;

        for (int i : digits)
            sum += i;

        return sum;
    }

    public static double sumSquares(int[] digits) {

        double sum = 0;

        for (int i : digits)
            sum += Math.pow(i, 2);

        return sum;
    }

    public static boolean isHarshad(int n, int sum) {
        return n % sum == 0;
    }

    public static void frequency(int[] digits) {

        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++)
            freq[i][0] = i;

        for (int d : digits)
            freq[d][1]++;

        for (int i = 0; i < 10; i++)
            if (freq[i][1] > 0)
                System.out.println("Digit " + freq[i][0] + " -> " + freq[i][1]);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int[] digits = getDigits(num);

        int sum = sumDigits(digits);

        System.out.println("Sum of digits = " + sum);
        System.out.println("Sum of squares = " + sumSquares(digits));

        if (isHarshad(num, sum))
            System.out.println("Harshad Number");
        else
            System.out.println("Not Harshad Number");

        frequency(digits);
    }

}
