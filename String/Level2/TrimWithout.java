package com.gla.String.Level2;
import java.util.Scanner;
public class TrimWithout {
    public static int[] findTrimIndexes(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (str.charAt(start) == ' ')
            start++;

        while (str.charAt(end) == ' ')
            end--;

        return new int[]{start, end};
    }

    public static String createSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++)
            result += str.charAt(i);
        return result;
    }

    public static boolean compare(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++)
            if (s1.charAt(i) != s2.charAt(i))
                return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int[] index = findTrimIndexes(input);
        String custom = createSubstring(input, index[0], index[1]);
        String builtIn = input.trim();

        System.out.println(compare(custom, builtIn));
    }
}
