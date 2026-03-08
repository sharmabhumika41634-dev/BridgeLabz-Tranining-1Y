package com.gla.method.Level2;
import java.util.Scanner;
public class Friends {
    public static int findYoungest(int[] age) {

        int min = age[0];

        for (int i = 1; i < age.length; i++)
            if (age[i] < min)
                min = age[i];

        return min;
    }

    public static int findTallest(int[] height) {

        int max = height[0];

        for (int i = 1; i < height.length; i++)
            if (height[i] > max)
                max = height[i];

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] age = new int[3];
        int[] height = new int[3];

        for (int i = 0; i < 3; i++) {

            System.out.print("Enter age of friend: ");
            age[i] = sc.nextInt();

            System.out.print("Enter height of friend: ");
            height[i] = sc.nextInt();
        }

        System.out.println("Youngest Age = " + findYoungest(age));
        System.out.println("Tallest Height = " + findTallest(height));
    }
}
