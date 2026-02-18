package com.gla.String.Level2;
import java.util.Scanner;
public class DisplayCharacter2DArray {
public static String checkChar(char ch) {
    if (ch >= 'A' && ch <= 'Z')
        ch = (char) (ch + 32);

    if (ch >= 'a' && ch <= 'z') {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return "Vowel";
        else
            return "Consonant";
    }
    return "Not Letter";
}

public static String[][] charType(String str) {
    String[][] result = new String[str.length()][2];

    for (int i = 0; i < str.length(); i++) {
        result[i][0] = String.valueOf(str.charAt(i));
        result[i][1] = checkChar(str.charAt(i));
    }
    return result;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    String[][] data = charType(input);

    for (int i = 0; i < data.length; i++)
        System.out.println(data[i][0] + "\t" + data[i][1]);
}
}
