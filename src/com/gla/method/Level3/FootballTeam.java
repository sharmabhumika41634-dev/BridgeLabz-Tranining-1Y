package com.gla.method.Level3;
import java.util.Scanner;
public class FootballTeam {
    public static int sum(int[] arr) {
        int s = 0;
        for (int i : arr)
            s += i;
        return s;
    }

    public static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static int shortest(int[] arr) {

        int min = arr[0];

        for (int i : arr)
            if (i < min)
                min = i;

        return min;
    }

    public static int tallest(int[] arr) {

        int max = arr[0];

        for (int i : arr)
            if (i > max)
                max = i;

        return max;
    }

    public static void main(String[] args) {

        int[] heights = new int[11];

        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101) + 150;
            System.out.println("Player " + (i + 1) + " height = " + heights[i]);
        }

        System.out.println("Mean Height = " + mean(heights));
        System.out.println("Shortest Height = " + shortest(heights));
        System.out.println("Tallest Height = " + tallest(heights));
    }

}
