package com.gla.String.Level2;
import java.util.Scanner;
public class StringLengthWithoutMethod {

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String input = sc.next();

        int userLength = findLength(input);
        int builtInLength = input.length();

        System.out.println("Length (Without length method): " + userLength);
        System.out.println("Length (Using built-in): " + builtInLength);
    }
}
