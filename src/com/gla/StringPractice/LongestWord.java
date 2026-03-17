package com.gla.StringPractice;
import java.util.Scanner;
public class LongestWord {
    public static String findLongest(String str) {
        String[] words = str.split(" ");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length())
                longest = word;
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sentence: ");
        String str = sc.nextLine();
        System.out.println("Longest Word: " + findLongest(str));
    }
}
