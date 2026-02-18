package com.gla.String.Level3;
import java.util.Scanner;
public class UniqueCharacters {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    public static char[] uniqueChars(String text) {
        int len = findLength(text);
        char[] temp = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                temp[index++] = text.charAt(i);
            }
        }

        char[] result = new char[index];
        for (int i = 0; i < index; i++)
            result[i] = temp[i];

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        char[] result = uniqueChars(text);

        System.out.print("Unique Characters: ");
        for (char c : result)
            System.out.print(c + " ");
    }
}
