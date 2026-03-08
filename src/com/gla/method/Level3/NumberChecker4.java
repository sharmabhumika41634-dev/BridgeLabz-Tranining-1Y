package com.gla.method.Level3;
import java.util.Scanner;
public class NumberChecker4 {
    public static int reverseNumber(int n) {

        int rev = 0;

        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        return rev;
    }

    public static boolean isPalindrome(int n) {
        return n == reverseNumber(n);
    }

    public static boolean isDuck(int n) {

        while (n > 0) {

            if (n % 10 == 0)
                return true;

            n /= 10;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.println("Reverse = " + reverseNumber(num));

        if (isPalindrome(num))
            System.out.println("Palindrome Number");
        else
            System.out.println("Not Palindrome");

        if (isDuck(num))
            System.out.println("Duck Number");
        else
            System.out.println("Not Duck Number");
    }

}
