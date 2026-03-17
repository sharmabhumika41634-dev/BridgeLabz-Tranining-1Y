package com.gla.FunctionPractice.Level2;
import java.util.Scanner;
public class Palindrome {
    static String getInput(Scanner sc) {
        return sc.nextLine();
    }

    static boolean isPalindrome(String str) {
        String rev = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(rev);
    }

    static void displayResult(boolean result) {
        if (result)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = getInput(sc);

        displayResult(isPalindrome(str));
    }
}
