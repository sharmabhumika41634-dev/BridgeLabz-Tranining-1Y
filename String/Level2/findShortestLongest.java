package com.gla.String.Level2;
import java.util.Scanner;
public class findShortestLongest {
    public static String[] splitText(String str) {
        int words = 1;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == ' ')
                words++;

        String[] result = new String[words];
        int index = 0;
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ')
                temp += str.charAt(i);
            else {
                result[index++] = temp;
                temp = "";
            }
        }
        result[index] = temp;
        return result;
    }

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

    public static String[][] wordWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static int[] findShortestLongest(String[][] arr) {
        int min = Integer.parseInt(arr[0][1]);
        int max = min;

        for (int i = 1; i < arr.length; i++) {
            int len = Integer.parseInt(arr[i][1]);
            if (len < min)
                min = len;
            if (len > max)
                max = len;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] words = splitText(input);
        String[][] data = wordWithLength(words);
        int[] result = findShortestLongest(data);

        System.out.println("Shortest Length: " + result[0]);
        System.out.println("Longest Length: " + result[1]);
    }
}
