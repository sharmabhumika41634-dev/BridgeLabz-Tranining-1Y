package com.gla.StringPractice;
import java.util.Scanner;
public class ReplaceString {
    public static String replace(String str, char oldChar, char newChar) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == oldChar)
                result += newChar;
            else
                result += str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.print("Enter old char: ");
        char oldChar = sc.next().charAt(0);

        System.out.print("Enter new char: ");
        char newChar = sc.next().charAt(0);

        System.out.println("Result: " + replace(str, oldChar, newChar));
    }
}
