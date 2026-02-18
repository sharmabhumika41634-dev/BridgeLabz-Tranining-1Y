package com.gla.String.Level2;
import java.util.Scanner;
public class SplitWithoutMethod {
    public static String[] splitText(String str) {

        int words = 1;
        for (int i = 0; ; i++) {
            try {
                if (str.charAt(i) == ' ')
                    words++;
            } catch (Exception e) {
                break;
            }
        }

        String[] result = new String[words];
        int index = 0;
        String temp = "";

        for (int i = 0; ; i++) {
            try {
                if (str.charAt(i) != ' ')
                    temp += str.charAt(i);
                else {
                    result[index++] = temp;
                    temp = "";
                }
            } catch (Exception e) {
                result[index] = temp;
                break;
            }
        }

        return result;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sentence: ");
        String input = sc.nextLine();

        String[] custom = splitText(input);
        String[] builtIn = input.split(" ");

        boolean same = compareArrays(custom, builtIn);

        System.out.println("Are both methods same? " + same);
    }
}
