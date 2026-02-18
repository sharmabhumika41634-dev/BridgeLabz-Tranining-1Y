package com.gla.String.Level2;
import java.util.Scanner;
public class VowelsAndConsonats {
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

    public static int[] countVC(String str) {
        int vowel = 0, consonant = 0;

        for (int i = 0; i < str.length(); i++) {
            String type = checkChar(str.charAt(i));
            if (type.equals("Vowel"))
                vowel++;
            else if (type.equals("Consonant"))
                consonant++;
        }
        return new int[]{vowel, consonant};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int[] result = countVC(input);

        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }
}
